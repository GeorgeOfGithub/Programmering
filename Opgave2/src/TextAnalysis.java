import java.util.*;
import java.io.*;


public class TextAnalysis {

	
	public int wordCount;
	public int getNoOfDifferentWords;
	public int getNoOfRepetitions;
	// her defineres de variable som bruges skal findes fra teksten
	
public static void main(String[] a)throws FileNotFoundException{
		    TextAnalysis ta = new TextAnalysis("C:\\Users\\Lucas\\Downloads\\hamlet.txt", 50000);
				System.out.println("word count = " + ta.wordCount());
				System.out.println("different words = " + ta.getNoOfDifferentWords());
				System.out.println("repetitions = " + ta.getNoOfRepetitions());
		    }

	 
	 
public TextAnalysis(String sourceFileName, int maxNoOfWords) throws FileNotFoundException {
		 Scanner input = new Scanner(new File(sourceFileName));
		// her kommer input i form af source file som skal kigges igennem og laves om til et scanner input
		 
			String[] array = new String[maxNoOfWords]; // så laves et array med længden på maks antal
													   // af ord således at det kan indeholde alle ord
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] nospecial = line.split("[^a-zA-Z]+");
				// her tager den input en linje ad gangen så længe der er en ny linje
				// den fjerner alle karakterer undtagen store og små bogstaver og det gemmes i et nyt
				// array som kaldes "nospecial"
				
				for (int n = 0; n < nospecial.length; n++) {
						if (nospecial[n].equalsIgnoreCase("")) {
							continue;
						} else {
					array[wordCount]=nospecial[n];
					wordCount++;
						}
						// her fjernes alle de tomme felter i array som kommer når den finder en tom linje.
						// samtidig tæller den hvor mange ord der er ved at tælle hvor mange felter der er
						// i no special uden mellemrum
			}
		}
			if (wordCount==0) {
				return;
			} // så tjekker den hurtigt om der overhovedet er noget tekst og eller stopper den bare her
			  // for at spare processerkraft
			
			for (int n = 0; n < wordCount;n++) {
				if (array[n].equalsIgnoreCase(array[n+1])){
					getNoOfRepetitions++;
				}
			}
			// dette forloop tælle repetitions ved at tjekke som det næste felt i array er det samme som
			// nuværende og tæller på på "getNoOfRepetitions"
			
			for (int n = 0; n < wordCount; n++) {
				int j;
		        for (j = 0; j < n; j++)  {
		            if (array[n].equalsIgnoreCase(array[j])) {
		                break;
		            }
		        }

		        if (n == j) {
		        	getNoOfDifferentWords++;
		        }
		    }
			// dette forloop tæller hvor mange forskellige ord. Den kører igennem hele arrayet og tester om
			// to felter passer og så stopper den det nestedede forloop og tæller 1 op på på 
			// "getNoOfDifferentWords" 
			
	}

public int wordCount() {
	return wordCount;
}



public int getNoOfDifferentWords() {
	return getNoOfDifferentWords;
}

public int getNoOfRepetitions () {
	return getNoOfRepetitions;
}

// til sidst laves de metoder som returnerer det som programmet vil finde.

}
