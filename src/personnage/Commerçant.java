package personnage;

public class Commerçant extends Humain{

	public Commerçant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		boisson = "thé";
	}
	
	public int seFaireExtorquer() {
		int argent = super.getArgent();
		super.perdreArgent(argent);
		argent = super.getArgent();
		super.parler("J'ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		super.parler(argent + " sous! Je te remercie généreux donater!");
	}
	
}
