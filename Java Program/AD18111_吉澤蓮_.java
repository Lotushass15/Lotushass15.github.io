
import java.util.Random;
import java.util.Scanner;

public class AD18111_吉澤蓮_ {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner stdln = new Scanner(System.in);
		
		int num = rand.nextInt(1000);
		
		System.out.println("☆数当てゲーム☆");
		System.out.println("0〜999の数を当ててください");
		for(int i = 0; i<10; i++);
		int x; //入力した数
		do{
			System.out.println("いくつかな？:");
			x = stdln.nextInt();
			
			if(x<num && x<500)
				System.out.println("もっと大きな数です。ヒント:500より大きいです");
			else if(x>num && x>500)
				System.out.println("もっと小さな数です。ヒント:500より小さいです");
		}while(x!=num);
		
		System.out.println("正解です。");
	}

	}

