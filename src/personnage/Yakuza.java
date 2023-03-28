package personnage;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int volArgent = victime.getArgent();
		gagnerArgent(volArgent);
		victime.seFaireExtorquer();
		parler("J'ai piqué les " + volArgent +
				" sous de " + victime.getNom() + ", ce qui me fait " +
				getArgent() + " sous dans ma poche. Hi! Hi!");
		reputation += 1;
	}

}