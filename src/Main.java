import java.io.IOException;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Statique code = new Statique();
		ArrayList<String> texte = code.getText();
		System.out.println(texte);
		ArrayList<Node> nodes = code.createNodes(texte);
		
		//System.out.println(nodes.get(0).getFreq());
		
		//System.out.println(code.get2minima(nodes));
		
		ArrayList<Node> tree = code.createTree(nodes);
		for (Node n:tree) {
			System.out.println(n.getFreq());
		}
	}
}