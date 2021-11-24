package bridgelabz;
import java.util.Scanner;
public class Utility {
	Scanner scanner;
    public Utility(){
        scanner=new Scanner(System.in);
    }
    public int getIntValue(){
        return scanner.nextInt();
    }
}

