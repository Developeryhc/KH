package kh.java.control;

public class ForExam {
	// ���� 1 - ������ 2~9�� �������� ��� (�� ���� ��, �� �ٲ�)
	public void exam1() {
		// 1. 2���� ����Ѵ�. (x��)
		// 2. n���� ����Ѵ�. (y��)
		// 3. n�� 2���� 9���� ������� �ݺ��Ѵ�.
		// 2�ܺ��� 9�ܱ��� �ݺ���
		for(int i=2; i<=9; i++) {
			// �� �ܺ��� 1���� 9���� �ݺ�
			for(int j=1; j<=9; j++) {
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			// �� �ܺ��� 1���� 9���� �ݺ� �� �ٹٲ�
			System.out.println();
		}
	}
	// ���� 2 - ������ 2~9�� �������� ��� (�� �ܺ� ���η� ���)
	public void exam2() {
		// 1. �� �ܺ� 1���� ����Ѵ�. (x��)
		// 2. �� �ܺ� n���� ����Ѵ�. (y��)
		// 3. n�� 1���� n���� ������� �ݺ��Ѵ�.
		// 2~9�ܱ����� ù�� �ݺ���
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}System.out.println();
		}
	}
}
