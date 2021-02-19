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
		boolean bool = true;
		while (bool) {
			System.out.println("���� ���� ���α׷� " + version);
			System.out.println("1.�Խ�\t2.���\t3.�溸�� \t4.����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1: // �Խ�
				System.out.println("����濡 �Խ��Ͻðڽ��ϱ�?");
				int selroom = sc.nextInt();
				if (selroom >= 1 && selroom <= 10) { // �� ��ȣ ���� �� �Է� ��
					if (room[selroom - 1]) { // �Խ� �ߺ� �߻�
						System.out.println(selroom + "�� ���� ���� �մ��� �ֽ��ϴ�.");
					} else if (!room[selroom - 1]) { // �Խ� ���� ����
						room[selroom - 1] = true;
						System.out.println(selroom + "���濡 �Խ��ϼ̽��ϴ�.");
					}
				} else { // ���� ���� ó��
					System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~10�� �߿� ����ֽʽÿ�.");
				}
				break;
			case 2: // ���
				System.out.println("����濡�� ����Ͻðڽ��ϱ�?");
				selroom = sc.nextInt();
				if (selroom >= 1 && selroom <= 10) { // �� ��ȣ ���� �� �Է� ��
					if (!room[selroom - 1]) { // ��� �ߺ� �߻�
						System.out.println(selroom + "�� ���� ���� �� ���Դϴ�.");
					} else if (room[selroom - 1]) {
						room[selroom - 1] = false;
						System.out.println(selroom + "���濡�� ����ϼ̽��ϴ�.");
					}
				} else { // ���� ���� ó��
					System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~10�� �߿� ����ֽʽÿ�.");
				}
				break;
			case 3: // �溸��
				for (int i = 0; i < room.length; i++) { // 1������� 10������� �ݺ� �迭 ���
					if (room[i]) {
						System.out.println((i + 1) + "�� �濡�� ���� �մ��� �ֽ��ϴ�.");
					} else {
						System.out.println((i + 1) + "�� ���� ���� ����ֽ��ϴ�.");
					}
				}
				break;
			case 4:
				bool = false;
				break;
			default: // ���� ���� ó��
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}
	}

	public void arrayCopy() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// �� ���� ���� (�ּҰ��� �����ؼ� ���� �迭�� �����ϰ� �ִ� ����)
		int[] arr2 = arr1;
		arr1[1] = 10;
		arr2[2] = 30;
		// ���� ���� (�� �迭�� ����� arr1�� ���� �����ؿ��� ����)
		int[] arr3 = arr1.clone();
		int[] arr4 = new int[5];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		// ? arraycopy�� 1, 3���� Indext�� �迭�� ��, 2, 4, 5���� ������ Ÿ���� ���� ? (���ĵ� ����?)
		int[] arr5 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			arr5[i] = arr1[i];
		}
		arr1[1] = 100;
		// ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

	public void test2() {
		int[][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 3;
		arr[0][2] = 5;
		arr[1][0] = 7;
		arr[1][1] = 9;
		arr[1][2] = 11;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void exam11() {
		int[][] arr = new int[5][5];
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1 + num++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam12() { // �ǽ� 1
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 5 * (i + 1) - j;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam13() { // �ǽ� 2
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (1 + i) + (j * 5);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam14() {
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 5 * (j + 1) - i;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam15() {
		int[][] arr = new int[5][5];
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 1) { // arr �迭�� Ȧ�� �������� ���ǽ�
					arr[i][j] = (i - num) * 10 - j;
				} else { // arr �迭�� ¦�� �������� ���ǽ�
					arr[i][j] = (i / 2) * 10 + (1 + j);
				}
				System.out.print(arr[i][j] + "\t");
			}
			if (i % 2 == 1) { // arr �迭�� ���� Ȧ���� ��� ���� num++
				num++;
			}
			System.out.println();
		}
	}

	public void exam16() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int vert = 0;
		int hori = 0;
		System.out.print("�������� ������ �Է��ϼ���(1~10) ==> ");
		vert = sc.nextInt();
		System.out.print("���ο��� ������ �Է��ϼ���(1~10) ==> ");
		hori = sc.nextInt();
		char[][] arr = new char[hori][vert]; // �迭 ���� ���� hori, ���� vert
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) (r.nextInt(25) + 97);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void exam17() { // ������ �迭 1
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int num = sc.nextInt();
		int count = 1;
		int vert = 0;
		int hori = -1;
		int sum = 1;
		int chag = -1;
		int[][] arr = new int[num][num];
		while (true) {
			if(num==0) {
				break;
			}
			for(int i=0; i<num; i++) {
				hori += sum;
				arr[vert][hori]=count;
				count++;
			}
			num--;
			for(int i=0; i<num; i++) {
				vert += sum;
				arr[vert][hori]=count;
				count++;
			}
			sum *= chag;
		}
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				System.out.print(arr[i][k]+"\t");
			}
			System.out.println();
		}
	}
	public void exam18() { // ������ �迭 2
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int num = sc.nextInt();
		int count = 1;
		int vert = 0;
		int hori = num;
		int sum = 1;
		int chag = -1;
		int[][] arr = new int[num][num];
		while(true) {
			if(num==0) {
				break;
			}
			for(int i=0;i<num;i++) {
				hori -= sum;
				arr[vert][hori] = count;
				count++;
			}
			num--;
			for(int i=0;i<num;i++) {
				vert += sum;
				arr[vert][hori] = count;
				count++;
			}
			sum *= chag;
		}
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				System.out.print(arr[i][k]+"\t");
			}
			System.out.println();
		}
	}
//	���� ����
//	1. ��� ����(���̵�: ��)
//	�׿��� ��� ���ε��� ������ ���ܳ��� ��Ҹ� �˷��� ��������� �տ� �־���.
//	�׷��� �� ��������� ���ڷ� ��ȣȭ�Ǿ� �־� ��ġ�� Ȯ���ϱ� ���ؼ��� ��ȣ�� �ص��ؾ� �Ѵ�.
//	������ ���� ��ȣ�� �ص��� ����� ������� �޸� �Բ� �߰��ߴ�.
//
//	1) ������ �� ���� ���̰� n�� ���簢�� �迭 ���·�,
//	�� ĭ�� �����顱(�� ��) �Ǵ� ������(��#��) �� ������ �̷���� �ִ�.
//	2) ��ü ������ �� ���� ������ ���ļ� ���� �� �ִ�. ���� ������ 1���� ������ 2����� ����.
//	���� 1 �Ǵ� ���� 2 �� ��� �ϳ��� ���� �κ��� ��ü ���������� ���̴�.
//	���� 1�� ���� 2���� ��� ������ �κ��� ��ü ���������� �����̴�.
//	3) ������ 1���� ������ 2���� ���� ���� �迭�� ��ȣȭ�Ǿ� �ִ�.
//	4) ��ȣȭ�� �迭�� ������ �� �����ٿ��� �� �κ��� 1,
//	���� �κ��� 0���� ��ȣȭ���� �� ������� �������� �ش��ϴ� ���� �迭�̴�.
//	�׿��� ���ε��� ������ �տ� ���� �� �ֵ���,
//	��������� ��ȣ�� �ص��ϴ� �۾��� ������ ���α׷��� �ۼ��϶�.
//
//	�Է� ����
//	�Է����� ������ �� �� ũ�� n �� 2���� ���� �迭 arr1, arr2�� ���´�.
//
// - 1 < n < 16
// - arr1, arr2�� ���� n�� ���� �迭�� �־�����.
// - ���� �迭�� �� ���� x�� �������� ��ȯ���� ���� ���̴� n �����̴�. ��, 0 < x < 2^n - 1�� �����Ѵ�.
//	��� ����
//	������ ��������� �ص��Ͽ� "#", �������� ������ ���ڿ� �迭�� ����϶�.
//
//	����� ����


	// 1. n�� �Է¹��� /  1<n<16
	// 2. �� 2���� �迭 ����
	// 3. �� �迭�� col���� ������ �� x ���� / 1 < x < 2^n-1
	// 4. x���� 2������ ���� -- ing
	// 5. �� �迭 index�� 2������ ������ ���� #���� ǥ��
	// 6. �� �迭�� 2������ ��ħ ( 1�� �ִ� ���� 1�� ǥ�� )
	// 7. �ڷᰪ ���
	
	public void exam19() { // īī�� ���� 1
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		while(true){
			System.out.print("���� �� ���� ���� > ");
			int range = sc.nextInt();
			if(1<range && range<16) {
				int[][] arr1 = new int[range][range];
				int[][] arr2 = new int[range][range];
				char[][] map = new char[range][range];
				for(int i=0;i<arr1.length;i++) {
					arr1[i][0]=r.nextInt(2^range-1);
				}
				arri[i][0]%2
				
				
				
				
				
				
			}else {
				System.out.println("2~15������ ���� �Է����ּ���.");
				continue;
			}
		}
	}
	public void exam20() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("���� �� ���� ���� > ");
		int range = sc.nextInt();
		int num = 0;
		if(1<range && range<16) {
			int[][] arr1 = new int[range][range];
			int[][] arr2 = new int[range][range];
			char[][] map = new char[range][range];
			for(int i=0;i<arr1.length;i++) {
				arr1[i][num]=r.nextInt(!!!!!!!!);
				for(int k=0;k>arr1[i].length;k++) {
					if((arr1[i][num]/(2^(k+1)))%2==0) {
						map[i][k]=0;
					}else {
						arr1[i][k]=1;
					}
				}
			}
			for(int i=0;i<arr1.length;i++) {
				for(int k=0;k<arr1[i].length;k++) {
					System.out.print(arr1[i][k]+"\t");
				}
				System.out.println();
			}
		}
	}
}