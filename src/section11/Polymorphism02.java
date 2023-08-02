package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphism02 {
	public static void main(String[] args) {
		/*
		 * 1. car drive()
		 * 2. bus drive()
		 * 3. schoolbus drive()
		 */
		SchoolBus sb1 = new SchoolBus();
		sb1.drive();		// 3
		
		System.out.println(System.identityHashCode(sb1));
		
		Car c1 = sb1;
		c1.drive();			// 3
		
		System.out.println(System.identityHashCode(c1));
		
		Bus b1 = (Bus) c1;	// 상위클래스에서 하위클래스 대입 강제형변환
		b1.drive();			// 3
		
		System.out.println(System.identityHashCode(b1));
		
		System.out.println("sb1.color: " + sb1.color);
		System.out.println("c1.color: " + c1.color);
		System.out.println("b1.color: " + b1.color);
		
		c1.color = "Red";
		
		System.out.println("sb1.color: " + sb1.color);
		System.out.println("c1.color: " + c1.color);
		System.out.println("b1.color: " + b1.color);
		
		
	}
}
