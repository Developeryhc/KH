package com.khmarket.vo;
import java.util.Scanner;
public class Goods {
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է�: ");
		int num2 = sc.nextInt();
		String str = num1<num2?"num2�� �� ū�� �Դϴ�.":"num1�� �� ū�� �Դϴ�.";
		System.out.println(str);
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		int num3 = num1+num2;
		int num4 = num1-num2;
		int num5 = num1*num2;
		int num6 = num1/num2;
		System.out.println("==========���==========");
		System.out.println("�� ���� ���� ��: "+num3);
		System.out.println("�� ���� �� ��: "+num4);
		System.out.println("�� ���� ���� �� : "+num5);
		System.out.println("�� ���� ���� �� : .2f"+num6);
	}
	public void test8() {
		int a = 40, b=20;
		a +=b;
		System.out.printf("a�� ��: %d, b�� �� : %d \n", a,b);
		a-= b;
		System.out.printf("a�� ��: %d , b�� �� : %d \n",a,b);
		b*=a;
		System.out.printf("a�� �� : %d , b�� �� : %d \n", a,b);
		b /=a;
		System.out.printf("a�� �� : %d , b�� �� : %d \n",a,b);
	}
	public void test9() {
		int a = 10, b = 20, c = 30, d = 40;
		boolean result1, result2;
		result1 = ((a < 20 && b > 10) || (c == 30 && d != 40));
		result2 = ((a == 10 && b != 2 * 10) || (c == 30 && d != 40));
		System.out.printf("ù��° ����� : %b \n", result1);
		System.out.printf("�ι�° ����� : %b \n", result2);
	}
		public void test10() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���̸� �Է��ϼ��� : ");
			int age = sc.nextInt();
			String printMsg = age>19?"�����Դϴ�. �������":"�̼����ڴ� ����Ұ��Դϴ�.";
			System.out.println(printMsg);
			
		}
		public void test11() {
		
	}
	
}
