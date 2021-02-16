package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public void test1() {
		// ������ ���� 5���� �����Ͽ� ������� 1, 2, 3, 4, 5�� ����
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;
		// ���� 5�� ������ �迭 ���� �� ������� 1, 2, 3, 4, 5�� ����
		int[] arr1 = new int[10]; // ���̰� 5�� ������ �迭 ����
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		// ���� 5�� ������ �迭 ���� �� ������� 1, 2, 3, 4, 5�� ����
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// ���� 5�� ������ �迭 ���� �� ������� 1, 2, 3, 4, 5�� ����
		int[] arr3 = new int[10];
		for (int i = 0; i < 10; i++) {
			arr3[i] = i + 1;
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		for (int i = 0; i < 10; i++) {
			System.out.println(arr3[i]);
		}
		// ���� 3�� ���ڿ� �迭 ���� �� �� ����
		String[] arr4 = new String[3];
		arr4[0] = "Hello";
		arr4[1] = "Hi";
		arr4[2] = "�ȳ��ϼ���";
		String[] arr5 = { "Hello", "Hi", "�ȳ��ϼ���" };
	}

	public void exam1() {
		String[] fruits = { "����", "������", "Ű��", "���", "�ٳ���" };
		// 1-1 �迭 �ε����� �̿��ؼ� �ٳ��� ���
		System.out.println(fruits[4]);
		// 1-2 for���� �����ʰ� ��ü ���
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		// 1-3 for���� �̿��Ͽ� ��ü ���
		for (int i = 0; i < 5; i++) {
			System.out.println(fruits[i]);
		}
	}

	public void exam2() {
		int[] number = new int[100];
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
			System.out.println(number[i]);
		}
	}

	public void exam3() {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[4];
		System.out.print("�������� �Է� : ");
		number[0] = sc.nextInt();
		System.out.print("�������� �Է� : ");
		number[1] = sc.nextInt();
		System.out.print("�������� �Է� : ");
		number[2] = sc.nextInt();
		number[3] = number[0] + number[1] + number[2];
		System.out.println("���� : " + number[0]);
		System.out.println("���� : " + number[1]);
		System.out.println("���� : " + number[2]);
		System.out.println("�հ� : " + number[3]);
		System.out.printf("��� : %.2f", (double) number[3] / 3.0);
	}

	public void exam4() {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� : ");
			number[i] = sc.nextInt();
		}
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = 0; j < number.length - (i + 1); j++) {
				if (number[j] > number[j + 1]) {
					int tmp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tmp;
				}
			}
		}
		// ���� �� ���� ������ ���
		// ���� ����, ���� ����, ���� ����, �� ����
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "\t");
		}
	}

	public void bubble() {
		int[] arr = { 5, 4, 2, 1, 3 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - (i + 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		System.out.println();
	}

	public void lotto() { // �ζ� ���α׷� �����
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		while (bool) { // �ݺ� �������� �ݺ���
			System.out.println("=============== �ζ� ���α׷� ===============");
			int[] user = new int[6]; // ���� �Է��� ���� �迭 ����
			int[] com = new int[6]; // ��ǻ�Ͱ� �Է��� ���� �迭 ����
			int lotto = 0; // user�� com�� ��ġ ���� ����
			int sel = 0;
			for (int i = 0; i < user.length; i++) { // �Է� ���� �� ����
				System.out.print((1 + i) + "��° ��ȣ �Է�(1~45) : ");
				user[i] = sc.nextInt();
				if (user[i] < 0 && user[i] > 46) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~45 �� �Ѱ��� �Է����ּ���.");
					i--;
					continue;
				}
				for (int j = 0; j < i; j++) {
					if (user[i] == user[j]) {
						bool = false;
						System.out.println("�̹� �ߺ��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
						break; // for���� Ȱ�뼺 ���� (�̹� �ߺ��� �߰��ϸ� ���� �ݺ��� ���� X)
					}
				}
				// int inputNum = sc.nextInt(); // ���� Ǯ��
				// if(1<=inputNum && inputNum<=45) {
				// // �Է¹����� �����ΰ��
				// bool = true;
				// for(int j=0;j<i;j++) {// i=0 �� i�� ��ŭ�� �ݺ�
				// if(inputNum==user[j]) {
				// System.out.println("�̹� �ߺ��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				// i--;
				// bool=false;
				// break;
				// }
				// }
				// }
				if (bool == false) {
					bool = true;
					i--;
					continue;
				}
				// if(bool) { // ���� Ǯ��
				// user[i] = inputNum;
				// }
			}
			for (int i = 0; i < com.length; i++) { // ��ǻ�Ͱ� �Է� ���� �� ����
				com[i] = r.nextInt(45) + 1;
			}
			for (int i = 0; i < user.length; i++) { // ���� ���� ���� lotto�� ī����
				for (int j = 0; j < user.length; j++) {
					if (user[i] == com[j]) {
						lotto++;
					}
				}
			}
			for (int i = 0; i < user.length; i++) { // �� ���� ����
				for (int j = 0; j < user.length - i - 1; j++) {
					if (user[j] > user[j + 1]) {
						int tmp = user[j];
						user[j] = user[j + 1];
						user[j + 1] = tmp;
					}
				}
			}
			for (int i = 0; i < com.length; i++) { // ��ǻ�� ���� ����
				for (int j = 0; j < com.length - i - 1; j++) {
					if (com[j] > com[j + 1]) {
						int tmp = com[j];
						com[j] = com[j + 1];
						com[j + 1] = tmp;
					}
				}
			}
			System.out.println("���� ������ ����");
			for (int i = 0; i < user.length; i++) {
				System.out.print(user[i] + "  ");
			}
			System.out.println();
			System.out.println("��ǻ�Ͱ� ������ ����");
			for (int i = 0; i < com.length; i++) {
				System.out.print(com[i] + "  ");
			}
			System.out.println();
			System.out.println("���� ���� : " + lotto);
			if (lotto == 6) {
				System.out.println("1��!!!");
			} else if (lotto == 5) {
				System.out.println("2��!!");
			} else if (lotto == 4) {
				System.out.println("3��!");
			} else if (lotto <= 3) {
				System.out.println("��");
			}
			System.out.print("�ѹ� �� �Ͻðڽ��ϱ� ?(1.yes/2.no) : ");
			sel = sc.nextInt();
			switch (sel) {
			case 1:
				break;
			case 2:
				bool = false;
				break;
			}
		}
	}

	public void lottoPlus() { // �ζ� ���α׷� �����
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		while (bool) { // �ݺ� �������� �ݺ���
			System.out.println("=============== �ζ� ���α׷� ===============");
			int[] user = new int[6]; // ���� �Է��� ���� �迭 ����
			int[] com = new int[6]; // ��ǻ�Ͱ� �Է��� ���� �迭 ����
			int sel = 0;
			for (int i = 0; i < user.length; i++) { // �Է� ���� �� ����
				System.out.print((1 + i) + "��° ��ȣ �Է�(1~45) : ");
				int inputNum = sc.nextInt();
				if (1 <= inputNum && inputNum <= 45) {
					// �Է¹����� �����ΰ��
					bool = true;
					for (int j = 0; j < i; j++) {// �� i�� ��ŭ�� �ݺ�
						if (inputNum == user[j]) {
							System.out.println("�̹� �ߺ��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
							i--;
							bool = false;
							break;
						}
					}
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~45 �� �Ѱ��� �Է����ּ���.");
					i--;
					continue;
				}
				if (bool) {
					user[i] = inputNum;
				}
			}
			int num = 0;
			while (bool) {
				num++;
				int lotto = 0; // user�� com�� ��ġ ���� ����
				System.out.println("====== �� " + (num) + "ȸ ��÷��ȣ ======");
				for (int i = 0; i < com.length; i++) { // ��ǻ�Ͱ� �Է� ���� �� ����
					com[i] = r.nextInt(45) + 1;
				}
				for (int i = 0; i < user.length; i++) { // �� ���� ����
					for (int j = 0; j < user.length - i - 1; j++) {
						if (user[j] > user[j + 1]) {
							int tmp = user[j];
							user[j] = user[j + 1];
							user[j + 1] = tmp;
						}
					}
				}
				for (int i = 0; i < com.length; i++) { // ��ǻ�� ���� ����
					for (int j = 0; j < com.length - i - 1; j++) {
						if (com[j] > com[j + 1]) {
							int tmp = com[j];
							com[j] = com[j + 1];
							com[j + 1] = tmp;
						}
					}
				}
				for (int i = 0; i < user.length; i++) { // ���� ���� ���� lotto�� ī����
					for (int j = 0; j < user.length; j++) {
						if (user[i] == com[j]) {
							lotto++;
						}
					}
				}
				System.out.println("���� ������ ����");
				for (int i = 0; i < user.length; i++) {
					System.out.print(user[i] + "  ");
				}
				System.out.println();
				System.out.println("��ǻ�Ͱ� ������ ����");
				for (int i = 0; i < com.length; i++) {
					System.out.print(com[i] + "  ");
				}
				System.out.println();
				if (lotto == 6) {
					System.out.println("1��!!!");
					bool = false;
					break;
				}
			}
		}
	}

	public void motel() { // ���ڰ��� ���α׷�
		Scanner sc = new Scanner(System.in);
		String version = "v1.0"; // ���� ��
		boolean[] room = new boolean[10];
		while (true) {
			System.out.println("���� ���� ���α׷� " + version);
			System.out.println("1. �Խ�\t2. ���\t3. �溸��\t4. ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1: // �Խ�
				System.out.println("����濡 �Խ��Ͻðڽ��ϱ�?");
				int selroom = sc.nextInt();
				if (selroom >= 1 && selroom <= 10) { // �� ��ȣ ���� �� �Է� ��
					if (!room[selroom - 1]) { // �Խ� �ߺ� �߻�
						System.out.println(selroom + "�� ���� ���� �մ��� �ֽ��ϴ�.");
					} else if (room[selroom - 1] == false) { // �Խ� ���� ����
						room[selroom - 1] = true;
						System.out.println(selroom + "���濡 �Խ��ϼ̽��ϴ�.");
					}
				} else { // ���� ���� ó��
					System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~10�� �߿� ����ֽʽÿ�.");
				}
				continue;
			case 2: // ���
				System.out.println("����濡�� ����Ͻðڽ��ϱ�?");
				selroom = sc.nextInt();
				if (selroom >= 1 && selroom <= 10) { // �� ��ȣ ���� �� �Է� ��
					if (room[selroom - 1]) { // ��� �ߺ� �߻�
						System.out.println(selroom + "�� ���� ���� �� ���Դϴ�.");
					} else if (room[selroom - 1]) {
						room[selroom - 1] = false;
						System.out.println(selroom + "���濡�� ����ϼ̽��ϴ�.");
					}
				} else { // ���� ���� ó��
					System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~10�� �߿� ����ֽʽÿ�.");
				}
				continue;
			case 3: // �溸��
				for (int i = 0; i < room.length; i++) { // 1������� 10������� �ݺ� �迭 ���
					if (room[i]) {
						System.out.println((i + 1) + "�� �濡�� ���� �մ��� �ֽ��ϴ�.");
					} else {
						System.out.println((i + 1) + "�� ���� ���� ����ֽ��ϴ�.");
					}
				}
				continue;
			case 4:
				break;
			default: // ���� ���� ó��
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			break;
		}
	}
}