package section08;

public class Method04 {
	
	public static void main(String[] args) {
		int[] values = {19, 55, 66, 77, 2, 1, 98};
		
		double[] result = summary(values);
		
		System.out.println("합계: " + result[0]);
		System.out.println("평균: " + result[1]);
		
		System.out.println("===========================");
		refTest(values);
		
		for (int val : values) {
			System.out.println(val);
		}
		
		
		int num = 10;
		valTest(num);
		System.out.println("num: " + num);
		
	}
	
	public static double[] summary(int[] values) { 
		// result[0] : 합계, result[1] : 평균 
		double[] result = new double[2];
		
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		
		double avg = sum / (double)values.length;
		
		result[0] = sum;
		result[1] = avg;
 		
		return result;
		
	}
	
	public static void refTest(int[] values) {
		values[2] = 100;
	}
	
	public static void valTest(int num) {
		num = 3;
	}

}
