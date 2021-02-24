package view;

import java.util.Scanner;

import vo.Product;

public class ClothingView {
	Scanner sc;

	public ClothingView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMain() {
		System.out.println("===================== ���θ�v1 ====================");
		System.out.println("1. Admin");
		System.out.println("2. Customer");
		System.out.println("0. Exit");
		System.out.print("���� > ");
		return sc.nextInt();
	}

	public int adminMenu() {
		System.out.println("====================== Admin ======================");
		System.out.println("1. ��� register");
		System.out.println("2. ��� check");
		System.out.println("3. ��� drop");
		System.out.println("0. ���ư���");
		System.out.print("���� > ");
		return sc.nextInt();
	}

	public String valueCategory() {
		System.out.println("==================== adminMenu ====================");
		System.out.print("������ �Է����ּ���[top/bottom/outer] : ");
		return sc.next();
	}

	public String valueName() {
		System.out.print("�̸��� �Է����ּ��� : ");
		sc.nextLine();
		return sc.nextLine();
	}

	public int valueAmount() {
		System.out.print("������ �Է����ּ��� : ");
		return sc.nextInt();
	}

	public int valuePrice() {
		System.out.print("������ �Է����ּ��� : ");
		return sc.nextInt();
	}
	public void checkStockList(String category) {
		System.out.println("======================= "+category+" =======================");
		System.out.println("�� ��ȣ\t����\t�̸�\t\t����\t�ǸŰ���\t ��");
		System.out.println("===================================================");
	}
	public void checkStock(Product[] pd, int pdNum) {
		System.out.println("   "+(pdNum+1)+"\t"+pd[pdNum].getName()+"\t"+pd[pdNum].getAmount()+"\t"+pd[pdNum].getPrice());
	}
	public int dropStock() {
		System.out.println("���� >");
		return sc.nextInt();
	}
	public void printMsg(String msg) {

		System.out.println(msg);
	}
}
