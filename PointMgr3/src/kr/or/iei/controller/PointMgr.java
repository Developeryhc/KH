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
			System.out.println("===== 회원 정보 관리 프로그램v3 =====");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 회원 정보 조회(전체)");
			System.out.println("3. 회원 정보 조회(단일)");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("6. 회원 정보 조회(등급");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
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
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	public void insertMember() {
		System.out.println("===== 회원 정보 등록 =====");
		System.out.print("등록 등급 [silver/gold/vip/vvip] : ");
		String mGrade = sc.next();
		System.out.print("등록 이름 : ");
		String mName = sc.next();
		System.out.print("등록 포인트 : ");
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
		System.out.println("회원 정보 등록 완료");
		System.out.println("=================");
	}
	public void printAllMember() {
		System.out.println("===== 회원 정보 조회(전체) =====");
		System.out.println("등급\t이름\t포인트\t보너스");
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
		System.out.println("회원 정보 조회 완료");
		System.out.println("=================");
	}
	public void printOneMember() {
		System.out.println("===== 회원 정보 조회(단일) =====");
		System.out.print("조회할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("==============================");
		if(searchIndex == -1) {
			System.out.println("잘못 입력하셨습니다.");
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
		System.out.println("===== 회원 정보 수정 =====");
		System.out.print("수정할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("잘못 입력하셨습니다.");
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
		System.out.print("수정 등급 : ");
		String mGrade = sc.next();
		System.out.print("수정 이름 : ");
		String mName = sc.next();
		System.out.print("수정 포인트 : ");
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
		System.out.println("===== 회원 정보 삭제 =====");
		System.out.print("삭제할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("잘못 입력하셨습니다.");
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
