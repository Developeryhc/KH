package kr.or.iei.student.view;

import java.util.Scanner;

import kr.or.iei.student.Controller.StudentController;
import kr.or.iei.student.model.vo.Student;


public class StudentView {
	Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}
	public int  showMenu() {
		System.out.println("===== �л� ���� ���α׷� v3 =====");
		System.out.println("1. �л� ���� ���");
		System.out.println("2. �л� ��ȸ(��ü)");
		System.out.println("3. �л� ��ȸ(����)");
		System.out.println("4. �л� ���� ����");
		System.out.println("5. �л� ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� > ");
		int sel = sc.nextInt();
		return sel;
	}
	public Student insertStudent() {
		System.out.println("===== �л� ���� ��� =====");
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();
		System.out.print("�л� ���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�л� �ּ� �Է� : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name,age,addr);
		return s;
	}
	public void printAllStudent(Student[] s, int index) {
		System.out.println("===== �л� ���� ��ȸ(��ü) =====");
		System.out.println("�̸�\t����\t�ּ�");
		System.out.println("==============================");
		for(int i=0;i<index;i++) {
			System.out.println(s[i].getName()+"\t"+s[i].getAge()+"\t"+s[i].getAddr());
		}
	}
	public void printOneStudent(Student[] s, int searchIndex) {
		if(searchIndex == -1) {
			System.out.println("�ش� �л��� ��ȸ���� �ʽ��ϴ�.");
		}else {
			System.out.println("===== �л� ���� ��ȸ(����) =====");
			System.out.println("�л� �̸� : "+s[searchIndex].getName());
			System.out.println("�л� ���� : "+s[searchIndex].getAge());
			System.out.println("�л� �ּ� : "+s[searchIndex].getAddr());
			System.out.println("==============================");
			System.out.println("\t�л� ���� ��� �Ϸ�");
		}
	}
	public String searchName() {
		System.out.println("��ȸ�� �л� �̸� : ");
		return sc.next();
	}
}
