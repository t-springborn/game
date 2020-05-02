public class Timer implements Runnable{
	private Game game;
	private final int SLEEPTIME = 1000;
	private boolean running=true;
	public Timer(Game game){
		this.game=game;
	}
	public void setRunning(boolean running){
		this.running=running;
	}
	public boolean getRunning(){
		return running;
	}
	public void run(){
		System.out.println("Started Timer.");
		runLoop();
	}
	private void runLoop(){
		//runLoop
		while(running){
			try{
				Thread.sleep(SLEEPTIME);
				System.out.println("Test");
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
