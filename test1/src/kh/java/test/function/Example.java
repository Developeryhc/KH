package kh.java.test.function;
import java.util.Scanner;
public class Example {
		public void exam1() {
			Scanner sc = new Scanner(System.in);
			System.out.print("�������� �Է�: ");
			int kor = sc.nextInt();
			System.out.print("�������� �Է� :");
			int math = sc.nextInt();
			System.out.print("�������� �Է�: ");
			int eng = sc.nextInt();
			int sum = kor+eng+math;
			double avg =(double)sum/3;
			System.out.println("�հ� : "+sum);
			System.out.printf("��� : %.2f\n",avg);
			String result = avg>=60&& kor>=40 && math>=40 &&eng>=40?"�հ�":"���հ�";
			System.out.println(result);
		}
		public void exam2() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			//¦�� -> 2�� ������ ��������. ->2�� �������� �������� 0�̴�.
			String result = num%2 ==0?"¦��" : "Ȧ��";
			System.out.println(result);
		}
		
}
