package kh.java.control;

import java.util.Scanner;

public class WhileTest {
	public void test1() {
		int i=0;
		while(i<5) {
			System.out.println((i+1)+"��° ���");
			i++;
		}
	}
	// ���� 1
	public void exam1() {
		// �Է� ���� �����ϱ� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����Ͻðڽ��ϱ� ? : ");
		// �Է°��� num�� ����
		int num = sc.nextInt();
		// �������� 1���� �����ϹǷ� ������ ���� i�� 1 ����
		int i = 1;
		// �������� �� �ܺ��� 9������ �����̹Ƿ� i�� 9����
		while(i<=9) {
			System.out.println(num+" * "+i+" = "+num*i);
//			System.out.printf("%d * %d = %d\n",num,i,num*i); -> printf������ Ȱ�� ����
			i++; // while ���� ���� i���� +1
		}
	}
	
}
