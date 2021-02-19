package kh.java.test;

public class Calc {
	public void main() {
		int num1 = 10;
		int num2 = 3;
		int result1 = addFunction(num1, num2);
		int result2 = subFunction(num1, num2);
		int result3 = mulFunction(num1, num2);
		double result4 = divFunction(num1, num2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
	public int addFunction(int num1, int num2) {
		int add = num1+num2;
		return add;
	}
	public int subFunction(int num1, int num2) {
		int sub = num1-num2;
		return sub;
	}
	public int mulFunction(int num1, int num2) {
		int mul = num1*num2;
		return mul;
	}
	public double divFunction(int num1, int num2) {
		double div= (double)num1/num2;
		return div;
	}

}
