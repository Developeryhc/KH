package kh.controller;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import kh.vo.Student;
public class StudentMgr {
	Scanner sc;
	Student[] students;		// �л� ������ ������ ��ü�迭
	int index;				// �迭�� �����ϱ� ���� ����
	// �����ڸ� ����� �� �����迭 �ʱ�ȭ
	public StudentMgr() {
		sc = new Scanner(System.in);
		students = new Student[10];
		index = 0;
	}
//	start������ new StudentMgr();
//	�̷��Ը��� sm.main() �Ҳ�����
//	�׷��ԵǸ�
//	�ΰ� �������߿� public StudentMgr()
//	�̰ɷ� ��ü����������µ�
//	�̶��� sc = new Scanner(System.in);
//	���ڵ尡 �����̾ȵǼ� ���� �Է��Ҷ� �������������� Ok
	// �� ��, �����ڰ� �ΰ��϶��� Parameter�� ����ִ� ������ �޼ҵ带 ��üȭ �ؼ� ����Ұǵ�,
	// �׶� �ȿ� �ڵ尡 �ϳ��� ���� ���·� ����� �ϴµ� �׷��� �� ��ü���� �ڵ尡 ������ ��ĳ�� ����� ������.

	public void main() {
		while(true) {
			System.out.println("\n----- �л����� ���α׷�v2 -----\n");
			System.out.println("1. �л� ���� ���");
			System.out.println("2. �л� ���� ���(��ü)");
			System.out.println("3. �л� ���� ���(1������ �̸� �˻�)");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("Bye~!");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void insertStudent() {
		System.out.println("\n ----- �л� ���� ��� -----\n");
		Student s = new Student();
		System.out.print("�л� �̸� �Է� : ");
		s.setName(sc.next());
		// String name = sc.next();
		System.out.print("�л� ���� �Է� : ");
		s.setAge(sc.nextInt());
		//int age = sc.nextInt();
		System.out.print("�л� �ּ� �Է� : ");
		sc.nextLine();
		s.setAddr(sc.nextLine());
		//String addr = sc.nextLine();
		/*
		// 1. �⺻ ��ü ���� �� setter�� �� ����
		Student s = new Student();	// �̸�, �ּ� �� null, ���� �� 0�� Student ��ü
		s.setName(name);			// s��ü�� �Է¹��� �̸��� ����
		s.setAge(age);				// s��ü�� �Է¹��� ���̰� ����
		s.setAddr(addr);			// s��ü�� �Է¹��� �ּҰ� ����
		
		//2. �Ű����� �ִ� �����ڸ� ���ؼ� ��ü �����ϸ� ���� ����
		Student s = new Student(name,age,addr); // �Է� ���� ���� �����ϸ� Student��ü ����
		*/
		students[index] = s;		// �迭�� s��ü �߰�
		index++;
		System.out.println("�л� ���� ��� �Ϸ�");
	}
	public void printAllStudent() {
		System.out.println("\n ----- �л� ���� ���(��ü) ----- \n");
		System.out.println("�̸�\t����\t�ּ�");
		System.out.println("------------------------------------");
		for(int i=0;i<index;i++) {
			System.out.println(students[i].getName()+"\t"+students[i].getAge()+"\t"+students[i].getAddr());
		}
	}
	public void printOneStudent() {
		System.out.println("\n ----- �л� ���� ���(����) ----- \n");
		System.out.print("����� �л��� �̸� �Է� : ");
		int searchIndex = searchStudent(sc.next());
		System.out.println("�̸� : "+students[searchIndex].getName());
		System.out.println("���� : "+students[searchIndex].getAge());
		System.out.println("�ּ� : "+students[searchIndex].getAddr());
	}
	public void modifyStudent() {
		System.out.println("\n ----- �л� ���� ���� ----- \n");
		System.out.print("������ �л��� �̸� �Է� : ");
		int searchIndex = searchStudent(sc.next());
		if(searchIndex == -1) {
			System.out.println("�л� ������ �����ϴ�.");
		}else {
			System.out.print("������ �̸� �Է� : ");
			students[searchIndex].setName(sc.next());
			System.out.print("������ ���� �Է� : ");
			students[searchIndex].setAge(sc.nextInt());
			System.out.print("������ �ּ� �Է� : ");
			sc.nextLine();
			students[searchIndex].setAddr(sc.nextLine());
			System.out.println("�л� ���� ���� �Ϸ�");
		}
	}
	public void deleteStudent() {
		System.out.println("\n ----- �л� ���� ���� ----- \n");
		System.out.print("������ �л��� �̸� �Է� : ");
		int searchIndex = searchStudent(sc.next());
		if(searchIndex == -1) {
			System.out.println("�л� ������ �����ϴ�.");
		}else {
			for(int i=searchIndex;i<index-1;i++) {
				students[i] = students[i+1];
			}
			students[--index] = null;
			System.out.println("�л� ���� ���� �Ϸ�");
		}
	}
	public int searchStudent(String name) {
		for(int i=0;i<index;i++) {
			if(students[i].getName().equals(name)){
				return i;
			}
		}
		return -1;
	}
}
