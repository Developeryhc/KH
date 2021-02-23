package com.khmarket.vo;
import java.util.Scanner;
public class Goods {
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		String str = num1<num2?"num2가 더 큰수 입니다.":"num1이 더 큰수 입니다.";
		System.out.println(str);
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int num3 = num1+num2;
		int num4 = num1-num2;
		int num5 = num1*num2;
		int num6 = num1/num2;
		System.out.println("==========결과==========");
		System.out.println("두 수를 더한 수: "+num3);
		System.out.println("두 수를 뺀 수: "+num4);
		System.out.println("두 수를 곱한 수 : "+num5);
		System.out.println("두 수를 나눈 수 : .2f"+num6);
	}
	public void test8() {
		int a = 40, b=20;
		a +=b;
		System.out.printf("a의 값: %d, b의 값 : %d \n", a,b);
		a-= b;
		System.out.printf("a의 값: %d , b의 값 : %d \n",a,b);
		b*=a;
		System.out.printf("a의 값 : %d , b의 값 : %d \n", a,b);
		b /=a;
		System.out.printf("a의 값 : %d , b의 값 : %d \n",a,b);
	}
	public void test9() {
		int a = 10, b = 20, c = 30, d = 40;
		boolean result1, result2;
		result1 = ((a < 20 && b > 10) || (c == 30 && d != 40));
		result2 = ((a == 10 && b != 2 * 10) || (c == 30 && d != 40));
		System.out.printf("첫번째 결과값 : %b \n", result1);
		System.out.printf("두번째 결과값 : %b \n", result2);
	}
		public void test10() {
			Scanner sc = new Scanner(System.in);
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			String printMsg = age>19?"성인입니다. 어서오세요":"미성년자는 입장불가입니다.";
			System.out.println(printMsg);
			
		}
		public void test11() {
		
	}
	
}
