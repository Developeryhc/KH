package kh.java.control;

import java.util.Scanner;

public class ForTest {
	public void test1() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "��° ���");
		}
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "��° ���");
		}
	} // ���� 1

	public void exam1() {
		// �ȳ��ϼ��� 5�� ���, i�� 04���� 5�� ���
		for (int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}

	public void exam2() {
		// �ȳ��ϼ��� ��� Ƚ�� �Է� �� �Է� �� ��ŭ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ����Ͻðڽ��ϱ� ? : ");
		// �Է� �� count�� �ʱ�ȭ
		int count = sc.nextInt();
		// count ��ŭ �ȳ��ϼ��� ���, i�� 0�϶����� �Է� �� ���� ���� ex) count = 5�϶�, i�� 04���� ����
		for (int i = 0; i < count; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}

	public void exam3() {
		// ������ 2�� ����ϱ�
		System.out.println("������ 2�� ����ϱ�");
		System.out.println("2�� �Դϴ�.");
		// ������ 2���̹Ƿ� �� 2�� ����, 19������ ���� ��(i<10), �������� 2�� �����ϰ� 19������ 1�� ����(i++),
		for(int i = 1; i<10; i++) {
			System.out.println("2 * "+i+" = "+(2+i));
			// System.out.printf("2%d=%d\n", i, 2i); -> printf�� Ȱ�� ����
		}
	}

	public void exam4() {
		// ���� �Է¹޾� �Է� ���� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ����� ����Ͻðڽ��ϱ� ? : ");
		// num�� �Է� �� ����
		int num = sc.nextInt();
		// ������ num�� �ȳ� ���� ���
		System.out.println("������ " + num + "�� ����ϱ�");
		System.out.println(num + "�� �Դϴ�.");
		// num�� -> num�� ���� ��, 1~9���� ���� ��(i<10), ���� ���� num�� ������ ������ �� ����(i++)
		for (int i = 1; i < 10; i++) {
			// System.out.println(num+""+i+"="+numi); -> println�� Ȱ�� ����
			System.out.printf("%d * %d = %d\n", num, i, num+i);
		}
	}

	public void exam5() {
		// 5���� ������ �Է¹޾� �� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		// �� ���� �ޱ� ���� for�� �� �������� ���� count
		int count = 0;
		// 5���� ������ �Է¹޾� ���ؾ��� (5���� Ƚ�� == i�� 04 -> i<5, i++)
		for (int i = 0; i < 5; i++) {
			// �ݺ��� ������ ������ �ȳ� ���� ���(5��)
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			// num�� �Է� �� ����
			int num = sc.nextInt();
			// �ݺ��� ���� ��, count�� �Է� ���� num�� ����.
			count += num;
		}
		// �� ���� ���� �� count ���
		System.out.println("�Է��� 5���� ������ �� : " + count);
	}

	// ���� 6
	public void exam6() {
		// �� ���� �Է��Ͽ� ���̰����� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		// �� ���� �����ϱ� ���� ���� count�� 0���� �ʱ�ȭ
		int count = 0;
		// �׻� num1���� num2������ ũ�� ���� ��츦 ����� ���ǹ� �ۼ�
		// num1�� num2���� ������ num1�� ����(i=num1), num1�� num2�� �� �������� �� (i<=num2)
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				// num1num2������ ���� i++�� count�� ����
				count += i;
			}
		}
		// num2�� num1���� ������ num2�� ����(i=num2), num2�� num1�� �� �������� �� (i<=num1)
		else {
			// num2~num1������ ���� i++�� count�� ����
			for (int i = num1; i <= num2; i++) {
				count += i;
			}
		}
		System.out.printf("%d ~ %d�� ������ �� : %d", num1, num2, count);
	}

	public void exam7() {
		// 1���� �Է� ���� �� ������ ¦���� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		// �Է� ���� num�� ����
		int num = sc.nextInt();
		// �� ���� �����ϱ� ���� count�� 0���� �ʱ�ȭ
		int count = 0;
		// �ݺ� Ƚ�� -> �Է� ������ -> i<=num
		for (int i = 0; i <= num; i++) {
			// ������ ¦���� ���̹Ƿ� 2�� �������� �������� ���� ���� count�� ����.
			if (i % 2 == 0) {
				count += i;
			}
		}
		// if���� ������� �ʰ� �ݺ������θ� Ȱ�� ����
		// for(int i=0; i<=num; i+=2) {
		// count += i;
		// }
		System.out.println("¦������ ���� : " + count);
	}
}