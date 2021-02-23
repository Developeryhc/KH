package kr.or.iei.student.Controller;

import kr.or.iei.student.model.vo.Student;
import kr.or.iei.student.view.StudentView;

public class StudentController {
	Student[] s;
	int index;
	StudentView view;
	public StudentController() {
		super();
		s = new Student[10];
		index = 0;
		view = new StudentView();
	}
	public void main() {
		while(true) {
			int sel = view.showMenu();		// 메인 메뉴를 보여주고 Input Data를 Return하는 Method
			switch(sel) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
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
				break;
			case 5:
				break;
			}
		}
	}
	public void insertStudent() {
		// 1. 학생정보 입력받기
		Student stu = view.insertStudent();
		// 2. 입력받은 정보로 객체 만들어서 배열에 저장
		s[index++] = stu;
		// s[index++] = new Student(stu.getName(),stu.getAge(),stu.getAddr());
	}
	public void printAllStudent() {
		view.printAllStudent(s, index);
	}
	public Student printOneStudent() {
		// 1. 출력할 학생 이름을 입력							→ view
		// 2. 입력받은 이름이 배열 몇번째에 존재하는지 조회		→ Controller
		// 3. 배열에 존재하는 경우 → 해당 정보를 출력			→ view
		for(int i=0;i<index;i++) {
			if(s[i].getName().equals(view.printOneStudent())) {
				return s[i];
			}
		}
		return null;
	}
}
