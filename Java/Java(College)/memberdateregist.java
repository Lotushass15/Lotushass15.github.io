
 class memberdateregist {

	private String name;		// ���O
	private int no;		// ����ԍ�
	private int age;		// �N��
    private String address;    //�Z��
    
	memberdateregist(String name, int no, int age, String address) {
		this.name = name;
		this.no = no;
		this.age = age;
		this.address = address;
	}
 

	void print() {
		System.out.println("No." + no + "�F" + name +
								 "�i" + age + "�΁j");	
		System.out.println("�Z��:" +address);
	}	
 }
	


