package kr.or.iei.func;

import java.util.Calendar;
import java.util.Scanner;

public class ApiClass {
	public void dday() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();	// 오늘 날짜용
		Calendar cal1 = Calendar.getInstance();	// Dday용
		long today = cal.getTimeInMillis();
	}
	public void wrapper() {
		// 정수형 변수 선언해서 10 대입
		int num = 10;
		System.out.println(num);
		// wrapperclass로 정수형 10 대입
		Integer num1 = new Integer(10);
		System.out.println(num1.intValue());
		// autu-boxing
		Integer num2 = 10;						// new Integer(10);
		System.out.println(num2+1); 			// num2.Integer();
		System.out.println(num2.toString()+1);	// 문자열 Type
		// 왜 객체 주소값이 출력되지 않고 데이터값이 출력될까 ?
		Character ch = 'a';						// new Charater('a');
		System.out.println(ch);					// ch.charValuew();
		
		// String → 기본자료형 변환 ▶ 문자형은 .charAt();으로 사용
		String str = "10";
		System.out.println(str+1);				// 11
		int no = Integer.parseInt(str);			// str을 정수로 변환해서 리턴
		double nom = Double.parseDouble(str);
		System.out.println(nom+1);				// 2
		// 기본자료형 → String 변환 ▶ 문자형은 .charAt();으로 사용
		double d1 = 11.1;
		System.out.println(d1+1);
		String str1 = Double.valueOf(d1).toString();
		String str11 = String.valueOf(d1);
		System.out.println(str1+1);
		int no1 = 100;
		String str2 = Integer.valueOf(no1).toString();
		String str22 = String.valueOf(no1);
		Character ch1 = 'a';
		ch1.toString();
	}
}
