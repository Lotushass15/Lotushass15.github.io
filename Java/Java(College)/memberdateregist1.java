import java.util.Scanner;
public class AD18111_吉澤蓮_member1{
public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
	System.out.println("氏名を入力してください");
	String name = stdln.next();
	System.out.println("年齢を入力してください");
	int age = stdln.nextInt();
	System.out.println("番号を入力してください");
	int no = stdln.nextInt();
	System.out.println("住所を入力してください");
	String address = stdln.next();
	
	memberdateregist information = new memberdateregist(name, age, no, address);
	System.out.println("登録しました");
	 information.print();
	}

}
