
		import java.util.Scanner;
		public class AD18111_吉澤蓮_while {
			public static void main(String[] args) {
				
			Scanner stdln = new Scanner(System.in);
				
			
				System.out.println("９以上かつ１５未満の整数を入力してください。$を表示します:");
				int n = stdln.nextInt();
				
				int i =9; int j =15;
				while(i<n && n<j){
					System.out.println("$");
							
				i++; j++;
				}
				System.out.println();
	}

}
		
