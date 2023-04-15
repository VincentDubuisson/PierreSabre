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
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		int argent = getArgent();
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer "
					+ "pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
			honneur++;
			
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argent);
			perdreArgent(argent);
			honneur--;
		}
	}
	
}
