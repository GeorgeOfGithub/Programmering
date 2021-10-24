import java.io.*;
import java.util.*;

public class NoOfDifferentWords {

	public static void main(String[] args) 
		throws FileNotFoundException {
			Scanner input = new Scanner(new File("H:text17_00.txt"));
<<<<<<< Upstream, based on origin/main
			int differentwords=0;
			int count = 0;
			
			
=======
			int maxNoOfWords=16;
			int count=0;
			int i=0;
>>>>>>> 4a5f5c9 3 methods lavet, skal samles til en

			
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
			System.out.println("count is: " + count);
			int NoOfDifferentWords=count;
			
			for (int n = 0; n < count; n++) {
				for (int q = n+1; q < array.length; q++) {
					if (array[n].equalsIgnoreCase(array[q])) {
						NoOfDifferentWords--;
					}
				}
				
			}
			System.out.println("The number of different words are: " +NoOfDifferentWords);
		}
	

}
