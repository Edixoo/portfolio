// Author : Rémi Synave
// Date : 12/03/2022
// Version : 1.0
// Code écrit dans le cadre du TP de "qualité de développement"
// Code de départ du TP.
// Ce code ne compile pas et c'est voulu !

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MainFichier{
    
    public static void main(String[] args) throws FileNotFoundException{
    	// Objet qui contiendra le chemin du fichier à lire.
        String chemin = new String();
        // Pour la lecture au clavier.
	Scanner clavier = new Scanner(System.in);

	// On demande à l'utilisateur le nom du fichier à lire.
	// On récupère le résultat grâce au scanner.
	System.out.println("Entrez le nom du fichier à lire :");
	chemin = clavier.next();
	
	// On crée un objet de type fichier qui sera passé en
	// paramètre à un scanner pour lecture.
	File f = new File(chemin);

	// Création du scanner pour lire le contenu du fichier.
	// C'est ce constructeur qui peut lever une exception.
	// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Scanner.html#%3Cinit%3E(java.io.File)
	boolean validation=false;
	while(validation==false){
		try{
			Scanner sc = new Scanner(f);
			// Tant qu'il y a du contenu non lu dans le fichier
			while(sc.hasNext()){
			// On l'affiche ligne à ligne
			System.out.println(sc.nextLine());
			}
			validation=true;
			// On ferme le scanner pour libérer la ressource.
			sc.close();
			
		} catch(FileNotFoundException oui){
			System.out.println("ERREUR: Le fichier " + f + " est introuvable. \n");
			System.out.println("Entrez le nom du fichier à lire :");
			chemin = clavier.next();
			f = new File(chemin);
		}
		
	}
	}
}

