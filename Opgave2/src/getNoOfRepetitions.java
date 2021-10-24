import java.io.*;
import java.util.*;

public class getNoOfRepetitions {

	public static void main(String[] args) 
		throws FileNotFoundException {
			Scanner input = new Scanner(new File("H:text17_01.txt"));
			int maxNoOfWords=50;
			int i=0;
			int repetions=0;
			int count=0;

			
			String[] array = new String[maxNoOfWords];
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] nospecial = line.split("[^a-zA-Z\\\\d]+");
				count+=nospecial.length;
				for (int n = 0; n < nospecial.length; n++) {
					array[i]=nospecial[n];
					i++;

			}
		}
			
			for (int n = 0; n < count;n++) {
				if (array[n].equalsIgnoreCase(array[n+1])) {
					repetions++;
				}
			}
			System.out.println(repetions);
			
	}
}
