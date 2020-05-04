public class Unit{
	private int type;
	private int level=0;
	public Unit(){
		setType(0);
	}
	public Unit(int type){
		setType(type);
	}
	public void setType(int type){
		this.type=type;
	}
	public void incLevel(){
		this.level++;
		System.out.println("New Level: "+level);
	}

}
