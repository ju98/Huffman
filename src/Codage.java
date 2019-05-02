import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Codage {
	private String fichier;
	
	public Codage(String fichier) {
		this.fichier = fichier;
	}
	
	public void codage() throws IOException {
		Lecture lect = new Lecture();
		ArrayList<String> texte = lect.getText(fichier); //recupere le texte à coder sous forme d'une array liste de string

		
//creation et recuperation des frequences, puis creation de l'arbre des frequences
		SemiAdaptative sa = new SemiAdaptative();		
		HashMap<String, Integer> hm = sa.getCaracFreq(texte); //creation de la HashMap des caracteres-frequence à partir du texte
		
		Ecriture e = new Ecriture();
		e.ecritureFreq(hm);  //creation du fichier texte des frequences
		
		ArrayList<String> freq = lect.getText("E:/Info/java/Huffman/frequences.txt");  //recupere les frequences ecrites precedemment dans un fichier

		Statique st = new Statique();
		ArrayList<Node> nodes = st.createNodes(freq); //creation des noeuds
		ArrayList<Node> tree = st.createTree(nodes); //creation de l'arbre des frequences


//codage puis ecriture du texte
		Node root = tree.get(tree.size()-1); //recupere la racine de l'arbre (qui correspond au dernier element de la liste des noeuds
		
		String code_binaire= "";
		for (String ligne:texte) { //parcourre les lignes du texte pour les coder
			code_binaire = code_binaire +st.encode(root, ligne);
		}

		e.ecritureBin(code_binaire);
	}

}
