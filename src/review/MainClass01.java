package review;

import review.test2.Test2;
import review.test2.testInterface;

public class MainClass01 {
	
	public static void main(String[] args) {
		testInterface tif = new Test2();
		Test2 tt2 = (Test2) tif;
		
		System.out.println(System.identityHashCode(tif));
		System.out.println(System.identityHashCode(tt2));
	}

}




