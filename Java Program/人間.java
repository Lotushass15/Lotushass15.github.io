import java.util.Date;

public class �l�� {
	private String ���O;

	private Date ���N����;

	private int ����;

	private double �g��;

	public �l��() {
	}

	public �l��(String ���O) {
		this.���O = ���O;
	}

	public �l��(String ���O, double �g��) {
		this.���O = ���O;
		this.�g�� = �g��;
	}

	public void ���ȏЉ��() {
		System.out.println("���̖��O��" + ���O + "�ł��B�g����" + �g�� + "cm�ł��B");
	}

	public double get�g��() {
		return �g��;
	}

	public void set�g��(double �g��) {
		this.�g�� = �g��;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public Date get���N����() {
		return ���N����;
	}

	public void set���N����(Date ���N����) {
		this.���N���� = ���N����;
	}

	public String get���O() {
		return ���O;
	}

	public void set���O(String ���O) {
		this.���O = ���O;
	}
}