package controller;

import view.ClothingView;
import vo.Bottom;
import vo.Outer;
import vo.Product;
import vo.Top;

public class ClothingController {
	ClothingView view;
	Product[] pd;
	Top[] tp;
	Bottom[] bt;
	Outer[] ot;
	int pdNum;
	int tpNum;
	int btNum;
	int otNum;
	
	public ClothingController() {
		super();
		view = new ClothingView();
		pd = new Product[9];
		pdNum = 0;
	}

	public void main() {
		while (true) {
			switch (view.showMain()) {
			case 0:
				view.printMsg("BYE!");
				return;
			case 1:
				registerController(view.adminMenu());
				break;
			case 2:
				
				break;
			default:
				view.printMsg("관리자, 고객 중 입력해주세요.");
				break;
			}
		}
	}
	public void registerController(int sel) {
		switch(sel) {
		case 1:
			String Category= view.valueCategory();
			switch(Category) {
			case "top":
				pd[pdNum++] = new Top(Category,view.valueName(),view.valueAmount(),view.valuePrice());
				break;
			case "bottom":
				pd[pdNum++]	= new Bottom(Category,view.valueName(),view.valueAmount(),view.valuePrice());
				break;
			case "outer":
				pd[pdNum++] = new Outer(Category,view.valueName(),view.valueAmount(),view.valuePrice());
				break;
			}
		case 2:	// 미완성
			view.checkStockList("top");
			for(int i=0;i<pdNum;i++) {
				if(pd[i].getCategory().equals("top")) {
					view.checkStock(pd, i);
				}
			}
			view.checkStockList("bottom");
			for(int i=0;i<pdNum;i++) {
				if(pd[i].getCategory().equals("bottom")) {
					view.checkStock(pd, i);
				}
			}
			view.checkStockList("outer");
			for(int i=0;i<pdNum;i++) {
				if(pd[i].getCategory().equals("outer")) {
					view.checkStock(pd, i);
				}
			}
			break;
		case 3:
			
			break;
		case 0:
			return;
		default:
			view.printMsg("잘못 입력하셨습니다.");
			break;
	}
	/*
	public void registerController(int sel) {
		String name;
		int amount;
		int price;
		int sel3 = view.registerView();
		Product pro = new Product();

		switch (sel3) {
		case 1:
			name = view.valueName();
			amount = view.valueAmount();
			price = view.valuePrice();
			pro = new Top(price, name, amount);

			break;
		case 2:
			name = view.valueName();
			amount = view.valueAmount();
			price = view.valuePrice();
			pro = new Bottom(price, name, amount);
			System.out.println(pro.toString());
			break;
		case 3:
			name = view.valueName();
			amount = view.valueAmount();
			price = view.valuePrice();
			pro = new Outer(price, name, amount);
			System.out.println(pro.toString());
			break;
		case 0:
			return;
		}
		*/
	}
}