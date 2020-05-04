public class IOHandler{
	private Game game;
	public IOHandler(Game game){
		this.game=game;
	}
	
	public void printOutput(Player player, String output){
		player.getInterface().output(output);
	}
}
