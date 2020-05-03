public class Action{
	private int timeLeft;
	private Runnable command;
	public Action(int timeLeft, Runnable command){
		this.timeLeft=timeLeft;
		this.command=command;
	}
	public void setTimeLeft(int timeLeft){
		this.timeLeft=timeLeft;
	}
	public int getTimeLeft(){
		return timeLeft;
	}
	public void decTimeLeft(){
		this.timeLeft--;
	}
	public void execute(){
		command.run();
	}
}
