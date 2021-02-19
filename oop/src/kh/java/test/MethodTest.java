package kh.java.test;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class MethodTest {
	public void test11() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		// 오버로딩 Overoading
		int result1 = add(num1,num2);
		int result2 = add(num1,num2,num3);
		int result3 = add(num1,num2,num3,num4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	// 두 수를 매개변수로 받아서 합친 값을 리턴하는 메소드
	public String add(String num1, String num2) {
		String add = num1+num2;
		return add;
	}
	public int add(int num1, int num2) {
		int add = num1+num2;
		return add;
	}
	// 세 수를 매개변수로 받아서 합친 값을 리턴하는 메소드
	public int add(int num1, int num2, int num3) {
		int triadd = num1+num2+num3;
		return triadd;
	}
	// 네 수를 매개변수로 받아서 합친 값을 리턴하는 메소드
	public int add(int num1, int num2, int num3, int num4) {
		int queadd = num1+num2+num3+num4;
		return queadd;
	}
	public void test2() {
		int[] arr = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		test3(arr[2]);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		test4(arr);		// arr 배열의 주소값 복사 → 얇은 복사
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void test3(int num) {
		num += 100;
		System.out.println(num);
	}
	public void test4(int[] arr1) {
		arr1[2] += 100;
		System.out.println(arr1[2]);
	}
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메인 메소드입니다!!");
		test1();
		String today = today();
		System.out.println(today);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		int result = sum(num1, num2);
		System.out.println("두 수의 합은 : "+result);
//		while(true) {
//			System.out.print("숫자를 입력하세요 : ");
//			int num = sc.nextInt();
//			int ck1 = check1(num);
//			boolean ck2 = check2(num);
//			if(ck2) {
//				System.out.println("짝수");
//			}else {
//				System.out.println("홀수");
//			}
//			String ck3 = check3(num);
//			System.out.println(ck3);
//		}
	}
	public int sum(int num1, int num2) {
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		int sum = num1+num2;
		return sum;
	}
	public void test1() {
		System.out.println("첫번째 테스트 메소드 입니다.");
		System.out.println("test");
		System.out.println("test");
		return;
	}
	public String today() {
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		return "2021-02-18";	// return 아래에 있는 코드는 도달하지 않는다. 즉 해당 메소드의 마지막코드
//		System.out.println("hi");	// <- 출력 시 오류
	}
	// 정수 1개를 매개변수로 받아서 홀수인지 짝수인지 판단해주는 메소드
	public int check1(int args) {
		return args%2;
	}
	public boolean check2(int args) {
		// 전달받은 매개변수가 짝수면 true 리턴 / 홀수면 false 리턴
		if(args%2==0) {
			return true;
		}
		return false;
	}
	public String check3(int args) {
		// 전달받은 매개변수가 짝수면 "짝수" / 홀수면 "홀수" 리턴
		if(args%2==0) {
			return "짝수";
		}return "홀수";
	}
}
