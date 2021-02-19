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
		boolean bool = true;
		while (bool) {
			System.out.println("모텔 관리 프로그램 " + version);
			System.out.println("1.입실\t2.퇴실\t3.방보기 \t4.종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1: // 입실
				System.out.println("몇번방에 입실하시겠습니까?");
				int selroom = sc.nextInt();
				if (selroom >= 1 && selroom <= 10) { // 방 번호 범위 내 입력 값
					if (room[selroom - 1]) { // 입실 중복 발생
						System.out.println(selroom + "번 방은 현재 손님이 있습니다.");
					} else if (!room[selroom - 1]) { // 입실 정상 진행
						room[selroom - 1] = true;
						System.out.println(selroom + "번방에 입실하셨습니다.");
					}
				} else { // 예외 변수 처리
					System.out.println("잘못 입력하셨습니다. 1~10번 중에 골라주십시오.");
				}
				break;
			case 2: // 퇴실
				System.out.println("몇번방에서 퇴실하시겠습니까?");
				selroom = sc.nextInt();
				if (selroom >= 1 && selroom <= 10) { // 방 번호 범위 내 입력 값
					if (!room[selroom - 1]) { // 퇴실 중복 발생
						System.out.println(selroom + "번 방은 현재 빈 방입니다.");
					} else if (room[selroom - 1]) {
						room[selroom - 1] = false;
						System.out.println(selroom + "번방에서 퇴실하셨습니다.");
					}
				} else { // 예외 변수 처리
					System.out.println("잘못 입력하셨습니다. 1~10번 중에 골라주십시오.");
				}
				break;
			case 3: // 방보기
				for (int i = 0; i < room.length; i++) { // 1번방부터 10번방까지 반복 배열 출력
					if (room[i]) {
						System.out.println((i + 1) + "번 방에는 현재 손님이 있습니다.");
					} else {
						System.out.println((i + 1) + "번 방은 현재 비어있습니다.");
					}
				}
				break;
			case 4:
				bool = false;
				break;
			default: // 예외 변수 처리
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}

	public void arrayCopy() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// ★ 얉은 복사 (주소값만 복사해서 같은 배열을 참조하고 있는 상태)
		int[] arr2 = arr1;
		arr1[1] = 10;
		arr2[2] = 30;
		// 깊은 복사 (새 배열을 만들고 arr1의 값을 복사해오는 상태)
		int[] arr3 = arr1.clone();
		int[] arr4 = new int[5];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		// ? arraycopy에 1, 3항의 Indext는 배열의 명, 2, 4, 5에는 정수형 타입의 무언가 ? (계산식도 가능?)
		int[] arr5 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			arr5[i] = arr1[i];
		}
		arr1[1] = 100;
		// 결과
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

	public void test2() {
		int[][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 3;
		arr[0][2] = 5;
		arr[1][0] = 7;
		arr[1][1] = 9;
		arr[1][2] = 11;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void exam11() {
		int[][] arr = new int[5][5];
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1 + num++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam12() { // 실습 1
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 5 * (i + 1) - j;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam13() { // 실습 2
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (1 + i) + (j * 5);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam14() {
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 5 * (j + 1) - i;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam15() {
		int[][] arr = new int[5][5];
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 1) { // arr 배열의 홀수 열에서의 조건식
					arr[i][j] = (i - num) * 10 - j;
				} else { // arr 배열의 짝수 열에서의 조건식
					arr[i][j] = (i / 2) * 10 + (1 + j);
				}
				System.out.print(arr[i][j] + "\t");
			}
			if (i % 2 == 1) { // arr 배열의 행이 홀수일 경우 변수 num++
				num++;
			}
			System.out.println();
		}
	}

	public void exam16() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int vert = 0;
		int hori = 0;
		System.out.print("가로행의 개수를 입력하세요(1~10) ==> ");
		vert = sc.nextInt();
		System.out.print("세로열의 개수를 입력하세요(1~10) ==> ");
		hori = sc.nextInt();
		char[][] arr = new char[hori][vert]; // 배열 선언 세로 hori, 가로 vert
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) (r.nextInt(25) + 97);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void exam17() { // 달팽이 배열 1
		Scanner sc = new Scanner(System.in);
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int num = sc.nextInt();
		int count = 1;
		int vert = 0;
		int hori = -1;
		int sum = 1;
		int chag = -1;
		int[][] arr = new int[num][num];
		while (true) {
			if(num==0) {
				break;
			}
			for(int i=0; i<num; i++) {
				hori += sum;
				arr[vert][hori]=count;
				count++;
			}
			num--;
			for(int i=0; i<num; i++) {
				vert += sum;
				arr[vert][hori]=count;
				count++;
			}
			sum *= chag;
		}
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				System.out.print(arr[i][k]+"\t");
			}
			System.out.println();
		}
	}
	public void exam18() { // 달팽이 배열 2
		Scanner sc = new Scanner(System.in);
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		int num = sc.nextInt();
		int count = 1;
		int vert = 0;
		int hori = num;
		int sum = 1;
		int chag = -1;
		int[][] arr = new int[num][num];
		while(true) {
			if(num==0) {
				break;
			}
			for(int i=0;i<num;i++) {
				hori -= sum;
				arr[vert][hori] = count;
				count++;
			}
			num--;
			for(int i=0;i<num;i++) {
				vert += sum;
				arr[vert][hori] = count;
				count++;
			}
			sum *= chag;
		}
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				System.out.print(arr[i][k]+"\t");
			}
			System.out.println();
		}
	}
//	문제 설명
//	1. 비밀 지도(난이도: 하)
//	네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
//	그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
//	다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
//
//	1) 지도는 한 변의 길이가 n인 정사각형 배열 형태로,
//	각 칸은 “공백”(“ “) 또는 “벽”(“#”) 두 종류로 이루어져 있다.
//	2) 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 “지도 1”과 “지도 2”라고 하자.
//	지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
//	지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
//	3) “지도 1”과 “지도 2”는 각각 정수 배열로 암호화되어 있다.
//	4) 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1,
//	공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
//	네오가 프로도의 비상금을 손에 넣을 수 있도록,
//	비밀지도의 암호를 해독하는 작업을 도와줄 프로그램을 작성하라.
//
//	입력 형식
//	입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.
//
// - 1 < n < 16
// - arr1, arr2는 길이 n인 정수 배열로 주어진다.
// - 정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 < x < 2^n - 1을 만족한다.
//	출력 형식
//	원래의 비밀지도를 해독하여 "#", 공백으로 구성된 문자열 배열로 출력하라.
//
//	입출력 예제


	// 1. n값 입력받음 /  1<n<16
	// 2. 각 2개의 배열 생성
	// 3. 각 배열의 col값에 랜덤한 수 x 생성 / 1 < x < 2^n-1
	// 4. x값을 2진수로 변형 -- ing
	// 5. 각 배열 index의 2진수로 변형된 값을 #으로 표기
	// 6. 각 배열의 2진수를 합침 ( 1이 있는 값은 1로 표기 )
	// 7. 자료값 출력
	
	public void exam19() { // 카카오 문제 1
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		while(true){
			System.out.print("지도 한 변의 길이 > ");
			int range = sc.nextInt();
			if(1<range && range<16) {
				int[][] arr1 = new int[range][range];
				int[][] arr2 = new int[range][range];
				char[][] map = new char[range][range];
				for(int i=0;i<arr1.length;i++) {
					arr1[i][0]=r.nextInt(2^range-1);
				}
				arri[i][0]%2
				
				
				
				
				
				
			}else {
				System.out.println("2~15사이의 값을 입력해주세요.");
				continue;
			}
		}
	}
	public void exam20() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("지도 한 변의 길이 > ");
		int range = sc.nextInt();
		int num = 0;
		if(1<range && range<16) {
			int[][] arr1 = new int[range][range];
			int[][] arr2 = new int[range][range];
			char[][] map = new char[range][range];
			for(int i=0;i<arr1.length;i++) {
				arr1[i][num]=r.nextInt(!!!!!!!!);
				for(int k=0;k>arr1[i].length;k++) {
					if((arr1[i][num]/(2^(k+1)))%2==0) {
						map[i][k]=0;
					}else {
						arr1[i][k]=1;
					}
				}
			}
			for(int i=0;i<arr1.length;i++) {
				for(int k=0;k<arr1[i].length;k++) {
					System.out.print(arr1[i][k]+"\t");
				}
				System.out.println();
			}
		}
	}
}