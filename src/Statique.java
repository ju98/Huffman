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
	

// recupere les indices des noeuds ayant les 2 plus petites frequences
	public ArrayList<Integer> get2minima(ArrayList<Node> nodes) {  //liste de noeuds (de longueur supposée >= 2)
		ArrayList<Integer> minima = new ArrayList<Integer>();
		minima.add(0);
		minima.add(1);
		
		for (int i=2; i< nodes.size(); i++) {
			if (nodes.get(i).getFreq()<nodes.get(minima.get(0)).getFreq()) {
				minima.set(0, i);  // modification de la premiere valeur des minimas
			}
			else if (nodes.get(i).getFreq()<nodes.get(minima.get(1)).getFreq()) {
				minima.set(1, i);
			}
		}
		
		return minima; // retourne l'indice des minimas
	}
	
	
	
// cree l'arbre	des frequences
	public ArrayList<Node> createTree(ArrayList<Node> nodes) {
		ArrayList<Node> nodes_to_process = new ArrayList<Node>(nodes);
		ArrayList<Node> tree = new ArrayList<Node>();
		
		while (nodes_to_process.size()>1) {
			ArrayList<Integer> minima = get2minima(nodes_to_process);
			Node n1 = nodes_to_process.get(minima.get(0));  // on recupere les 2 noeuds ayant les plus petites fréquences
			Node n2 = nodes_to_process.get(minima.get(1));
			
			Node father = new Node(null, n1.getFreq()+n2.getFreq(), n1, n2);  // creation du noeud pere
			
			tree.add(n1); // j'ajoute les noeuds a mon arbre
			tree.add(n2);
			
			nodes_to_process.remove(n1); // et je les supprime des noeuds a traiter
			nodes_to_process.remove(n2);
			
			nodes_to_process.add(father); // j'ajoute le pere aux noeuds a traiter
		}
		
		
		tree.add(nodes_to_process.get(0)); // j'ajoute la racine (le seul noeud qu'il reste a traiter) a mon arbre
	
		return tree;
	}

}
