package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP4 {
 
	public static void main(String[] args) {
		/*Humain prof = new Humain("Prof", "kombucha", 54);
		
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);*/
		
		Commercant marco = new Commercant("Marco", "thé", 20);
		/*marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();*/
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		/*yaku.direBonjour();
		yaku.extorquer(marco);*/
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.provoquer(yaku);
		
	}
}
