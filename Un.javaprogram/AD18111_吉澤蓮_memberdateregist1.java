import java.util.Scanner;
public class AD18111_�g�V�@_member1{
public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
	System.out.println("��������͂��Ă�������");
	String name = stdln.next();
	System.out.println("�N�����͂��Ă�������");
	int age = stdln.nextInt();
	System.out.println("�ԍ�����͂��Ă�������");
	int no = stdln.nextInt();
	System.out.println("�Z������͂��Ă�������");
	String address = stdln.next();
	
	memberdateregist information = new memberdateregist(name, age, no, address);
	System.out.println("�o�^���܂���");
	 information.print();
	}

}
