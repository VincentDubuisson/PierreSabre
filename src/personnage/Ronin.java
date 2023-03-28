package personnage;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		
	}

	public void donner(Commercant beneficiaire) {
		int donArgent = getArgent() / 10;
		beneficiaire.gagnerArgent(donArgent);
		perdreArgent(donArgent);
		parler(beneficiaire.getNom() + " prend ces " + donArgent + " sous.");
		beneficiaire.parler(donArgent + " sous! Je te remercie généreux donateur!");
	}
	
}
