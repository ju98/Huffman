import java.util.ArrayList;
//import java.util.Scanner;
import java.io.*;

public class Statique {
	
	
	public ArrayList<String> getText() throws IOException {
		ArrayList<String> texte = new ArrayList<String>();
		BufferedReader lect = new BufferedReader(new FileReader("E:/Info/java/Huffman/src/freq.txt"));
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
	
	
	public ArrayList<Node> createNodes(ArrayList<String> txt) {
		ArrayList<Node> nodes = new ArrayList<Node>();
		for(String ligne:txt) {
			String name = String.valueOf(ligne.charAt(0));
			int freq = Integer.valueOf(ligne.substring(2));
			Node node = new Node(name, freq, null, null);
			nodes.add(node);
		}
		return nodes;
	}
	
	
	public ArrayList<int> get2minima(ArrayList<Node> nodes) {  //liste de noeuds de longueur supposée >= 2
		ArrayList<int> minima = new ArrayList<int>();
		minima.add(0);
		minima.add(1);
		
		for (int i=2; i< nodes.size(); i++) {
			/* en python : if nodes[i].freq < nodes[minima[0]]: 
			 * minima[0] = nodes[i].freq
			 * elif nodes[i].freq < nodes[minima[1]] :
			 * minima[1] = nodes[i].freq
			 * */
		}
		
		return minima; // retourne l'indice des minimas
	}
	
	
	public ArrayList<Node> createTree(ArrayList<Node> nodes) {
		ArrayList<Node> tree = new ArrayList<Node>(nodes);
		
		// creer l'arbre a l'aide de la fonction get2minima
		
		
		return tree;
	}

}
