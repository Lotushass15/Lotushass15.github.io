import java.util.Random;
import java.util.Scanner;
public class AD18111_吉澤蓮_行列計算{
	public static void main(String[] args) {
		
		System.out.println("4行3列行列の積を計算します");
		System.out.println("各行列の要素を入力してください:");
		Scanner stdln = new Scanner(System.in);
				
		
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		
		for(int i =0; i<4; i++){
			for(int j =0; j<3; j++){
				System.out.println("行列１["+(i+1)+"]["+(j+1)+"]の値");
				a[i][j] = stdln.nextInt();
				
				
	}	
	}
		for(int i =0; i<3; i++){
			for(int j =0; j<4; j++){
				System.out.println("行列2["+(i+1)+"]["+(j+1)+"]の値");
				b[i][j] = stdln.nextInt();
				
		
		
	}
}
		
		for(int i =0; i<4; i++){
			for(int j =0; j<4; j++){
		int tasu =0;
		for(int k= 0; k<3; k++){
			
			tasu += a[i][k]*b[k][j];
		}
		
		c[i][j] = tasu;
	}
			
	
}
		for(int i =0; i<4; i++){
			for(int j =0; j<4; j++){
				System.out.println("計算結果["+(i+1)+"]["+(j+1)+"]="+c[i][j]);
}
	}
}
}