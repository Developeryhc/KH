package kh.java.test;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class MethodTest {
	public void test11() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		// �����ε� Overoading
		int result1 = add(num1,num2);
		int result2 = add(num1,num2,num3);
		int result3 = add(num1,num2,num3,num4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	// �� ���� �Ű������� �޾Ƽ� ��ģ ���� �����ϴ� �޼ҵ�
	public String add(String num1, String num2) {
		String add = num1+num2;
		return add;
	}
	public int add(int num1, int num2) {
		int add = num1+num2;
		return add;
	}
	// �� ���� �Ű������� �޾Ƽ� ��ģ ���� �����ϴ� �޼ҵ�
	public int add(int num1, int num2, int num3) {
		int triadd = num1+num2+num3;
		return triadd;
	}
	// �� ���� �Ű������� �޾Ƽ� ��ģ ���� �����ϴ� �޼ҵ�
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
		test4(arr);		// arr �迭�� �ּҰ� ���� �� ���� ����
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
		System.out.println("���� �޼ҵ��Դϴ�!!");
		test1();
		String today = today();
		System.out.println(today);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		int result = sum(num1, num2);
		System.out.println("�� ���� ���� : "+result);
//		while(true) {
//			System.out.print("���ڸ� �Է��ϼ��� : ");
//			int num = sc.nextInt();
//			int ck1 = check1(num);
//			boolean ck2 = check2(num);
//			if(ck2) {
//				System.out.println("¦��");
//			}else {
//				System.out.println("Ȧ��");
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
		System.out.println("ù��° �׽�Ʈ �޼ҵ� �Դϴ�.");
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
		return "2021-02-18";	// return �Ʒ��� �ִ� �ڵ�� �������� �ʴ´�. �� �ش� �޼ҵ��� �������ڵ�
//		System.out.println("hi");	// <- ��� �� ����
	}
	// ���� 1���� �Ű������� �޾Ƽ� Ȧ������ ¦������ �Ǵ����ִ� �޼ҵ�
	public int check1(int args) {
		return args%2;
	}
	public boolean check2(int args) {
		// ���޹��� �Ű������� ¦���� true ���� / Ȧ���� false ����
		if(args%2==0) {
			return true;
		}
		return false;
	}
	public String check3(int args) {
		// ���޹��� �Ű������� ¦���� "¦��" / Ȧ���� "Ȧ��" ����
		if(args%2==0) {
			return "¦��";
		}return "Ȧ��";
	}
}
