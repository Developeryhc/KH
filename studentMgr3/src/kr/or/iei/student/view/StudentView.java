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
		System.out.println("===== 학생 관리 프로그램 v3 =====");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 조회(전체)");
		System.out.println("3. 학생 조회(단일)");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	}
	public Student insertStudent() {
		System.out.println("===== 학생 정보 등록 =====");
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name,age,addr);
		return s;
	}
	public void printAllStudent(Student[] s, int index) {
		System.out.println("===== 학생 정보 조회(전체) =====");
		System.out.println("이름\t나이\t주소");
		System.out.println("==============================");
		for(int i=0;i<index;i++) {
			System.out.println(s[i].getName()+"\t"+s[i].getAge()+"\t"+s[i].getAddr());
		}
	}
	public void printOneStudent(Student[] s, int searchIndex) {
		if(searchIndex == -1) {
			System.out.println("해당 학생이 조회되지 않습니다.");
		}else {
			System.out.println("===== 학생 정보 조회(단일) =====");
			System.out.println("학생 이름 : "+s[searchIndex].getName());
			System.out.println("학생 나이 : "+s[searchIndex].getAge());
			System.out.println("학생 주소 : "+s[searchIndex].getAddr());
			System.out.println("==============================");
			System.out.println("\t학생 정보 출력 완료");
		}
	}
	public String searchName() {
		System.out.println("조회할 학생 이름 : ");
		return sc.next();
	}
}
