import java.io.*;
import java.util.*;

public class Countwords {

	public static void main(String[] args) 
		throws FileNotFoundException {
			Scanner input = new Scanner(new File("H:text17_00.txt"));
			int count=0;
			while (input.hasNext()) {
				String word = input.next();
				count++;
			}
			
			System.out.println("count is: " + count);
			
		}
		


}
