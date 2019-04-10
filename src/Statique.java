import java.util.ArrayList;
import java.util.HashMap;



public class Statique {
/*  est ce utile ???
	private ArrayList<String> texte;
	private ArrayList<Node> tree;
*/

	

// cree les obj Node a partir d'un fichier txt de frequences
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
	

// retourne le noeud ayant la plus petite frequence
	public Node getMinima(ArrayList<Node> nodes) { 
		Node minima = nodes.get(0);
		
		for (int i=1; i< nodes.size(); i++) {
			if (nodes.get(i).getFreq()<minima.getFreq()) {
				minima = nodes.get(i);  
			}
		}
		
		return minima;
	}


// retourne une liste de noeuds ordonnees (par rapport aux frequences)	
	public ArrayList<Node> orderNodes(ArrayList<Node> nodes) {
		ArrayList<Node> orderedNodes = new ArrayList<Node>();
		while (nodes.size()>0) {
			Node minima = getMinima(nodes);
			orderedNodes.add(minima);
			nodes.remove(minima);
		}
		return orderedNodes;
	}
	
	
	
// cree l'arbre	des frequences
	public ArrayList<Node> createTree(ArrayList<Node> nodes) {
		ArrayList<Node> tree = new ArrayList<Node>();
		ArrayList<Node> nodes_to_process = orderNodes(nodes);
		
		Node currentFather = nodes_to_process.get(0);
		
		for (int i=1; i<nodes_to_process.size(); i++) {
			Node father = new Node(null, nodes_to_process.get(i).getFreq()+currentFather.getFreq(), nodes_to_process.get(i), currentFather);
			tree.add(currentFather);
			tree.add(nodes_to_process.get(i));
			currentFather = father;
			
		}
		tree.add(currentFather);
		
		return tree;
	}


// cree le code (ex: A devient 10) a partir de l'arbre des frequences
	public HashMap defineCode(ArrayList<Node> tree) {
		HashMap map = new HashMap(); // equivalent des dictionnaires en python
		
		
		return map;
	}
	
	
}


