package kh.java.run;
import kh.java.test.Calc;
import kh.java.test.MethodTest;
import kh.java.test.TV;
import java.util.Scanner;
public class Start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		MethodTest mt = new MethodTest();
//		mt.test11();
//		Calc cc = new Calc();
//		cc.main();
//		int a = 20;
//		int b = 30;
//		int result = cc.addFunction(a, b);
//		System.out.println(result);
		TV tv = new TV();
		tv.power();
		while(true) {
			System.out.println("1. ���� ��");
			System.out.println("2. ���� �ٿ�");
			System.out.println("3. ä�� ��");
			System.out.println("4. ä�� �ٿ�");
			System.out.println("5. ä�� ����");
			System.out.println("0. ���� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				tv.volUp();
				break;
			case 2:
				tv.volDown();
				break;
			case 3:
				tv.chUp();
				break;
			case 4:
				tv.chDown();
				break;
			case 5:
				System.out.print("ä�� �Է� : ");
				int changeCh = sc.nextInt();
				tv.chChange(changeCh);
				break;
			case 0:
				tv.power();
				return;
			}
		}
	}
}
