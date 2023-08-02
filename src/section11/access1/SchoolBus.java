package section11.access1;

public class SchoolBus extends Bus {
	
	public SchoolBus() {
		type = "스쿨버스";
		color = "Yellow";
	}
	
	@Override
	public void drive() {
		System.out.println("학생을 태우고 운전을 합니다.");
	}
	
	public void stopPannel() {
		System.out.println("학생 하차시 정지 판넬 작동!");
	}
	

}



