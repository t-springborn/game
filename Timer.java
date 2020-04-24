public class Timer implements Runnable{
	private Game game;
	private final int SLEEPTIME = 1000;
	public Timer(Game game){
		this.game=game;
	}
	public void run(){
		runLoop();
	}
	private void runLoop(){
		//runLoop
		try{
			Thread.sleep(SLEEPTIME);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
