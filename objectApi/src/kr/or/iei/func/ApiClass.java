package kr.or.iei.func;

import java.util.Calendar;
import java.util.Scanner;

public class ApiClass {
	public void dday() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();	// ���� ��¥��
		Calendar cal1 = Calendar.getInstance();	// Dday��
		long today = cal.getTimeInMillis();
	}
	public void wrapper() {
		// ������ ���� �����ؼ� 10 ����
		int num = 10;
		System.out.println(num);
		// wrapperclass�� ������ 10 ����
		Integer num1 = new Integer(10);
		System.out.println(num1.intValue());
		// autu-boxing
		Integer num2 = 10;						// new Integer(10);
		System.out.println(num2+1); 			// num2.Integer();
		System.out.println(num2.toString()+1);	// ���ڿ� Type
		// �� ��ü �ּҰ��� ��µ��� �ʰ� �����Ͱ��� ��µɱ� ?
		Character ch = 'a';						// new Charater('a');
		System.out.println(ch);					// ch.charValuew();
		
		// String �� �⺻�ڷ��� ��ȯ �� �������� .charAt();���� ���
		String str = "10";
		System.out.println(str+1);				// 11
		int no = Integer.parseInt(str);			// str�� ������ ��ȯ�ؼ� ����
		double nom = Double.parseDouble(str);
		System.out.println(nom+1);				// 2
		// �⺻�ڷ��� �� String ��ȯ �� �������� .charAt();���� ���
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
