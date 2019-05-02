/* regroupement des bits par octets, rajout de 0 à la fin afin de compléter le dernier octet, remplacement des octets par un caractère
 * encodage pour les fichiers à compresser iso 8859-1
 * 
 * ordonner les caractères par ordre des féquences, puis par ordre ASCII (pour les fréquences égales
 */


import java.io.IOException;



public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Codage c = new Codage("E:/Info/java/Huffman/src/alice.txt");
		c.codage();
		
	}
}