
public class AD18111_�g�V�@_�A�J�E���g {
public static void main(String[] args){
	private static int counter = 0;		//
	private String name;			// 
	private String no;			// 
	private long balance;		//
	private int id;				// 

	//-- �R���X�g���N�^ --//
	public Account(String n, String num, long z) {
		name = n;					// 
		no = num;					// 
		balance = z;				// 
		id = ++counter;			// 
	}

	//--- �������`���擾 ---//
	public String getName() {
		return name;
	}

	//--- �����ԍ����擾 ---//
	public String getNo() {
		return no;
	}

	//--- �a���c�����擾 ---//
	public long getBalance() {
		return balance;
	}

	//--- ���ʔԍ����擾 ---//
	public int getId() {
		return id;
	}

	//--- k�~�a���� ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- k�~���낷 ---//
	public void withdraw(long k) {
		balance -= k;

	}

}
