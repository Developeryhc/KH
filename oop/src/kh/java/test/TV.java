package kh.java.test;

public class TV {
	// �Ӽ� : ũ��, ����, ����, ä��				�� ����
	// ũ�� �� Data Type : int, 		Variable Name : size
	// ���� �� Data Type : boolean,	Variable Name : power
	// ���� �� Data Type : int,		Variable Name : vol
	// ä�� �� Data Type : int,		Variable Name : ch
	// ���� ������ ���� �� �ڵ����� �ʱ�ȭ
	// ���� (����*4, �Ǽ�*2) �� 0, ���� �� (''), �� �� false, ������ �� null
	int size;		// 0		��
	boolean power;	// false	�� 
	int vol;		// 0		��
	int ch;			// 0		��
	
	// ��� : ���� On/Off, ���� ����, ä�� ����		�� �޼ҵ�
	// ���� On/Off	 �� Method Name : power
	// ��������		 �� Method Name : volUp(), vodDown()
	// ä�κ���		 �� Method Name : chUp(), chDown(), chChange()
	
	public void power() {
		power = !power;
		if(power) {
			System.out.println("������ �������ϴ�.");
		}else {
			System.out.println("������ �������ϴ�.");
		}
	}
	public void volUp() {
		if(vol != 100) {
			vol++;
		}
		System.out.println("���� ���� : "+vol);
	}
	public void volDown() {
		if(vol != 0) {
			vol--;
		}
		System.out.println("���� ���� : "+vol);
	}
	public void chUp() {
		if( ch != 100) {
			ch++;
		}
		System.out.println("���� ä�� : "+ch);
	}
	public void chDown() {
		if(ch != 0) {
			ch--;
		}
		System.out.println("���� ä�� : "+ch);
	}
	public void chChange(int changeCh) {
		ch = changeCh;
		System.out.println("���� ä�� : "+ch);
	}
}
