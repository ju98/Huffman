/* regroupement des bits par octets, rajout de 0 à la fin afin de compléter le dernier octet, remplacement des octets par un caractère
 * encodage pour les fichiers à compresser iso 8859-1
 * 
 * http://info.clg.qc.ca/java/flux/ecrire-binaire-fichier
 * 
 * ordonner les caractères par ordre des féquences, puis par ordre ASCII (pour les fréquences égales
 */


import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class Main {
	
	public static void main(String[] args) throws IOException {
		
		//Codage c = new Codage("E:/Info/java/Huffman/src/alice.txt");
		//c.codage();
		
		DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream("nombres.dat")));
		
		out.writeInt(10010011);
		out.close();
	}
}