import java.util.Scanner;
public class AD18111_�g�V�@_if {
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("����x:"); int x = stdln.nextInt();
		System.out.print("����y:"); int y = stdln.nextInt();
		if(x < y ){
			int t = x;
			x = y;
			y = t;
		}
		System.out.println("x>=�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�x��"+x+"�ł��B");
		System.out.println("�ϐ�y��"+y+"�ł��B");
	}

}
