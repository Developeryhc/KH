package kh.java.control;

import java.util.Scanner;

public class ForTest {
	public void test1() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "번째 출력");
		}
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "번째 출력");
		}
	} // 문제 1

	public void exam1() {
		// 안녕하세요 5번 출력, i는 04까지 5번 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}

	public void exam2() {
		// 안녕하세요 출력 횟수 입력 후 입력 값 만큼 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까 ? : ");
		// 입력 값 count에 초기화
		int count = sc.nextInt();
		// count 만큼 안녕하세요 출력, i가 0일때부터 입력 값 까지 진행 ex) count = 5일때, i는 04까지 진행
		for (int i = 0; i < count; i++) {
			System.out.println("안녕하세요");
		}
	}

	public void exam3() {
		// 구구단 2단 출력하기
		System.out.println("구구단 2단 출력하기");
		System.out.println("2단 입니다.");
		// 구구단 2단이므로 앞 2는 고정, 19까지를 곱한 값(i<10), 고정값인 2를 제외하고 19까지의 1씩 증가(i++),
		for(int i = 1; i<10; i++) {
			System.out.println("2 * "+i+" = "+(2+i));
			// System.out.printf("2%d=%d\n", i, 2i); -> printf문 활용 가능
		}
	}

	public void exam4() {
		// 값을 입력받아 입력 값의 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 몇단을 출력하시겠습니까 ? : ");
		// num에 입력 값 저장
		int num = sc.nextInt();
		// 구구단 num단 안내 문구 출력
		System.out.println("구구단 " + num + "단 출력하기");
		System.out.println(num + "단 입니다.");
		// num단 -> num은 고정 값, 1~9까지 곱한 값(i<10), 고정 값인 num을 제외한 나머지 수 증가(i++)
		for (int i = 1; i < 10; i++) {
			// System.out.println(num+""+i+"="+numi); -> println문 활용 가능
			System.out.printf("%d * %d = %d\n", num, i, num+i);
		}
	}

	public void exam5() {
		// 5개의 정수를 입력받아 총 합을 구하기
		Scanner sc = new Scanner(System.in);
		// 총 합을 받기 위한 for문 밖 지역변수 선언 count
		int count = 0;
		// 5개의 정수를 입력받아 더해야함 (5번의 횟수 == i는 04 -> i<5, i++)
		for (int i = 0; i < 5; i++) {
			// 반복문 내에서 정수값 안내 문구 출력(5번)
			System.out.print("정수 값을 입력하시오 : ");
			// num에 입력 값 저장
			int num = sc.nextInt();
			// 반복문 진행 시, count에 입력 값인 num을 합함.
			count += num;
		}
		// 총 합이 대입 된 count 출력
		System.out.println("입력한 5개의 정수의 합 : " + count);
	}

	// 문제 6
	public void exam6() {
		// 두 수를 입력하여 사이값들의 합을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		// 총 합을 대입하기 위한 변수 count를 0으로 초기화
		int count = 0;
		// 항상 num1값이 num2값보다 크지 않을 경우를 대비해 조건문 작성
		// num1이 num2보다 작을때 num1을 기준(i=num1), num1이 num2가 될 때까지의 합 (i<=num2)
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				// num1num2까지의 수를 i++씩 count에 대입
				count += i;
			}
		}
		// num2가 num1보다 작을때 num2을 기준(i=num2), num2이 num1가 될 때까지의 합 (i<=num1)
		else {
			// num2~num1까지의 수를 i++씩 count에 대입
			for (int i = num1; i <= num2; i++) {
				count += i;
			}
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d", num1, num2, count);
	}

	public void exam7() {
		// 1에서 입력 받은 수 사이의 짝수의 합
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		// 입력 값을 num에 대입
		int num = sc.nextInt();
		// 총 합을 대입하기 위한 count를 0으로 초기화
		int count = 0;
		// 반복 횟수 -> 입력 값까지 -> i<=num
		for (int i = 0; i <= num; i++) {
			// 하지만 짝수의 합이므로 2로 나눴을때 나머지가 없는 값만 count에 합함.
			if (i % 2 == 0) {
				count += i;
			}
		}
		// if문을 사용하지 않고 반복문으로만 활용 가능
		// for(int i=0; i<=num; i+=2) {
		// count += i;
		// }
		System.out.println("짝수들의 합은 : " + count);
	}
}