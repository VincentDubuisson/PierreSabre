package histoire;

import personnage.Commerçant;
import personnage.Humain;

public class HistoireTP4 {
 
	public static void main(String[] args) {
		/*Humain prof = new Humain("Prof", "kombucha", 54);
		
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);*/
		
		Commerçant marco = new Commerçant("Marco", "thé", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
	}
}
