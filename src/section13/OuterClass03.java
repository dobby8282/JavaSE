package section13;
/*
 * 인스턴스 내부클래스
 * 	기본적인 일반 내부클래스 입니다. 
 * 	외부클래스 안에 생성되기 때문에 클래스를 사용하려면 
 *  외부클래스 객체가 생성된 상태에서 객체 생성을 할 수 있습니다.
 *  
 * 인스턴스 클래스 선언
 *  Outer outer = new Outer();
 *  Outer.Inner in = outer.new Inner();
 * 
 * 
 */

import section13.access1.MyUtil;

public class OuterClass03 {
	
	public static void main(String[] args) {
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		hp.printHello();
		
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		hp2.printHello();
		
		MyUtil.Calculater calc = new MyUtil.Calculater();
		calc.calc(5, 25);
		
	}

}







