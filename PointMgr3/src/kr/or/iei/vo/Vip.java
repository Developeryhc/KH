package kr.or.iei.vo;

public class Vip extends Silver{

	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vip(String grade, String name, int point) {
		super(grade, name, point);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonus() {
		return getPoint()*0.07;
	}
}
