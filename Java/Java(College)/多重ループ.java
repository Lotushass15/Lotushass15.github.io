import java.util.Scanner;
public class AD18111_�g�V�@_���d���[�v {
		public static void main(String[] args) {
			Scanner stdln = new Scanner(System.in);
			System.out.println("�����l����͂��Ă�������:");
			int x = stdln.nextInt();
			System.out.println(x+"��100�����ɂȂ�悤�ɂW�����Z���Ă����܂��B");
			do{
				System.out.println("x=" +x);
				x +=8;				
			}while(x<100);
			System.out.println("�������I�����܂���");
	
			System.out.println("���ɍ������p�̎O�p�`��\�����܂��B");
			System.out.print("�i����:");
			int n = stdln.nextInt();
			
			for( int i = 1; i<=n; i++){
				for(int j = 1; j<=i; j++)
					System.out.print('*');
				System.out.println();
			
			
			
			
			
	}

}
}

