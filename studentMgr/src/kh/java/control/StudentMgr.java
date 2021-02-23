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
			System.out.println("\n ----- 학생 관리 프로그램 ----- \n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 출력 (전체)");
			System.out.println("3. 학생 정보 출력 (1명 이름으로 검색)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
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
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void insertStudent() {
		System.out.println("\n----- 학생 정보 등록 -----\n");
		System.out.print("이름 입력 : ");
		String inputName = sc.next();
		System.out.print("나이 입력 : ");
		int inputAge = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String inputAddr = sc.nextLine();
		name[index] = inputName;
		age[index] = inputAge;
		addr[index] = inputAddr;
		index++;
	}
	public void printAllStudent() {
		System.out.println("\n----- 전체 학생 정보 출력-----\n");
		System.out.println("이름\t나이\t주소");
		System.out.println("--------------------------------");
		for(int i=0;i<index;i++) {
			System.out.println(name[i]+"\t"+age[i]+"\t"+addr[i]);
		}
	}
	public void printOneStudent() {
		System.out.println("\n----- 학생 정보 출력 (1명) -----\t");
		System.out.print("조회할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
	}
	public void modifyStudent() {
		System.out.print("수정할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if(searchIndex == -1) {
			System.out.println("학생 정보가 없습니다.");
		}else {
			System.out.print("이름 입력 : ");
			name[searchIndex] = sc.next();
			System.out.print("나이 입력 : ");
			age[searchIndex] = sc.nextInt();
			System.out.print("주소 입력 : ");
			sc.nextLine();
			addr[searchIndex] = sc.nextLine();
		}
	}
	public void deleteStudent() {
		System.out.println("\n----- 학생 정보 삭제 -----\t");
		System.out.print("삭제할 학생 이름 입력 : ");
		String deleteName = sc.next();
		int searchIndex = searchStudent(deleteName);
		if(searchIndex == -1) {
			System.out.println("학생 정보가 없습니다.");
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
			System.out.println("삭제 완료");
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
