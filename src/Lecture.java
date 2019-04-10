import java.util.ArrayList;
//import java.util.Scanner;
import java.io.*;


public class Lecture {


	public ArrayList<String> getText(String name) throws IOException {
		ArrayList<String> texte = new ArrayList<String>();
		BufferedReader lect = new BufferedReader(new FileReader(name));
		String ligne = null;
		
		while ((ligne = lect.readLine()) != null) {
			//System.out.println(ligne);
			texte.add(ligne);
		}
		return texte;
	}


// AUTRE METHODE POUR LIRE LE FICHIER
/*	public ArrayList<String> getText() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("E:/Info/java/Huffman/src/freq.txt"));
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			//System.out.println(s);
			texte.add(s);
		}
		sc.close();
		return texte;
	}*/


}
