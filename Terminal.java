import java.net.*;
public class Terminal{
	Socket socket = null;
	private final int port = 12345;
	public static void main(String args[]){
	
		if(args.length>0){
			new Terminal(args[0]);
		}
	}
	public Terminal(String argument){

		try{
			System.out.println(argument);
			socket = new Socket(argument,port);
	        	System.out.println("Connected.");	
		}catch(Exception e){

			System.out.println("Couldn't Connect.");
		}
	}
}
