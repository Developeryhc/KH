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
		System.out.println("===================== 쇼핑몰v1 ====================");
		System.out.println("1. Admin");
		System.out.println("2. Customer");
		System.out.println("0. Exit");
		System.out.print("선택 > ");
		return sc.nextInt();
	}

	public int adminMenu() {
		System.out.println("====================== Admin ======================");
		System.out.println("1. 재고 register");
		System.out.println("2. 재고 check");
		System.out.println("3. 재고 drop");
		System.out.println("0. 돌아가기");
		System.out.print("선택 > ");
		return sc.nextInt();
	}

	public String valueCategory() {
		System.out.println("==================== adminMenu ====================");
		System.out.print("종류를 입력해주세요[top/bottom/outer] : ");
		return sc.next();
	}

	public String valueName() {
		System.out.print("이름을 입력해주세요 : ");
		sc.nextLine();
		return sc.nextLine();
	}

	public int valueAmount() {
		System.out.print("수량을 입력해주세요 : ");
		return sc.nextInt();
	}

	public int valuePrice() {
		System.out.print("가격을 입력해주세요 : ");
		return sc.nextInt();
	}
	public void checkStockList(String category) {
		System.out.println("======================= "+category+" =======================");
		System.out.println("│ 번호\t종류\t이름\t\t수량\t판매가격\t │");
		System.out.println("===================================================");
	}
	public void checkStock(Product[] pd, int pdNum) {
		System.out.println("   "+(pdNum+1)+"\t"+pd[pdNum].getName()+"\t"+pd[pdNum].getAmount()+"\t"+pd[pdNum].getPrice());
	}
	public int dropStock() {
		System.out.println("선택 >");
		return sc.nextInt();
	}
	public void printMsg(String msg) {

		System.out.println(msg);
	}
}
