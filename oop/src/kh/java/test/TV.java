package kh.java.test;

public class TV {
	// 속성 : 크기, 전원, 볼륨, 채널				→ 변수
	// 크기 → Data Type : int, 		Variable Name : size
	// 전원 → Data Type : boolean,	Variable Name : power
	// 볼륨 → Data Type : int,		Variable Name : vol
	// 채널 → Data Type : int,		Variable Name : ch
	// 전역 변수는 선언 시 자동으로 초기화
	// 숫자 (정수*4, 실수*2) → 0, 문자 → (''), 논리 → false, 참조형 → null
	int size;		// 0		→
	boolean power;	// false	→ 
	int vol;		// 0		→
	int ch;			// 0		→
	
	// 기능 : 전원 On/Off, 볼륨 조절, 채널 변경		→ 메소드
	// 전원 On/Off	 → Method Name : power
	// 볼륨조절		 → Method Name : volUp(), vodDown()
	// 채널변경		 → Method Name : chUp(), chDown(), chChange()
	
	public void power() {
		power = !power;
		if(power) {
			System.out.println("전원이 켜졌습니다.");
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	public void volUp() {
		if(vol != 100) {
			vol++;
		}
		System.out.println("현재 볼륨 : "+vol);
	}
	public void volDown() {
		if(vol != 0) {
			vol--;
		}
		System.out.println("현재 볼륨 : "+vol);
	}
	public void chUp() {
		if( ch != 100) {
			ch++;
		}
		System.out.println("현재 채널 : "+ch);
	}
	public void chDown() {
		if(ch != 0) {
			ch--;
		}
		System.out.println("현재 채널 : "+ch);
	}
	public void chChange(int changeCh) {
		ch = changeCh;
		System.out.println("현재 채널 : "+ch);
	}
}
