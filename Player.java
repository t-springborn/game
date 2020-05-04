import java.util.*;
public class Player{
	private int id;
	private PlayerInterface playerInterface = new PlayerInterface(this);
	private HashMap<String,Unit> unitMap = new HashMap<String,Unit>();
	public Player(int id){
		this.id=id;
	}
	public void addUnit(String name, Unit unit){
		unitMap.put(name,unit);
		System.out.println("Created Unit: "+name);
	}
	public boolean hasUnit(String name){
		return unitMap.containsKey(name);
	}
	public Unit getUnit(String name){
		return unitMap.get(name);
	}
	public PlayerInterface getInterface(){
		return this.playerInterface;
	}
}
