import java.util.Scanner;
public class AD18111_�g�V�@_�z�� {
	
public static void main(String[] args) {
		
	Scanner stdln = new Scanner(System.in);
	System.out.print("�l������͂���:");
	 int ninzu  = stdln.nextInt();
	 int sum = 0;
    int[] tensu = new int[ninzu];
    System.out.println(ninzu+ "�l�̓_������͂���");
     for(int i = 0; i<ninzu; i++){
    	 System.out.print((i+1)+ "�Ԗڂ̓_��:");
    	 tensu[i] = stdln.nextInt();
    	 sum += tensu[i];
     }
      System.out.println("���v�_��:" + sum + "�_�ł��B");
      System.out.println("���ϓ_��:" + sum/ninzu + "�_�ł��B");
	  int max = tensu[0];
	  for(int i =1; i<tensu.length; i++){
		  if(tensu[i]>max)max = tensu[i];
		  
	  }
	  System.out.println("�ō��_��:" +max+ "�_�ł��B");
	  int min = tensu[1];
	  for(int i =1; i<tensu.length; i++){
		  if(tensu[i]<min)min = tensu[i];
		 
	  }
	
	  System.out.println("�Œ�_��:" + min +"�_�ł��B");
	
	
	
	}

}
