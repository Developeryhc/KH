package kr.or.iei.vo;

// �ǹ��� �������� ���� ���ʽ� 7%
public class Vip {
	private String grade;
	private String name;
	private int point;
	// �⺻ ������
	public Vip() {
		super();
	}
	// �Ű������� �ִ� ������
	public Vip(String grade, String name, int point) {
		super();
		this.grade = grade;
		this.name = name;
		this.point = point;
	}
	// getter / setter
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
		return point*0.07;
	}
}
