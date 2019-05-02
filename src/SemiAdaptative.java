import java.util.ArrayList;
import java.util.HashMap;


public class SemiAdaptative {

	
	
	//creer la map des caracteres avec leur frequence a partir d'une ArrayList<String>
	public HashMap<String, Integer> getCaracFreq(ArrayList<String> texte) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (String ligne : texte) { //parcourre chaque ligne du texte
			for (int i=0; i<ligne.length(); i++) { //parcourre chaque lettre d'une ligne
				String lettre = Character.toString(ligne.charAt(i));
				
				if (existe(hm, lettre)==true) {
					int freq = hm.get(lettre);
					hm.put(lettre, freq+1);
				}
				else {
					hm.put(lettre, 1);
				}
			}
		}
		hm.put("\n", texte.size()); //ajout des retours a la ligne (sa frequence correspond au nombre de lignes dans le texte
		
		return hm;
	}
	
	
	
	public boolean existe(HashMap<String, Integer> hm, String lettre) {
		for (String i : hm.keySet()) {
			if (i.equals(lettre))
				return true;
		}
		return false;
	}
}
