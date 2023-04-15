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
		reputation++;
	}
	
	public int perdre() {
		int pArgent = getArgent();
		perdreArgent(pArgent);
		reputation--;
		parler("J'ai perdu mon duel et mes " + pArgent + " sous, snif..." 
		+ "J'ai déshonoré le clan de " + clan + ".");
		return pArgent;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " 
		+ clan + "? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
	public int getReputation() {
		return reputation;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
}







