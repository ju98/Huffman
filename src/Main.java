/* regroupement des bits par octets, rajout de 0 � la fin afin de compl�ter le dernier octet, remplacement des octets par un caract�re
 * encodage pour les fichiers � compresser iso 8859-1
 * 
 * ordonner les caract�res par ordre des f�quences, puis par ordre ASCII (pour les fr�quences �gales
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
	
	public static void main(String[] args) throws IOException {

/*
		Lecture lect = new Lecture();
		ArrayList<String> freq = lect.getText("E:/Info/java/Huffman/src/freq.txt");
		System.out.println(freq);
		
		Statique code = new Statique();
		ArrayList<Node> nodes = code.createNodes(freq);

		ArrayList<Node> tree = code.createTree(nodes);


		for (Node n:tree) {
			System.out.println(n.getName() +" " + n.getFreq());
		}
		

		Node root = tree.get(tree.size()-1);
		
		String bits = code.getBits(root, "F");
		System.out.println(bits);
		
		
		String texte_a_coder = "AFCD";
		System.out.println(code.encode(root, texte_a_coder));  // code le texte
*/		
		
		Lecture lect = new Lecture();
		ArrayList<String> texte = lect.getText("E:/Info/java/Huffman/src/alice.txt");
		System.out.println(texte.size());
		
		SemiAdaptative sa = new SemiAdaptative();
		HashMap<String, Integer> hm = sa.getCaracFreq(texte);
		System.out.println(hm);
		
		Ecriture e = new Ecriture();
		e.ecritureFreq(hm);
		
		
		
	}
}