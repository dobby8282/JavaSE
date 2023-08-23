package section19;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class IO03 {
	public static void main(String[] args) throws IOException {
		
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int millisec = c.get(Calendar.MILLISECOND);
		
		String path = "./upload/"+year+"/"+month+"/"+day;
		String fileName = "upload_" + year+month+day+hour+min+sec+millisec;
		
		File f1 = new File(path);
		
		// mkdirs() - 하위 디렉토리까지 생성
		if(f1.mkdirs()) {
			System.out.println(f1.getPath() + " 디렉토리가 생성되었습니다.");
		}
		
		File f2 = new File(f1, fileName);
		if(f2.createNewFile()) {
			System.out.println(fileName + "이 생성되었습니다.");
		}
		
	}

}
