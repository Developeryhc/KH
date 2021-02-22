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
	char flag; // ��޿� ���� ��ȸ ���� �з� �ĺ��� ����
	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		s = new Silver[10];
		g = new Gold[10];
		v = new Vip[10];
		index = 0;
		gIndex = 0;
		vIndex = 0;
		// Silver[] s = new Silver[10];
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
			System.out.print(s[i].getGrade()+"\t"+s[i].getName()+"\t"+s[i].getPoint()+"\t");
			System.out.printf("%.1d",s[i].getBonus());
		}
	}
	public void printOneMember() {
		System.out.print("��ȸ�� ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			if(flag=='v') {
				System.out.println("��� : "+v[searchIndex].getGrade());
				System.out.println("�̸� : "+v[searchIndex].getName());
				System.out.println("����Ʈ : "+v[searchIndex].getPoint());
				System.out.println("���ʽ� : "+v[searchIndex].getBonus());
			}else if(flag=='g') {
				System.out.println("��� : "+g[searchIndex].getGrade());
				System.out.println("�̸� : "+g[searchIndex].getName());
				System.out.println("����Ʈ : "+g[searchIndex].getPoint());
				System.out.println("���ʽ� : "+g[searchIndex].getBonus());
			}else if(flag=='s') {
				System.out.println("��� : "+s[searchIndex].getGrade());
				System.out.println("�̸� : "+s[searchIndex].getName());
				System.out.println("����Ʈ : "+s[searchIndex].getPoint());
				System.out.println("���ʽ� : "+s[searchIndex].getBonus());
			}
		}
	}
	public void modifyMember() {
		System.out.print("������ ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			System.out.print("��� �Է� : ");
			String mGrade = sc.next();
			System.out.print("�̸� �Է� : ");
			String mName = sc.next();
			System.out.print("����Ʈ �Է� : ");
			int mPoint = sc.nextInt();
			if(flag == 'v') {
				for(int i=searchIndex;i<vIndex;i++) {
					v[i] = v[i+1];					
				}
				v[--vIndex]=null;
			}else if(flag == 'g') {
				for(int i=searchIndex;i<gIndex;i++) {
					g[i] = g[i+1];				
				}
				g[--gIndex]=null;
			}else {
				for(int i=searchIndex;i<vIndex;i++) {
					s[i] = s[i+1];
				}
				s[--index]=null;
			}
			switch(mGrade) {
			case "vip":
				v[vIndex++] = new Vip(mGrade,mName,mPoint);
				break;
			case "gold":
				g[gIndex++] = new Gold(mGrade,mName,mPoint);
				break;
			case "silver":
				s[index++] = new Silver(mGrade,mName,mPoint);
				break;
			}
			System.out.println("ȸ�� ���� ���� �Ϸ�");
		}
	}
	public void deleteMember() {
		System.out.print("������ ȸ�� �̸� : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			if(flag == 'v') {
				for(int i=0;i<vIndex-1;i++) {
					v[i]=v[i+1];
				}
				v[--vIndex] = null;
			}else if(flag == 'g') {
				for(int i=0;i<gIndex-1;i++) {
					g[i]=g[i+1];
				}
				g[--gIndex] = null;
			}else {
				for(int i=0;i<index-1;i++) {
					s[i]=s[i+1];
				}
				s[--index] = null;
			}
			System.out.println("ȸ�� ���� ���� �Ϸ�");
		}
	}
	/* 1. �� ��޺��� ��ȸ �� ��������� ��� ������� Index �߰� �� ����
	 * 2. ��޵� ���� ��ȸ (������ �̰� �����ҵ� �� ���߿� ���������� ������� �� �����ְ� ������ �� ����� �����ҵ�)
	 * 3. �� ����� �迭�� ó������ ���� �� ��������� ��� ������� Index �߰� �� ����
	 * 4. ��޿� �´� ������ �����͸� �ϳ� ���� �� ��� ��, ǥ�Ŀ� ���� ��� ���
	 */
	public int searchMember(String name) { // ���� - ��������� vip�ο��� ���� ����.
		// 1�� �� ��޺��� ��ȸ �� ��������� ��� ��������� Index�� ���� ������ ���� ��	���� ��� �� ���� �� ��ŭ ����
		for(int i=0;i<vIndex;i++) { // �� ����� Vip����� ���
			if(v[i].getName().equals(name)) {
				flag = 'v';
				return i;
				}
			}
		for(int i=0;i<gIndex;i++) {	// �� ����� Gold����� ���
			if(g[i].getName().equals(name)) {
				flag = 'g';
				return i;
				}
			}
		for(int i=0;i<index;i++) {	// �� ����� Silver����� ���
			if(s[i].getName().equals(name)) {
				flag = 's';
				return i;
				}
			}
		// 3�� �� ����� �迭 ù��°���� ��ȸ�غ��� ���� ��� �ο��� ���� �� ��� ���� ��� �ο��� ���� ���� ���� �� ���� ��� �� ������� index��ŭ ���ָ� �ش� ����� �ο� ����
//		for(int i=0;i<(vIndex==gIndex?(vIndex>index?vIndex:index):(vIndex>gIndex?(vIndex>index?vIndex:index):gIndex));i++) {
//			if(v[i].getName().equals(name)) {
//				return i;
//			}else if(g[i].getName().equals(name)) {
//				return (i+vIndex);
//			}else if(s[i].getName().equals(name)){
//				return (i+vIndex+gIndex);
//			}
//		}
		return -1;
	}
}
