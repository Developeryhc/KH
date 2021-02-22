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
	char flag; // 등급에 따른 조회 기준 분류 식별자 변수
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
			System.out.print(s[i].getGrade()+"\t"+s[i].getName()+"\t"+s[i].getPoint()+"\t");
			System.out.printf("%.1d",s[i].getBonus());
		}
	}
	public void printOneMember() {
		System.out.print("조회할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
		}else {
			if(flag=='v') {
				System.out.println("등급 : "+v[searchIndex].getGrade());
				System.out.println("이름 : "+v[searchIndex].getName());
				System.out.println("포인트 : "+v[searchIndex].getPoint());
				System.out.println("보너스 : "+v[searchIndex].getBonus());
			}else if(flag=='g') {
				System.out.println("등급 : "+g[searchIndex].getGrade());
				System.out.println("이름 : "+g[searchIndex].getName());
				System.out.println("포인트 : "+g[searchIndex].getPoint());
				System.out.println("보너스 : "+g[searchIndex].getBonus());
			}else if(flag=='s') {
				System.out.println("등급 : "+s[searchIndex].getGrade());
				System.out.println("이름 : "+s[searchIndex].getName());
				System.out.println("포인트 : "+s[searchIndex].getPoint());
				System.out.println("보너스 : "+s[searchIndex].getBonus());
			}
		}
	}
	public void modifyMember() {
		System.out.print("수정할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
		}else {
			System.out.print("등급 입력 : ");
			String mGrade = sc.next();
			System.out.print("이름 입력 : ");
			String mName = sc.next();
			System.out.print("포인트 입력 : ");
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
			System.out.println("회원 정보 수정 완료");
		}
	}
	public void deleteMember() {
		System.out.print("삭제할 회원 이름 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
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
			System.out.println("회원 정보 수정 완료");
		}
	}
	/* 1. 각 등급별로 조회 후 하위등급일 경우 상위등급 Index 추가 후 리턴
	 * 2. 등급도 같이 조회 (솔직히 이건 불편할듯 → 나중에 동명이인이 있을경우 다 보여주고 선택할 때 기능이 유용할듯)
	 * 3. 각 등급의 배열을 처음부터 조사 후 하위등급일 경우 상위등급 Index 추가 후 리턴
	 * 4. 등급에 맞는 문자형 데이터를 하나 삽입 → 출력 시, 표식에 따른 등급 출력
	 */
	public int searchMember(String name) { // 숙제 - 평균적으로 vip인원이 제일 적음.
		// 1번 각 등급별로 조회 후 하위등급일 경우 상위등급의 Index를 더한 값으로 리턴 →	이후 출력 시 더한 값 만큼 빼기
		for(int i=0;i<vIndex;i++) { // 비교 대상이 Vip등급인 경우
			if(v[i].getName().equals(name)) {
				flag = 'v';
				return i;
				}
			}
		for(int i=0;i<gIndex;i++) {	// 비교 대상이 Gold등급인 경우
			if(g[i].getName().equals(name)) {
				flag = 'g';
				return i;
				}
			}
		for(int i=0;i<index;i++) {	// 비교 대상이 Silver등급인 경우
			if(s[i].getName().equals(name)) {
				flag = 's';
				return i;
				}
			}
		// 3번 각 등급의 배열 첫번째부터 조회해보고 하위 등급 인원이 선정 될 경우 상위 등급 인원을 더한 값을 리턴 → 이후 출력 시 상위등급 index만큼 빼주면 해당 등급의 인원 산출
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
