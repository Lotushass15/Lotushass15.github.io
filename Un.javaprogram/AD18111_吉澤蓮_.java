
import java.util.Random;
import java.util.Scanner;

public class AD18111_�g�V�@_ {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner stdln = new Scanner(System.in);
		
		int num = rand.nextInt(1000);
		
		System.out.println("�������ăQ�[����");
		System.out.println("0�`999�̐��𓖂ĂĂ�������");
		for(int i = 0; i<10; i++);
		int x; //���͂�����
		do{
			System.out.println("�������ȁH:");
			x = stdln.nextInt();
			
			if(x<num && x<500)
				System.out.println("�����Ƒ傫�Ȑ��ł��B�q���g:500���傫���ł�");
			else if(x>num && x>500)
				System.out.println("�����Ə����Ȑ��ł��B�q���g:500��菬�����ł�");
		}while(x!=num);
		
		System.out.println("�����ł��B");
	}

	}

