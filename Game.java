import java.util.Scanner;
public class Game{
	private Game game;
	private Scanner gameInput;
	private Timer timer;
	public Game(){
		this.game=this;
	}
	public void setScanner(Scanner gameInput){
		this.gameInput=gameInput;
	}
	public void setTimer(Timer timer){
		this.timer=timer;
	}
	public Scanner getGameInput(){
		return gameInput;
	}
	public Timer getTimer(){
		return timer;
	}
	public void gameLoop(){
		while(true){
			String input = gameInput.nextLine();
			if(input.equals("exit")){
				break;
			}
		}
	}

}
