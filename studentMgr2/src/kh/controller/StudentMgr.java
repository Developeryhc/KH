package kh.controller;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import kh.vo.Student;
public class StudentMgr {
	Scanner sc;
	Student[] students;		// 학생 정보를 저장할 객체배열
	int index;				// 배열을 관리하기 위한 변수
	// 생성자를 만들어 각 변수배열 초기화
	public StudentMgr() {
		sc = new Scanner(System.in);
		students = new Student[10];
		index = 0;
	}
//	start에서는 new StudentMgr();
//	이렇게만들어서 sm.main() 할꺼에요
//	그렇게되면
//	두개 생성자중에 public StudentMgr()
//	이걸로 객체가만들어지는데
//	이때는 sc = new Scanner(System.in);
//	이코드가 실행이안되서 값을 입력할때 에러가날꺼에요 Ok
	// → 즉, 생성자가 두개일때는 Parameter가 비어있는 생성자 메소드를 객체화 해서 사용할건데,
	// 그때 안에 코드가 하나도 없는 상태로 출력을 하는데 그러면 그 객체에도 코드가 없으니 스캐너 기능을 사용못함.

	public void main() {
		while(true) {
			System.out.println("\n----- 학생관리 프로그램v2 -----\n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 출력(전체)");
			System.out.println("3. 학생 정보 출력(1명으로 이름 검색)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
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
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void insertStudent() {
		System.out.println("\n ----- 학생 정보 등록 -----\n");
		Student s = new Student();
		System.out.print("학생 이름 입력 : ");
		s.setName(sc.next());
		// String name = sc.next();
		System.out.print("학생 나이 입력 : ");
		s.setAge(sc.nextInt());
		//int age = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine();
		s.setAddr(sc.nextLine());
		//String addr = sc.nextLine();
		/*
		// 1. 기본 객체 생성 후 setter로 값 대입
		Student s = new Student();	// 이름, 주소 → null, 나이 → 0인 Student 객체
		s.setName(name);			// s객체에 입력받은 이름값 저장
		s.setAge(age);				// s객체에 입력받은 나이값 저장
		s.setAddr(addr);			// s객체에 입력받은 주소값 저장
		
		//2. 매개변수 있는 생성자를 통해서 객체 생성하며 값을 대입
		Student s = new Student(name,age,addr); // 입력 받은 값을 대입하면 Student객체 생성
		*/
		students[index] = s;		// 배열에 s객체 추가
		index++;
		System.out.println("학생 정보 등록 완료");
	}
	public void printAllStudent() {
		System.out.println("\n ----- 학생 정보 출력(전체) ----- \n");
		System.out.println("이름\t나이\t주소");
		System.out.println("------------------------------------");
		for(int i=0;i<index;i++) {
			System.out.println(students[i].getName()+"\t"+students[i].getAge()+"\t"+students[i].getAddr());
		}
	}
	public void printOneStudent() {
		System.out.println("\n ----- 학생 정보 출력(단일) ----- \n");
		System.out.print("출력할 학생의 이름 입력 : ");
		int searchIndex = searchStudent(sc.next());
		System.out.println("이름 : "+students[searchIndex].getName());
		System.out.println("나이 : "+students[searchIndex].getAge());
		System.out.println("주소 : "+students[searchIndex].getAddr());
	}
	public void modifyStudent() {
		System.out.println("\n ----- 학생 정보 수정 ----- \n");
		System.out.print("수정할 학생의 이름 입력 : ");
		int searchIndex = searchStudent(sc.next());
		if(searchIndex == -1) {
			System.out.println("학생 정보가 없습니다.");
		}else {
			System.out.print("수정할 이름 입력 : ");
			students[searchIndex].setName(sc.next());
			System.out.print("수정할 나이 입력 : ");
			students[searchIndex].setAge(sc.nextInt());
			System.out.print("수정할 주소 입력 : ");
			sc.nextLine();
			students[searchIndex].setAddr(sc.nextLine());
			System.out.println("학생 정보 수정 완료");
		}
	}
	public void deleteStudent() {
		System.out.println("\n ----- 학생 정보 삭제 ----- \n");
		System.out.print("삭제할 학생의 이름 입력 : ");
		int searchIndex = searchStudent(sc.next());
		if(searchIndex == -1) {
			System.out.println("학생 정보가 없습니다.");
		}else {
			for(int i=searchIndex;i<index-1;i++) {
				students[i] = students[i+1];
			}
			students[--index] = null;
			System.out.println("학생 정보 삭제 완료");
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
