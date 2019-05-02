import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;


public class Ecriture {
	
	//ecriture des féquences a partir d'une HashMap
	public void ecritureFreq(HashMap<String, Integer> hm) throws FileNotFoundException {
		PrintWriter freq = new PrintWriter("frequences.txt");
		
		for (String i : hm.keySet()) {
			freq.println(i+" "+hm.get(i));
		}
		
		freq.close();
	}
	
	
	
	//ecriture du texte binaire
	public void ecritureBin(String code) throws FileNotFoundException {
		PrintWriter code_binaire = new PrintWriter("code_binaire.txt");
		code_binaire.println(code);
		code_binaire.close();
	}

}
