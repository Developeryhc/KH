package kh.java.control;

import java.util.Scanner;

public class WhileTest {
	public void test1() {
		int i=0;
		while(i<5) {
			System.out.println((i+1)+"번째 출력");
			i++;
		}
	}
	// 예제 1
	public void exam1() {
		// 입력 값을 저장하기 위한 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까 ? : ");
		// 입력값을 num에 대입
		int num = sc.nextInt();
		// 구구단은 1부터 시작하므로 임의의 변수 i에 1 대입
		int i = 1;
		// 구구단은 각 단별로 9까지의 곱셈이므로 i는 9까지
		while(i<=9) {
			System.out.println(num+" * "+i+" = "+num*i);
//			System.out.printf("%d * %d = %d\n",num,i,num*i); -> printf문으로 활용 가능
			i++; // while 종료 직전 i값에 +1
		}
	}
	
}
