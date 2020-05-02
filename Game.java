import java.util.Scanner;
public class Game{
	private Game game;
	private Scanner gameInput;
	private Timer timer;
	private Thread timeThread;
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
	}

}
