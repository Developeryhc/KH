package kh.java.run;
import kh.java.test.Calc;
import kh.java.test.MethodTest;
import kh.java.test.TV;
import java.util.Scanner;
import kh.java.test.Cat;
import kh.java.test.Animal;
import kh.java.test.Tiger;




public class Start {

	public static void main(String[] args) {
	Animal a = new Animal();		// crying
	Cat c = new Cat();				// crying, grooming
	Tiger t = new Tiger();			// crying, hunting
	
	a.crying();						// 울음소리!
	c.crying();						// 야옹
	t.crying();						// 울음소리!
	c.grooming();					// 그루밍
	t.hunting();					// 사냥
	// 다형성 부모타입 변수에 자식타입 객체를 저장하는 것
	Animal a1 = new Cat();			// UpCasting (업캐스팅)
	a1.crying();					// 야옹
	((Cat)a1).grooming();			// DownCasting (다운캐스팅)
	Animal a2 = new Tiger();
	a2.crying();					// 울음소리!
	((Tiger)a2).hunting();			// 사냥
	//////////////////////////////////////////////////////////////
	((Tiger)a1).hunting();
	Object o = new Animal();
	Object o1 = new Cat();
	Object o2 = new Tiger();
	
	
	
		/*
//	public static void main(String[] args) {
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
			System.out.println("1. 볼륨 업");
			System.out.println("2. 볼륨 다운");
			System.out.println("3. 채널 업");
			System.out.println("4. 채널 다운");
			System.out.println("5. 채널 변경");
			System.out.println("0. 전원 끄기");
			System.out.print("선택 > ");
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
				System.out.print("채널 입력 : ");
				int changeCh = sc.nextInt();
				tv.chChange(changeCh);
				break;
			case 0:
				tv.power();
				return;
			}
		}
		*/
	}
}
