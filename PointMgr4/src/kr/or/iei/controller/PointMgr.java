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
			System.out.println("===== 회원 정보 관리 프로그램v4 =====");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 회원 정보 조회(전체)");
			System.out.println("3. 회원 정보 조회(단일)");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("6. 회원 정보 조회(등급)");
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
		System.out.print("회원 등급[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("회원 이름 : ");
		String name = sc.next();
		System.out.print("회원 포인트 : ");
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
		System.out.println("회원 등록 완료");
		System.out.println("============");
	}
	public void printAllMember() {
		System.out.println("===== 회원 정보 조회(전체) =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("==============================");
		for(int i=0;i<index;i++) {
			System.out.println(members[i].getGrade()+"\t"+members[i].getName()+"\t"+members[i].getPoint()+"\t"+members[i].getBonus());
		}
		System.out.println("============");
		System.out.println("회원 조회 완료");
		System.out.println("============");
	}
	public void printOneMember() {
		System.out.println("===== 회원 정보 조회(단일) =====");
		System.out.print("조회할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex==-1) {
			System.out.println("회원이 존재하지 않습니다.");
		}else {
			System.out.println("회원 등급 : "+members[searchIndex].getGrade());
			System.out.println("회원 이름 : "+members[searchIndex].getName());
			System.out.println("회원 포인트 : "+members[searchIndex].getPoint());
			System.out.println("회원 보너스 : "+members[searchIndex].getBonus());
			System.out.println("============");
			System.out.println("회원 조회 완료");
			System.out.println("============");
		}
	}
	public void modifyMember() {
		System.out.println("===== 회원 정보 수정 =====");
		System.out.print("수정할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex==-1) {
			System.out.println("회원이 존재하지 않습니다.");
		}else {
			System.out.print("수정 등급 입력[silver/gold/vip/vvip] : ");
			String mGrade = sc.next();
			System.out.print("수정 이름 입력 : ");
			String mName = sc.next();
			System.out.print("수정 포인트 입력 : ");
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
			System.out.println("회원 수정 완료");
			System.out.println("============");
		}
	}
	public void deleteMember() {
		System.out.println("===== 회원 정보 삭제 =====");
		System.out.print("삭제할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		}else {
			for(int i=searchIndex;i<index;i++) {
				members[i] = members[i+1];
			}
			members[--index] = null;
			System.out.println("============");
			System.out.println("회원 삭제 완료");
			System.out.println("============");
		}
	}
	public void printGradeMember() {
		System.out.println("===== 회원 정보 조회(등급) =====");
		System.out.print("조회할 회원 등급 : ");
		String searchGrade = sc.next();
		for(int i=0;i<index;i++) {
			if(searchGrade.equals("silver")||searchGrade.equals("gold")||searchGrade.equals("vip")||searchGrade.equals("vvip")) {
				if(members[i].getGrade().equals(searchGrade)) {
					System.out.println(members[i].getGrade()+"\t"+members[i].getName()+"\t"+members[i].getPoint()+"\t"+members[i].getBonus());
				}
			}else {
				System.out.println("등급이 존재하지 않습니다.");
				
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
