import java.util.Scanner;

public class Start{
    private static Game game;
    public static void main(String args[]){
	    System.out.println("Started.");
	    gameSetup();
	    startMenu();
	    exitProgram(0);
    }
    public static void exitProgram(int exitCode){
	    System.out.println("Exiting with Exit Code "+exitCode);
	    System.exit(exitCode);
    }
    private static void gameSetup(){
	    game = new Game();
	    Scanner gameInput = new Scanner(System.in);
	    Timer timer = new Timer(game);
	    Thread timeThread = new Thread(timer);
	    game.setScanner(gameInput);
	    game.setTimer(timer);
	    game.setTimeThread(timeThread);
    }
    private static void startMenu(){
	    System.out.println("Start Game?");
	    String line = game.getGameInput().nextLine();
	    if(line.equals("Yes.")){
		    System.out.println("Game Started.");
		    game.gameLoop();
	    }
    }
}
