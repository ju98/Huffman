/* regroupement des bits par octets, rajout de 0 � la fin afin de compl�ter le dernier octet, remplacement des octets par un caract�re
 * encodage pour les fichiers � compresser iso 8859-1
 * 
 * ordonner les caract�res par ordre des f�quences, puis par ordre ASCII (pour les fr�quences �gales
 */


import java.io.IOException;



public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Codage c = new Codage("E:/Info/java/Huffman/src/alice.txt");
		c.codage();
		
	}
}