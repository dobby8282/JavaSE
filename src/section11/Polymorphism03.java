package section11;

/*
 * **** instanceof 연산자
 * 	객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인하는 연산자
 * 	
 */


import java.util.Scanner;

import section11.access2.Ade;
import section11.access2.Coffee;
import section11.access2.Drink;

public class Polymorphism03 {
	
	public static void main(String[] args) {
		
		int selectNum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1) 코카콜라 Zero");
		System.out.println("2) 빽다방 황금라떼");
		System.out.println("음료를 선택하세요 >>>");
		
		selectNum = scan.nextInt();
		
		Drink drink = selectDrink(selectNum);
		
		if(drink instanceof Ade) {
			Ade ade = (Ade) drink;
			ade.getInfo();
			System.out.println("변경후");
			ade.setZero(false);
			ade.getInfo();
			
		} else if (drink instanceof Coffee) {
			Coffee coffee = (Coffee) drink;
			coffee.getInfo();
			System.out.println("변경후");
			coffee.setDecaf(true);
			coffee.getInfo();
		}
	}
	
	/**
	 * 음료선택 메서드
	 * 
	 * @param selectNum  1: Ade, 2: Coffee
	 * @return Drink
	 */
	public static Drink selectDrink(int selectNum) {
		Drink drink;
		if(selectNum == 1) {
			drink = new Ade();
		} else {
			drink = new Coffee();
		}
		return drink;
		
	}
	
	

}
