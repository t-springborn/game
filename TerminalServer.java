import java.net.*;
public class TerminalServer{
	private ServerSocket server = null;
	private final int port = 12345;
	public static void main(String args[]){
		new TerminalServer();
	}
	public TerminalServer(){

		setup();

		try{
			Socket newSocket=server.accept();
			System.out.println("accepted");

		}catch(java.io.IOException e){
			//
		}

	}

	private void setup(){
		try{
			server = new ServerSocket(port);
		}catch(java.io.IOException e){
			//
		}
	}
}
