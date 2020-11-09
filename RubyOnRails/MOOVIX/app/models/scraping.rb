class Scraping
  def self.movie_urls
    links = []
    agent = Mechanize.new
    next_url = ""

    while true
      current_page = agent.get("http://review-movie.herokuapp.com" + next_url)
      elements = current_page.search('.entry-title a')
      elements.each do |ele|
        links << ele.get_attribute('href')
      end

      next_link = current_page.at('.pagination .next a')
      break unless next_link
      next_url = next_link.get_attribute('href')

    end
    links.each do |link|
      get_product('http://review-movie.herokuapp.com' + link)
    end
  end

  def self.get_product(link)
    agent = Mechanize.new
    current_page = agent.get(link)
    title = current_page.at('.entry-title').inner_text
    image_url = current_page.at('.entry-content img')[:src] if current_page.at('.entry-content img')
    director = current_page.at('.director span').inner_text if current_page.at(".director span")
    detail = current_page.at('.entry-content p').inner_text if current_page.at(".entry-content p")
    open_date = current_page.at('.date span').inner_text if current_page.at(".date span")
    
    product = Product.where(title: title).first_or_initialize
    product.image_url = image_url
    product.director = director
    product.detail = detail
    product.open_date = open_date
    product.save
  end
end