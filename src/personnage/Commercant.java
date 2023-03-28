package personnage;

public class Commercant extends Humain{

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		boisson = "thé";
	}
	
	public int seFaireExtorquer() {
		int argent = getArgent();
		perdreArgent(argent);
		argent = getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! Je te remercie généreux donateur!");
	}
	
}
