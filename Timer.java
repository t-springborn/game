import java.util.*;
public class Timer implements Runnable{
	private Game game;
	private final int SLEEPTIME = 1000;
	private boolean running=true;
	private LinkedList<Action> actionList = new LinkedList<Action>();
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
				//System.out.println("\nTest");
				tick();
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	private void tick(){
		if(actionList.peekFirst()!=null){
			ListIterator<Action> iterator = actionList.listIterator(0);
			while(iterator.hasNext()){
				iterator.next().decTimeLeft();
			}
			while(actionList.getFirst().getTimeLeft()==0){
				actionList.getFirst().execute();
				actionList.removeFirst();
				if(actionList.peekFirst()==null){
					break;
				}
			}
		}
	}
	public void addAction(Action action){
		ListIterator<Action> iterator = actionList.listIterator(0);
		int timeLeft=action.getTimeLeft();
		while(iterator.hasNext()){
			if(iterator.next().getTimeLeft()>timeLeft){
				actionList.add(iterator.previousIndex(),action);
				break;
			}
		}
		actionList.addLast(action);
	}

}
