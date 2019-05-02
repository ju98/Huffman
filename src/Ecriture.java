import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;


public class Ecriture {
	
	//ecriture des f�quences a partir d'une HashMap
	public void ecritureFreq(HashMap<String, Integer> hm) throws FileNotFoundException {
		PrintWriter freq = new PrintWriter("frequences.txt");
		
		for (String i : hm.keySet()) {
			freq.println(i+" "+hm.get(i));
		}
		
		freq.close();
	}

}
