public class Terminal{
	public static void main(String args[]){
	
		if(args.length>0){
			new Terminal(args[0]);
		}
	}
	public Terminal(String argument){

		System.out.println(argument);
	}
}
