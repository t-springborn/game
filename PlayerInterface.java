import java.net.*;
public class PlayerInterface{
	private Player player;
	private Socket socket;
	public PlayerInterface(Player player){
		this.player=player;
	}
	public PlayerInterface(){
		this.player=null;
	}
	public void setPlayer(Player player){
		this.player=player;
	}
	public Player getPlayer(){
		return this.player;
	}
	public void output(String output){
		//dummy
	}
	public Socket getSocket(){
		return this.socket;
	}
	public void setSocket(Socket socket){
		this.socket=socket;
	}

}
