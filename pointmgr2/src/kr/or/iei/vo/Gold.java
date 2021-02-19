package kr.or.iei.vo;

// 실버와 변수 구성 같음, 보너스 5%
public class Gold {
	private String grade;
	private String name;
	private int point;
	// 기본 생성자
	public Gold() {
		
	}
	// 매개변수가 있는 생성자
	public Gold(String grade, String name, int point) {
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
		return 0.05*point;
	}
	
}
