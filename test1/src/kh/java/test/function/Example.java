package kh.java.test.function;
import java.util.Scanner;
public class Example {
		public void exam1() {
			Scanner sc = new Scanner(System.in);
			System.out.print("국어점수 입력: ");
			int kor = sc.nextInt();
			System.out.print("수학점수 입력 :");
			int math = sc.nextInt();
			System.out.print("영어점수 입력: ");
			int eng = sc.nextInt();
			int sum = kor+eng+math;
			double avg =(double)sum/3;
			System.out.println("합계 : "+sum);
			System.out.printf("평균 : %.2f\n",avg);
			String result = avg>=60&& kor>=40 && math>=40 &&eng>=40?"합격":"불합격";
			System.out.println(result);
		}
		public void exam2() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			//짝수 -> 2로 나누어 떨어진다. ->2로 나눴을때 나머지가 0이다.
			String result = num%2 ==0?"짝수" : "홀수";
			System.out.println(result);
		}
		
}
