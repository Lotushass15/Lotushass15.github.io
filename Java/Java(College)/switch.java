import java.util.Scanner;
public class AD18111_吉澤蓮_switch{
	public static void main(String[] args) {
Scanner stdln = new Scanner(System.in);

System.out.print("整数を入力せよ");
int season = stdln.nextInt();

 switch (season) {
 case 1:System.out.println("冬"); break;
 case 2:System.out.println("冬"); break;
 case 3:System.out.println("春"); break;
 case 4: System.out.println("春"); break;
 case 5:System.out.println("春"); break;
 case 6:System.out.println("夏"); break;
 case 7:System.out.println("夏"); break;
 case 8:System.out.println("夏"); break;
 case 9:System.out.println("秋"); break;
 case 10:System.out.println("秋"); break;
 case 11:System.out.println("秋"); break;
 case 12:System.out.println("冬"); break;
 default:System.out.println("１~12の数字の範囲で入力してください。"); break;
 

	}
	}
}
