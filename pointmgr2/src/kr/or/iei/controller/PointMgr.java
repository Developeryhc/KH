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
			System.out.println("===== 포인트 관리 프로그램v2 =====");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 조회");
			System.out.println("3. 회원 1명 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
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
			case 0:
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void insertMember() {
		System.out.println("===== 회원 정보 등록 =====");
		System.out.print("등급 입력[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("포인트 입력 : ");
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
		System.out.println("등록 완료!");
	}
	public void printAllMember() {
		System.out.println("===== 회원 정보 조회 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
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
		System.out.print("조회할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
		}else {
			System.out.println("등급 : "+s[searchIndex].getGrade());
			System.out.println("이름 : "+s[searchIndex].getName());
			System.out.println("포인트 : "+s[searchIndex].getPoint());
			System.out.println("보너스 : "+s[searchIndex].getBonus());
		}
	}
	public void modifyMember() {
		System.out.print("수정할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
		}else {
			System.out.print("등급 입력 : ");
//			String mGrade = sc.next();
			s[searchIndex].setGrade(sc.next());
			System.out.print("이름 입력 : ");
//			String mName = sc.next();
			s[searchIndex].setName(sc.next());
			System.out.print("포인트 입력 : ");
//			int mPoint = sc.nextInt();
			s[searchIndex].setPoint(sc.nextInt());
			// 새로운 Silver 객체를 생성해서 해당 객체로 배열의 값을 변경 → 기존 Silver 객체는 GC로 처리
//			s[searchIndex] = new Silver(mGrade,mName,mPoint);
			// 기존 Silver 객체의 내부 변수 값을 수정
//			s[searchIndex].setGrade(mGrade);
//			s[searchIndex].setName(mName);
//			s[searchIndex].setPoint(mPoint);
			System.out.println("회원 정보 수정 완료");
		}
	}
	public void deleteMember() {
		System.out.print("삭제할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
		}else {
			for(int i=0;i<index-1;i++) {
				s[i]=s[i+1];
			}
			s[--index]=null;
			System.out.println("회원 정보 수정 완료");
		}
	}
	/* 내 생각은 .. 어짜피 30명이면 등급별로 순차를 준다음에
	 * 실버등급이면 vIndex랑 gIndex를 빼면 나머지가 나올꺼고
	 * 골드등급이면 gIndex랑 index를 빼면 .. ?
	 */
	public int searchMember(String name) { // 숙제 - 실버에 없음 골드에서 순번
		for(int i=0;i<index;i++) {
			if(s[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
