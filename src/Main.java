import java.io.IOException;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) throws IOException {

		Lecture lect = new Lecture();
		ArrayList<String> freq = lect.getText("E:/Info/java/Huffman/src/freq.txt");
		System.out.println(freq);
		
		Statique code = new Statique();
		ArrayList<Node> nodes = code.createNodes(freq);

		ArrayList<Node> tree = code.createTree(nodes);

/*
		for (Node n:tree) {
			System.out.println(n.getName() +" " + n.getFreq());
		}
*/		

		Node root = tree.get(tree.size()-1);
		
		String bits = code.getBits(root, "F");
		System.out.println(bits);
		
		
		String texte_a_coder = "AFCD";
		System.out.println(code.encode(root, texte_a_coder));  // code le texte
		
		
	}
}