public class PlayerInterface{
	private Player player;
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

}
