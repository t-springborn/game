import java.net.*;
public class IOHandler implements Runnable{
	private ServerSocket server = null;
	private final int port = 12345;
	private Game game;
	private boolean running = true;
	public IOHandler(Game game){
		this.game=game;
	}
	
	public void printOutput(Player player, String output){
		player.getInterface().output(output);
	}

	public void run(){
		//Socket Stuff
	}

	private void setup(){
		try{
			server = new ServerSocket(port);
		}catch(java.io.IOException e){
			//
		}
	}

	public void acceptLoop(){
		try{
			server.setSoTimeout(5000);
		}
		catch (Exception e){
			//
		}
		while(running){
			try {
				try{
					Socket newSocket=server.accept();
					String identifier = "playername"; //dummy
					game.getPlayers().get(identifier).getInterface().setSocket(newSocket);

				}catch(java.io.IOException e){
					//
				}
				//get I/O-Streams
				//get Player Info
				//connect to player Interface
			}
			catch (Exception e) {
				//
			}
		}
	}
}
