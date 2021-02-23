package kh.java.control;
import java.util.Scanner;

public class StudentMgr {
	String[] name;
	int[] age;
	String[] addr;
	int index;
	Scanner sc;
	
	public void StudentMgr() {
		name = new String[10];
		age = new int[10];
		addr = new String[10];
		index = 0;
		sc = new Scanner(System.in);
	}
	public void main() {
		while(true) {
			System.out.println("\n ----- �л� ���� ���α׷� ----- \n");
			System.out.println("1. �л� ���� ���");
			System.out.println("2. �л� ���� ��� (��ü)");
			System.out.println("3. �л� ���� ��� (1�� �̸����� �˻�)");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("6. ���α׷� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel){
			case 1:
				insertStudent();
			case 2:
				printAllStudent();
			case 3:
				printOneStudent();
			case 4:
				modifyStudent();
			case 5:
				deleteStudent();
			case 0:
				System.out.println("Bye~!");
				return;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void insertStudent() {
		System.out.println("\n----- �л� ���� ��� -----\n");
		System.out.print("�̸� �Է� : ");
		String inputName = sc.next();
		System.out.print("���� �Է� : ");
		int inputAge = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		sc.nextLine();
		String inputAddr = sc.nextLine();
		name[index] = inputName;
		age[index] = inputAge;
		addr[index] = inputAddr;
		index++;
	}
	public void printAllStudent() {
		System.out.println("\n----- ��ü �л� ���� ���-----\n");
		System.out.println("�̸�\t����\t�ּ�");
		System.out.println("--------------------------------");
		for(int i=0;i<index;i++) {
			System.out.println(name[i]+"\t"+age[i]+"\t"+addr[i]);
		}
	}
	public void printOneStudent() {
		System.out.println("\n----- �л� ���� ��� (1��) -----\t");
		System.out.print("��ȸ�� �л� �̸� �Է� : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
	}
	public void modifyStudent() {
		System.out.print("������ �л� �̸� �Է� : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if(searchIndex == -1) {
			System.out.println("�л� ������ �����ϴ�.");
		}else {
			System.out.print("�̸� �Է� : ");
			name[searchIndex] = sc.next();
			System.out.print("���� �Է� : ");
			age[searchIndex] = sc.nextInt();
			System.out.print("�ּ� �Է� : ");
			sc.nextLine();
			addr[searchIndex] = sc.nextLine();
		}
	}
	public void deleteStudent() {
		System.out.println("\n----- �л� ���� ���� -----\t");
		System.out.print("������ �л� �̸� �Է� : ");
		String deleteName = sc.next();
		int searchIndex = searchStudent(deleteName);
		if(searchIndex == -1) {
			System.out.println("�л� ������ �����ϴ�.");
		}else {
			for(int i=searchIndex;i<index-1;i++) {
				name[i]=name[i+1];
				age[i]=age[i+1];
				addr[i]=addr[i+1];
			}
			index--;
			name[index] = null;
			age[index] = 0;
			addr[index] = null;
			System.out.println("���� �Ϸ�");
		}
	}
	public int searchStudent(String searchName) {
		for(int i=0;i<index;i++) {
			if(name[i].equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
}
