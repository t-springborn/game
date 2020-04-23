public class Start{
    public static void main(String args[]){
	    System.out.println("Started.");
	    exitProgram(0);
    }
    public static void exitProgram(int exitCode){
	    System.out.println("Exiting with Exit Code "+exitCode);
	    System.exit(exitCode);
    }
}
