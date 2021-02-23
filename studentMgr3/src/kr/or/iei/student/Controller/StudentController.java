package kr.or.iei.student.Controller;

import kr.or.iei.student.model.vo.Student;
import kr.or.iei.student.view.StudentView;

public class StudentController {
	Student[] s;
	int index;
	StudentView view;
	char flag;
	public StudentController() {
		super();
		s = new Student[10];
		index = 0;
		view = new StudentView();
	}
	public void main() {
		while(true) {
			int sel = view.showMenu();		// ���� �޴��� �����ְ� Input Data�� Return�ϴ� Method
			switch(sel) {
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
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
//				modifyStudent();
				break;
			case 5:
				break;
			}
		}
	}
	public void insertStudent() {
		// 1. �л����� �Է¹ޱ�
		// Student stu = view.insertStudent();
		// 2. �Է¹��� ������ ��ü ���� �迭�� ����
		//s[index++] = stu;
		// s[index++] = new Student(stu.getName(),stu.getAge(),stu.getAddr());
		s[index++] = view.insertStudent();
	}
	public void printAllStudent() {
		view.printAllStudent(s, index);
	}
	public void printOneStudent() {
		// 1. ����� �л� �̸��� �Է�							�� view
		// 2. �Է¹��� �̸��� �迭 ���°�� �����ϴ��� ��ȸ		�� Controller
		// 3. �迭�� �����ϴ� ��� �� �ش� ������ ���			�� view
		view.printOneStudent(s, searchIndex(view.searchName()));		// �̸� �Է� ������ ���ڿ�  �� searchIndex�� ���� �� i�� ���� �� view.printOneStudent�� ���� �� ���
	}
	public int searchIndex(String searchName) {
		for(int i=0;i<index;i++) {
			if(s[i].getName().equals(searchName)){
				return i;
			}
		}
		return -1;
	}
}
