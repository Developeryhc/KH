package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.vo.Gold;
import kr.or.iei.vo.Silver;
import kr.or.iei.vo.Vip;
import kr.or.iei.vo.Vvip;

public class PointMgr {
	Scanner sc;
	Silver[] s;
	Gold[] g;
	Vip[] v;
	Vvip[] vv;
	int[] index;
	char flag;
	
	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		s = new Silver[10];
		g = new Gold[10];
		v = new Vip[10];
		vv = new Vvip[10];
		index = new int[4];
	}
	public void main() {
		while(true) {
			System.out.println("===== ȸ�� ���� ���� ���α׷�v3 =====");
			System.out.println("1. ȸ�� ���� ���");
			System.out.println("2. ȸ�� ���� ��ȸ(��ü)");
			System.out.println("3. ȸ�� ���� ��ȸ(����)");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ����");
			System.out.println("6. ȸ�� ���� ��ȸ(���");
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
		System.out.print("��� ��� [silver/gold/vip/vvip] : ");
		String mGrade = sc.next();
		System.out.print("��� �̸� : ");
		String mName = sc.next();
		System.out.print("��� ����Ʈ : ");
		int mPoint = sc.nextInt();
		if(mGrade.equals("silver")||mGrade.equals("Silver")) {
			s[index[0]++] = new Silver(mGrade,mName,mPoint);
		}else if(mGrade.equals("gold")||mGrade.equals("Gold")) {
			g[index[1]++] = new Gold(mGrade,mName,mPoint);
		}else if(mGrade.equals("vip")||mGrade.equals("Vip")) {
			v[index[2]++] = new Vip(mGrade,mName,mPoint);
		}else if(mGrade.equals("vvip")||mGrade.equals("Vvip")) {
			vv[index[3]++] = new Vvip(mGrade,mName,mPoint);
		}
		System.out.println("=================");
		System.out.println("ȸ�� ���� ��� �Ϸ�");
		System.out.println("=================");
	}
	public void printAllMember() {
		System.out.println("===== ȸ�� ���� ��ȸ(��ü) =====");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		System.out.println("==============================");
		for(int i=0;i<index.length;i++) {
			for(int k=0;k<index[i];k++) {
				if(i==0) {
					System.out.println(s[k].getGrade()+"\t"+s[k].getName()+"\t"+s[k].getPoint()+"\t"+s[k].getBonus());
				}else if(i==1) {
					System.out.println(g[k].getGrade()+"\t"+g[k].getName()+"\t"+g[k].getPoint()+"\t"+g[k].getBonus());
				}else if(i==2) {
					System.out.println(v[k].getGrade()+"\t"+v[k].getName()+"\t"+v[k].getPoint()+"\t");
					System.out.printf("%.1f\t", v[k].getBonus());
				}else if(i==3) {
					System.out.print(vv[k].getGrade()+"\t"+vv[k].getName()+"\t"+vv[k].getPoint()+"\t"+vv[k].getBonus());
				}
			}
		}
		System.out.println("=================");
		System.out.println("ȸ�� ���� ��ȸ �Ϸ�");
		System.out.println("=================");
	}
	public void printOneMember() {
		System.out.println("===== ȸ�� ���� ��ȸ(����) =====");
		System.out.print("��ȸ�� ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		System.out.println("==============================");
		if(searchIndex == -1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else if(flag=='s') {
			System.out.println(s[searchIndex].getGrade()+"\t"+s[searchIndex].getName()+"\t"+s[searchIndex].getPoint()+"\t"+s[searchIndex].getBonus());
		}else if(flag=='g') {
			System.out.println(g[searchIndex].getGrade()+"\t"+g[searchIndex].getName()+"\t"+g[searchIndex].getPoint()+"\t"+g[searchIndex].getBonus());
		}else if(flag=='v') {
			System.out.print(v[searchIndex].getGrade()+"\t"+v[searchIndex].getName()+"\t"+v[searchIndex].getPoint());
			System.out.printf("%.1f\n", v[searchIndex].getBonus());
		}else {
			System.out.println(vv[searchIndex].getGrade()+"\t"+vv[searchIndex].getName()+"\t"+vv[searchIndex].getPoint()+"\t"+vv[searchIndex].getBonus());
		}
	}
	public void modifyMember() {
		System.out.println("===== ȸ�� ���� ���� =====");
		System.out.print("������ ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else if(flag=='s') {
			for(int i=searchIndex;i<index[0];i++) {
				s[i] = s[i+1];
			}
			s[--index[0]]=null;
		}else if(flag=='g') {
			for(int i=searchIndex;i<index[1];i++) {
				g[i] = g[i+1];
			}
			g[--index[1]]=null;
		}else if(flag=='v') {
			for(int i=searchIndex;i<index[2];i++) {
				v[i] = v[i+1];
			}
			v[--index[2]]=null;
		}else {
			for(int i=searchIndex;i<index[3];i++) {
				vv[i] = vv[i+1];
			}
			vv[--index[3]]=null;
		}
		System.out.print("���� ��� : ");
		String mGrade = sc.next();
		System.out.print("���� �̸� : ");
		String mName = sc.next();
		System.out.print("���� ����Ʈ : ");
		int mPoint = sc.nextInt();
		switch(mGrade) {
		case "silver":
			s[index[0]++] = new Silver(mGrade,mName,mPoint);
			break;
		case "gold":
			g[index[1]++] = new Gold(mGrade,mName,mPoint);
			break;
		case "vip":
			v[index[2]++] = new Vip(mGrade,mName,mPoint);
			break;
		case "vvip":
			vv[index[3]++] = new Vvip(mGrade,mName,mPoint);
			break;
		}
	}
	public void deleteMember() {
		System.out.println("===== ȸ�� ���� ���� =====");
		System.out.print("������ ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else if(flag=='s') {
			for(int i=searchIndex;i<index[0];i++) {
				s[i] = s[i+1];
			}
			s[--index[0]]=null;
		}else if(flag=='g') {
			for(int i=searchIndex;i<index[1];i++) {
				g[i] = g[i+1];
			}
			g[--index[1]]=null;
		}else if(flag=='v') {
			for(int i=searchIndex;i<index[2];i++) {
				v[i] = v[i+1];
			}
			v[--index[2]]=null;
		}else {
			for(int i=searchIndex;i<index[3];i++) {
				vv[i] = vv[i+1];
			}
			vv[--index[3]]=null;
		}
	}
	public void printGradeMember() {
		
	}
	public int searchMember(String searchName) {
		for(int i=0;i<index.length;i++) {
			for(int k=0;k<index[i];k++) {
				if(i==0 && s[k].equals(searchName)) {
					flag = 's';
					return k;
				}else if(i==1 && g[k].equals(searchName)) {
					flag = 'g';
					return k;
				}else if(i==2 && v[k].equals(searchName)) {
					flag = 'v';
					return k;
				}else if(i==3 && vv[k].equals(searchName)){
					flag = 'V';
					return k;
				}
			}
		}
		return -1;
	}
}
