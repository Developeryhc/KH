package kr.or.iei.controller;

import java.util.Scanner;
import kr.or.iei.vo.*;

public class PointMgr {
	Scanner sc;
	Silver[] s;
	int index;
	Gold[] g;
	int gIndex;
	Vip[] v;
	int vIndex;
	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		s = new Silver[10];
		g = new Gold[10];
		v = new Vip[10];
		index = 0;
		gIndex = 0;
		vIndex = 0;
	}
	public void main() {
		while(true) {
			System.out.println("===== ����Ʈ ���� ���α׷�v2 =====");
			System.out.println("1. ȸ�� ���� ���");
			System.out.println("2. ��ü ȸ�� ��ȸ");
			System.out.println("3. ȸ�� 1�� ��ȸ");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ����");
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
			case 0:
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void insertMember() {
		System.out.println("===== ȸ�� ���� ��� =====");
		System.out.print("��� �Է�[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("����Ʈ �Է� : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver":
			s[index++] = new Silver(grade,name,point);
			break;
		case "gold":
			g[gIndex++] = new Gold(grade,name,point);
			break;
		case "vip":
			v[vIndex++] = new Vip(grade,name,point);
			break;
		}
		System.out.println("��� �Ϸ�!");
	}
	public void printAllMember() {
		System.out.println("===== ȸ�� ���� ��ȸ =====");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		System.out.println("========================");
		for(int i=0;i<vIndex;i++) {
			System.out.println(v[i].getGrade()+"\t"+v[i].getName()+"\t"+v[i].getPoint()+"\t"+v[i].getBonus());
		}
		for(int i=0;i<gIndex;i++) {
			System.out.println(g[i].getGrade()+"\t"+g[i].getName()+"\t"+g[i].getPoint()+"\t"+g[i].getBonus());
			
		}
		for(int i=0;i<index;i++) {
			System.out.println(s[i].getGrade()+"\t"+s[i].getName()+"\t"+s[i].getPoint()+"\t"+s[i].getBonus());			
		}
	}
	public void printOneMember() {
		System.out.print("��ȸ�� ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			System.out.println("��� : "+s[searchIndex].getGrade());
			System.out.println("�̸� : "+s[searchIndex].getName());
			System.out.println("����Ʈ : "+s[searchIndex].getPoint());
			System.out.println("���ʽ� : "+s[searchIndex].getBonus());
		}
	}
	public void modifyMember() {
		System.out.print("������ ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			System.out.print("��� �Է� : ");
//			String mGrade = sc.next();
			s[searchIndex].setGrade(sc.next());
			System.out.print("�̸� �Է� : ");
//			String mName = sc.next();
			s[searchIndex].setName(sc.next());
			System.out.print("����Ʈ �Է� : ");
//			int mPoint = sc.nextInt();
			s[searchIndex].setPoint(sc.nextInt());
			// ���ο� Silver ��ü�� �����ؼ� �ش� ��ü�� �迭�� ���� ���� �� ���� Silver ��ü�� GC�� ó��
//			s[searchIndex] = new Silver(mGrade,mName,mPoint);
			// ���� Silver ��ü�� ���� ���� ���� ����
//			s[searchIndex].setGrade(mGrade);
//			s[searchIndex].setName(mName);
//			s[searchIndex].setPoint(mPoint);
			System.out.println("ȸ�� ���� ���� �Ϸ�");
		}
	}
	public void deleteMember() {
		System.out.print("������ ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			for(int i=0;i<index-1;i++) {
				s[i]=s[i+1];
			}
			s[--index]=null;
			System.out.println("ȸ�� ���� ���� �Ϸ�");
		}
	}
	/* �� ������ .. ��¥�� 30���̸� ��޺��� ������ �ش�����
	 * �ǹ�����̸� vIndex�� gIndex�� ���� �������� ���ò���
	 * ������̸� gIndex�� index�� ���� .. ?
	 */
	public int searchMember(String name) { // ���� - �ǹ��� ���� ��忡�� ����
		for(int i=0;i<index;i++) {
			if(s[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
