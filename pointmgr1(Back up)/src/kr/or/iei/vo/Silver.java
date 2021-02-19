package kr.or.iei.vo; // Value Object

public class Silver {
	// ���� �� ���, �̸�, ����Ʈ ����
	private String grade;
	private String name;
	private int point;
	
	// �⺻ ������
	public Silver() {
		
	}
	// �Ű����� �ִ� ������
	public Silver(String grade, String name, int point) {
	this.grade = grade;
	this.name = name;
	this.point = point;
	}
	// getter/setter
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	public double getBonus() {
		return 0.02*point;
	}

	
	
	
}
