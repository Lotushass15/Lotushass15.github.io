class Pet {
	private String name;		// �y�b�g�̖��O
	private String masterName;	// ������̖��O

	// �R���X�g���N�^
	public Pet(String name, String masterName) {
		this.name = name;			// �y�b�g�̖��O
		this.masterName = masterName;		// ������̖��O
	}
	// �y�b�g�̖��O�𒲂ׂ�
	public String getName() { return name; }
	// ������̖��O�𒲂ׂ�
	public String getMasterName() { return masterName; }
	// ���ȏЉ�
	public void introduce() {
		System.out.println("���l�̖��O��" + name + "�ł��I"); 
		System.out.println("������l�l��" + masterName + "�ł��I");
	}
}

class RobotPet extends Pet {
	// �R���X�g���N�^
	public RobotPet(String name, String masterName) {
		super(name, masterName);		// �X�[�p�[�N���X�̃R���X�g���N�^
	}

	// ���ȏЉ�
	public void introduce() {
		System.out.println("�����̓��{�b�g�B���O��" + getName() + "�B"); 
		System.out.println("������l�l��" + getMasterName() + "�B");
	}

	// �Ǝ�������
	public void work(int sw) {
		switch (sw) {
		 case 0: System.out.println("�|�����܂��B"); break;
		 case 1: System.out.println("���󂵂܂��B"); break;
		 case 2: System.out.println("�������܂��B"); break;
		}
	}
}
