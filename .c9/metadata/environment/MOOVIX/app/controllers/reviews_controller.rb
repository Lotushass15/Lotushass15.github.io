{"filter":false,"title":"reviews_controller.rb","tooltip":"/MOOVIX/app/controllers/reviews_controller.rb","undoManager":{"mark":8,"position":8,"stack":[[{"start":{"row":1,"column":2},"end":{"row":2,"column":0},"action":"insert","lines":["",""],"id":2},{"start":{"row":2,"column":0},"end":{"row":2,"column":2},"action":"insert","lines":["  "]}],[{"start":{"row":1,"column":2},"end":{"row":1,"column":47},"action":"insert","lines":["before_action :authenticate_user!, only: :new"],"id":3}],[{"start":{"row":1,"column":47},"end":{"row":2,"column":0},"action":"insert","lines":["",""],"id":4},{"start":{"row":2,"column":0},"end":{"row":2,"column":2},"action":"insert","lines":["  "]}],[{"start":{"row":15,"column":3},"end":{"row":15,"column":23},"action":"remove","lines":[" params.require(:rev"],"id":5}],[{"start":{"row":15,"column":3},"end":{"row":15,"column":80},"action":"remove","lines":["iew).permit(:nickname, :rate, :review).merge(product_id: params[:product_id])"],"id":6}],[{"start":{"row":15,"column":3},"end":{"row":15,"column":121},"action":"insert","lines":["params.require(:review).permit(:rate, :review).merge(product_id: params[:product_id], nickname: current_user.nickname)"],"id":7}],[{"start":{"row":15,"column":3},"end":{"row":15,"column":4},"action":"insert","lines":[" "],"id":8}],[{"start":{"row":15,"column":4},"end":{"row":15,"column":122},"action":"remove","lines":["params.require(:review).permit(:rate, :review).merge(product_id: params[:product_id], nickname: current_user.nickname)"],"id":9}],[{"start":{"row":15,"column":4},"end":{"row":15,"column":115},"action":"insert","lines":["params.require(:review).permit(:rate, :review).merge(product_id: params[:product_id], user_id: current_user.id)"],"id":10}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":14,"column":19},"end":{"row":14,"column":19},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1592567584758,"hash":"3324c304a500e0fd2c788080924a59f791560569"}