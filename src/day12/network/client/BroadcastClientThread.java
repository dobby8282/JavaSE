package day12.network.client;

import java.io.IOException;

public class BroadcastClientThread extends Thread{
	private BroadcastClient bc;
	public BroadcastClientThread(BroadcastClient bc) {
		this.bc = bc;
	}
	public void run(){
		boolean isStop = false;
		while(!isStop){  
			try {
				//server => client
				//msg는 두가지 종류
				//1. 1#id#message => 일반메세지
				//2. 2#id         => 종료메세지
				String msg = bc.getBufferedReader().readLine();
				String[] temp = msg.split("#");
				if(temp[0].equals("0")){
					//접속메세지
					if(!temp[1].equals(bc.getId())){
						//서버에서 보낸 아이디(temp[1])와 JFrame에 있는 아이디가
						//일치하지 않는 경우에만 메세지를 출력한다.즉, 자기자신 
						//JFrame에는 메세지를 출력하지 않음.
						bc.getJTextArea().append(
								temp[1]+" 님이 입장하였습니다."+
								System.getProperty("line.separator"));
							//JTextArea의 스크롤 내리기 기능.
							bc.getJTextArea().setCaretPosition(
						bc.getJTextArea().getDocument().getLength());
					}
				}else if(temp[0].equals("1")){
					//일반 메세지
					//JTextArea에 서버에서 보낸 메세지 출력
					bc.getJTextArea().append(
						temp[1]+" : "+temp[2]+
						System.getProperty("line.separator"));
					//JTextArea의 스크롤 내리기 기능.
					bc.getJTextArea().setCaretPosition(
						bc.getJTextArea().getDocument().getLength());
				}else if(temp[0].equals("2")){
					
					if(temp[1].equals(bc.getId())){
						//종료 메세지
						//스레드 종료
						isStop = true;
						
					}else{
						bc.getJTextArea().append(
								temp[1]+" 님이 종료하셨습니다."+
								System.getProperty("line.separator"));
							//JTextArea의 스크롤 내리기 기능.
							bc.getJTextArea().setCaretPosition(
						bc.getJTextArea().getDocument().getLength());
					}
					
					
				}else if(temp[0].equals("3")){
					//3#id1,id2,id3,id4,....
					//temp[0] => 3
					//temp[1] => id1,id2,id3,id4,....
					String[] listMember = temp[1].split(",");
					bc.getJlist().setListData(listMember);
				}
			} catch (IOException e) {
				isStop = true;
				
			}
		}//end while
		
		//Socket과 IO 종료
		bc.closeAll();
		//프로그램 종료
		bc.exit();
		
	}//end run
}

