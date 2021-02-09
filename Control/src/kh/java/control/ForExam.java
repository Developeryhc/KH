package kh.java.control;

public class ForExam {
	// 문제 1 - 구구단 2~9단 우측으로 출력 (단 변경 시, 줄 바꿈)
	public void exam1() {
		// 1. 2단을 출력한다. (x축)
		// 2. n단을 출력한다. (y축)
		// 3. n을 2부터 9까지 순서대로 반복한다.
		// 2단부터 9단까지 반복문
		for(int i=2; i<=9; i++) {
			// 각 단별로 1부터 9까지 반복
			for(int j=1; j<=9; j++) {
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			// 각 단별로 1부터 9까지 반복 후 줄바꿈
			System.out.println();
		}
	}
	// 문제 2 - 구구단 2~9단 우측으로 출력 (각 단별 세로로 출력)
	public void exam2() {
		// 1. 각 단별 1항을 출력한다. (x축)
		// 2. 각 단별 n항을 출력한다. (y축)
		// 3. n을 1부터 n까지 순서대로 반복한다.
		// 2~9단까지의 첫항 반복문
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}System.out.println();
		}
	}
}
