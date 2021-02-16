package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void test1() {
		// 정수형 변수 5개를 선언하여 순서대로 1, 2, 3, 4, 5를 대입
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;
		// 길이 5인 정수형 배열 선언 후 순서대로 1, 2, 3, 4, 5를 대입
		int[] arr1 = new int[10]; // 길이가 5인 정수형 배열 선언
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		// 길이 5인 정수형 배열 선언 후 순서대로 1, 2, 3, 4, 5를 대입
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 길이 5인 정수형 배열 선언 후 순서대로 1, 2, 3, 4, 5를 대입
		int[] arr3 = new int[10];
		for (int i = 0; i < 10; i++) {
			arr3[i] = i + 1;
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		for (int i = 0; i < 10; i++) {
			System.out.println(arr3[i]);
		}
		// 길이 3인 문자열 배열 선언 후 값 대입
		String[] arr4 = new String[3];
		arr4[0] = "Hello";
		arr4[1] = "Hi";
		arr4[2] = "안녕하세요";
		String[] arr5 = { "Hello", "Hi", "안녕하세요" };
	}

	public void exam1() {
		String[] fruits = { "딸기", "복숭아", "키위", "사과", "바나나" };
		// 1-1 배열 인덱스를 이용해서 바나나 출력
		System.out.println(fruits[4]);
		// 1-2 for문을 쓰지않고 전체 출력
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		// 1-3 for문을 이용하여 전체 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(fruits[i]);
		}
	}

	public void exam2() {
		int[] number = new int[100];
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
			System.out.println(number[i]);
		}
	}

	public void exam3() {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[4];
		System.out.print("국어점수 입력 : ");
		number[0] = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		number[1] = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		number[2] = sc.nextInt();
		number[3] = number[0] + number[1] + number[2];
		System.out.println("국어 : " + number[0]);
		System.out.println("영어 : " + number[1]);
		System.out.println("수학 : " + number[2]);
		System.out.println("합계 : " + number[3]);
		System.out.printf("평균 : %.2f", (double) number[3] / 3.0);
	}

	public void exam4() {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			number[i] = sc.nextInt();
		}
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = 0; j < number.length - (i + 1); j++) {
				if (number[j] > number[j + 1]) {
					int tmp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tmp;
				}
			}
		}
		// 낮은 수 부터 앞으로 출력
		// 버블 정렬, 선택 정렬, 삽입 정렬, 퀵 정렬
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "\t");
		}
	}

	public void bubble() {
		int[] arr = { 5, 4, 2, 1, 3 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - (i + 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		System.out.println();
	}

	public void lotto() { // 로또 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		while (bool) { // 반복 실행으로 반복문
			System.out.println("=============== 로또 프로그램 ===============");
			int[] user = new int[6]; // 내가 입력한 숫자 배열 선언
			int[] com = new int[6]; // 컴퓨터가 입력한 숫자 배열 선언
			int lotto = 0; // user와 com의 일치 숫자 개수
			int sel = 0;
			for (int i = 0; i < user.length; i++) { // 입력 받은 수 저장
				System.out.print((1 + i) + "번째 번호 입력(1~45) : ");
				user[i] = sc.nextInt();
				if (user[i] < 0 && user[i] > 46) {
					System.out.println("잘못 입력하셨습니다. 1~45 중 한개를 입력해주세요.");
					i--;
					continue;
				}
				for (int j = 0; j < i; j++) {
					if (user[i] == user[j]) {
						bool = false;
						System.out.println("이미 중복된 번호입니다. 다시 입력해주세요.");
						break; // for문의 활용성 증대 (이미 중복을 발견하면 이후 반복은 진행 X)
					}
				}
				// int inputNum = sc.nextInt(); // 강의 풀의
				// if(1<=inputNum && inputNum<=45) {
				// // 입력범위가 정상인경우
				// bool = true;
				// for(int j=0;j<i;j++) {// i=0 → i값 만큼만 반복
				// if(inputNum==user[j]) {
				// System.out.println("이미 중복된 번호입니다. 다시 입력해주세요.");
				// i--;
				// bool=false;
				// break;
				// }
				// }
				// }
				if (bool == false) {
					bool = true;
					i--;
					continue;
				}
				// if(bool) { // 강의 풀의
				// user[i] = inputNum;
				// }
			}
			for (int i = 0; i < com.length; i++) { // 컴퓨터가 입력 받은 수 저장
				com[i] = r.nextInt(45) + 1;
			}
			for (int i = 0; i < user.length; i++) { // 같은 수에 대해 lotto에 카운팅
				for (int j = 0; j < user.length; j++) {
					if (user[i] == com[j]) {
						lotto++;
					}
				}
			}
			for (int i = 0; i < user.length; i++) { // 내 숫자 정렬
				for (int j = 0; j < user.length - i - 1; j++) {
					if (user[j] > user[j + 1]) {
						int tmp = user[j];
						user[j] = user[j + 1];
						user[j + 1] = tmp;
					}
				}
			}
			for (int i = 0; i < com.length; i++) { // 컴퓨터 숫자 정렬
				for (int j = 0; j < com.length - i - 1; j++) {
					if (com[j] > com[j + 1]) {
						int tmp = com[j];
						com[j] = com[j + 1];
						com[j + 1] = tmp;
					}
				}
			}
			System.out.println("내가 선택한 숫자");
			for (int i = 0; i < user.length; i++) {
				System.out.print(user[i] + "  ");
			}
			System.out.println();
			System.out.println("컴퓨터가 선택한 숫자");
			for (int i = 0; i < com.length; i++) {
				System.out.print(com[i] + "  ");
			}
			System.out.println();
			System.out.println("맞은 갯수 : " + lotto);
			if (lotto == 6) {
				System.out.println("1등!!!");
			} else if (lotto == 5) {
				System.out.println("2등!!");
			} else if (lotto == 4) {
				System.out.println("3등!");
			} else if (lotto <= 3) {
				System.out.println("꽝");
			}
			System.out.print("한번 더 하시겠습니까 ?(1.yes/2.no) : ");
			sel = sc.nextInt();
			switch (sel) {
			case 1:
				break;
			case 2:
				bool = false;
				break;
			}
		}
	}

	public void lottoPlus() { // 로또 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		while (bool) { // 반복 실행으로 반복문
			System.out.println("=============== 로또 프로그램 ===============");
			int[] user = new int[6]; // 내가 입력한 숫자 배열 선언
			int[] com = new int[6]; // 컴퓨터가 입력한 숫자 배열 선언
			int sel = 0;
			for (int i = 0; i < user.length; i++) { // 입력 받은 수 저장
				System.out.print((1 + i) + "번째 번호 입력(1~45) : ");
				int inputNum = sc.nextInt();
				if (1 <= inputNum && inputNum <= 45) {
					// 입력범위가 정상인경우
					bool = true;
					for (int j = 0; j < i; j++) {// → i값 만큼만 반복
						if (inputNum == user[j]) {
							System.out.println("이미 중복된 번호입니다. 다시 입력해주세요.");
							i--;
							bool = false;
							break;
						}
					}
				} else {
					System.out.println("잘못 입력하셨습니다. 1~45 중 한개를 입력해주세요.");
					i--;
					continue;
				}
				if (bool) {
					user[i] = inputNum;
				}
			}
			int num = 0;
			while (bool) {
				num++;
				int lotto = 0; // user와 com의 일치 숫자 개수
				System.out.println("====== 제 " + (num) + "회 당첨번호 ======");
				for (int i = 0; i < com.length; i++) { // 컴퓨터가 입력 받은 수 저장
					com[i] = r.nextInt(45) + 1;
				}
				for (int i = 0; i < user.length; i++) { // 내 숫자 정렬
					for (int j = 0; j < user.length - i - 1; j++) {
						if (user[j] > user[j + 1]) {
							int tmp = user[j];
							user[j] = user[j + 1];
							user[j + 1] = tmp;
						}
					}
				}
				for (int i = 0; i < com.length; i++) { // 컴퓨터 숫자 정렬
					for (int j = 0; j < com.length - i - 1; j++) {
						if (com[j] > com[j + 1]) {
							int tmp = com[j];
							com[j] = com[j + 1];
							com[j + 1] = tmp;
						}
					}
				}
				for (int i = 0; i < user.length; i++) { // 같은 수에 대해 lotto에 카운팅
					for (int j = 0; j < user.length; j++) {
						if (user[i] == com[j]) {
							lotto++;
						}
					}
				}
				System.out.println("내가 선택한 숫자");
				for (int i = 0; i < user.length; i++) {
					System.out.print(user[i] + "  ");
				}
				System.out.println();
				System.out.println("컴퓨터가 선택한 숫자");
				for (int i = 0; i < com.length; i++) {
					System.out.print(com[i] + "  ");
				}
				System.out.println();
				if (lotto == 6) {
					System.out.println("1등!!!");
					bool = false;
					break;
				}
			}
		}
	}

	public void motel() { // 모텔관리 프로그램
		Scanner sc = new Scanner(System.in);
		String version = "v1.0"; // 버전 명
		boolean[] room = new boolean[10];
		while (true) {
			System.out.println("모텔 관리 프로그램 " + version);
			System.out.println("1. 입실\t2. 퇴실\t3. 방보기\t4. 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1: // 입실
				System.out.println("몇번방에 입실하시겠습니까?");
				int selroom = sc.nextInt();
				if (selroom >= 1 && selroom <= 10) { // 방 번호 범위 내 입력 값
					if (!room[selroom - 1]) { // 입실 중복 발생
						System.out.println(selroom + "번 방은 현재 손님이 있습니다.");
					} else if (room[selroom - 1] == false) { // 입실 정상 진행
						room[selroom - 1] = true;
						System.out.println(selroom + "번방에 입실하셨습니다.");
					}
				} else { // 예외 변수 처리
					System.out.println("잘못 입력하셨습니다. 1~10번 중에 골라주십시오.");
				}
				continue;
			case 2: // 퇴실
				System.out.println("몇번방에서 퇴실하시겠습니까?");
				selroom = sc.nextInt();
				if (selroom >= 1 && selroom <= 10) { // 방 번호 범위 내 입력 값
					if (room[selroom - 1]) { // 퇴실 중복 발생
						System.out.println(selroom + "번 방은 현재 빈 방입니다.");
					} else if (room[selroom - 1]) {
						room[selroom - 1] = false;
						System.out.println(selroom + "번방에서 퇴실하셨습니다.");
					}
				} else { // 예외 변수 처리
					System.out.println("잘못 입력하셨습니다. 1~10번 중에 골라주십시오.");
				}
				continue;
			case 3: // 방보기
				for (int i = 0; i < room.length; i++) { // 1번방부터 10번방까지 반복 배열 출력
					if (room[i]) {
						System.out.println((i + 1) + "번 방에는 현재 손님이 있습니다.");
					} else {
						System.out.println((i + 1) + "번 방은 현재 비어있습니다.");
					}
				}
				continue;
			case 4:
				break;
			default: // 예외 변수 처리
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}
	}
}