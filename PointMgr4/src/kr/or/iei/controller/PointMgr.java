package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.vo.Gold;
import kr.or.iei.vo.Grade;
import kr.or.iei.vo.Silver;
import kr.or.iei.vo.Vip;
import kr.or.iei.vo.Vvip;

public class PointMgr {
	Scanner sc;
	Grade[] members;
	int index;
	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		members = new Grade[40];
		index = 0;
	}
	public void main() {
		while(true) {
			System.out.println("===== ȸ�� ���� ���� ���α׷�v4 =====");
			System.out.println("1. ȸ�� ���� ���");
			System.out.println("2. ȸ�� ���� ��ȸ(��ü)");
			System.out.println("3. ȸ�� ���� ��ȸ(����)");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ����");
			System.out.println("6. ȸ�� ���� ��ȸ(���)");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllMember();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				modifyMember();
				break;
			case 5:
				deleteMember();
				break;
			case 6:
				printGradeMember();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
	public void insertMember() {
		System.out.println("===== ȸ�� ���� ��� =====");
		System.out.print("ȸ�� ���[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("ȸ�� �̸� : ");
		String name = sc.next();
		System.out.print("ȸ�� ����Ʈ : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver":
			members[index++] = new Silver(grade,name,point);
			break;
		case "gold":
			members[index++] = new Gold(grade,name,point);
			break;
		case "vip":
			members[index++] = new Vip(grade,name,point);
			break;
		case "vvip":
			members[index++] = new Vvip(grade,name,point);
		}
		System.out.println("============");
		System.out.println("ȸ�� ��� �Ϸ�");
		System.out.println("============");
	}
	public void printAllMember() {
		System.out.println("===== ȸ�� ���� ��ȸ(��ü) =====");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		System.out.println("==============================");
		for(int i=0;i<index;i++) {
			System.out.println(members[i].getGrade()+"\t"+members[i].getName()+"\t"+members[i].getPoint()+"\t"+members[i].getBonus());
		}
		System.out.println("============");
		System.out.println("ȸ�� ��ȸ �Ϸ�");
		System.out.println("============");
	}
	public void printOneMember() {
		System.out.println("===== ȸ�� ���� ��ȸ(����) =====");
		System.out.print("��ȸ�� ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex==-1) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("ȸ�� ��� : "+members[searchIndex].getGrade());
			System.out.println("ȸ�� �̸� : "+members[searchIndex].getName());
			System.out.println("ȸ�� ����Ʈ : "+members[searchIndex].getPoint());
			System.out.println("ȸ�� ���ʽ� : "+members[searchIndex].getBonus());
			System.out.println("============");
			System.out.println("ȸ�� ��ȸ �Ϸ�");
			System.out.println("============");
		}
	}
	public void modifyMember() {
		System.out.println("===== ȸ�� ���� ���� =====");
		System.out.print("������ ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex==-1) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.print("���� ��� �Է�[silver/gold/vip/vvip] : ");
			String mGrade = sc.next();
			System.out.print("���� �̸� �Է� : ");
			String mName = sc.next();
			System.out.print("���� ����Ʈ �Է� : ");
			int mPoint = sc.nextInt();
			switch(mGrade) {
			case "silver":
				members[searchIndex] = new Silver(mGrade,mName,mPoint);
				break;
			case "gold":
				members[searchIndex] = new Gold(mGrade,mName,mPoint);
				break;
			case "vip":
				members[searchIndex] = new Vip(mGrade,mName,mPoint);
				break;
			case "vvip":
				members[searchIndex] = new Vvip(mGrade,mName,mPoint);
			}
			System.out.println("============");
			System.out.println("ȸ�� ���� �Ϸ�");
			System.out.println("============");
		}
	}
	public void deleteMember() {
		System.out.println("===== ȸ�� ���� ���� =====");
		System.out.print("������ ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		}else {
			for(int i=searchIndex;i<index;i++) {
				members[i] = members[i+1];
			}
			members[--index] = null;
			System.out.println("============");
			System.out.println("ȸ�� ���� �Ϸ�");
			System.out.println("============");
		}
	}
	public void printGradeMember() {
		System.out.println("===== ȸ�� ���� ��ȸ(���) =====");
		System.out.print("��ȸ�� ȸ�� ��� : ");
		String searchGrade = sc.next();
		for(int i=0;i<index;i++) {
			if(searchGrade.equals("silver")||searchGrade.equals("gold")||searchGrade.equals("vip")||searchGrade.equals("vvip")) {
				if(members[i].getGrade().equals(searchGrade)) {
					System.out.println(members[i].getGrade()+"\t"+members[i].getName()+"\t"+members[i].getPoint()+"\t"+members[i].getBonus());
				}
			}else {
				System.out.println("����� �������� �ʽ��ϴ�.");
				
			}
		}
	}
	public int searchMember(String name) {
		for(int i=0;i<index;i++) {
			if(members[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
