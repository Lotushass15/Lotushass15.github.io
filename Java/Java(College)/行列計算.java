import java.util.Random;
import java.util.Scanner;
public class AD18111_�g�V�@_�s��v�Z{
	public static void main(String[] args) {
		
		System.out.println("4�s3��s��̐ς��v�Z���܂�");
		System.out.println("�e�s��̗v�f����͂��Ă�������:");
		Scanner stdln = new Scanner(System.in);
				
		
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		
		for(int i =0; i<4; i++){
			for(int j =0; j<3; j++){
				System.out.println("�s��P["+(i+1)+"]["+(j+1)+"]�̒l");
				a[i][j] = stdln.nextInt();
				
				
	}	
	}
		for(int i =0; i<3; i++){
			for(int j =0; j<4; j++){
				System.out.println("�s��2["+(i+1)+"]["+(j+1)+"]�̒l");
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
				System.out.println("�v�Z����["+(i+1)+"]["+(j+1)+"]="+c[i][j]);
}
	}
}
}