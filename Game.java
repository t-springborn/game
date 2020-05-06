import java.util.*;
public class Game{
	private Game game;
	private Scanner gameInput;
	private Timer timer;
	private Thread timeThread;
	private Player player1 = new Player(1);
	private HashMap<String,Player> players = new HashMap<String,Player>();
	public Game(){
		this.game=this;
	}
	public void setScanner(Scanner gameInput){
		this.gameInput=gameInput;
	}
	public void setTimer(Timer timer){
		this.timer=timer;
	}
	public void setTimeThread(Thread timeThread){
		this.timeThread=timeThread;
	}
	public Scanner getGameInput(){
		return gameInput;
	}
	public Timer getTimer(){
		return timer;
	}
	public Thread getTimeThread(){
		return timeThread;
	}
	public HashMap<String,Player> getPlayers(){
		return this.players;
	}
	
	public void gameLoop(){
		while(true){
			String input = gameInput.nextLine();
			if(input.equals("exit")){
				timer.setRunning(false);
				break;
			}
			parseCommands(input);
		}
	}
	private void parseCommands(String input){
		//Parse Commands here
		System.out.println(">> " + input);
		if(input.equals("testAction")){
			//testAction
			Action testAction = new Action(5, () -> System.out.println("Action Done!"));
			timer.addAction(testAction);
		}
		if(input.equals("testCreate")){
			//testAction
			Unit testUnit = new Unit();
			if(player1.hasUnit("testUnit")){
				System.out.println("Unit already exists");
			}else{
				player1.addUnit("testUnit",testUnit);
			}
		}
		if(input.equals("testUpgrade")){
			//testAction
			if(player1.hasUnit("testUnit")){
				Action testAction = new Action(5, () -> player1.getUnit("testUnit").incLevel());
				timer.addAction(testAction);
			}else{
				System.out.println("Unit doesn't exist");
			}
		}
	}

}
