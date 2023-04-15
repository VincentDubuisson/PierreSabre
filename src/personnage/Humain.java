package personnage;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[3];

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println("(" + getNom() + ") -  " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boisson + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent > prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			argent -= prix;
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous.");
		}
	}

	protected void gagnerArgent(int montant) {
		argent += montant;
	}

	protected void perdreArgent(int montant) {
		argent -= montant;
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	private void memoriser(Humain humain) {
		
		if (nbConnaissance == memoire.length) {
			for (int i = 0; i < memoire.length-1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[nbConnaissance-1] = humain;
		} else  {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	public void listerConnaissance() {

		String str = "Je connais beaucoup de monde dont: ";

		for (int i = 0; i < memoire.length; i++) {
			if (memoire[i] != null) {
				str += memoire[i].getNom();
				if (i + 1 < memoire.length) {
					if (memoire[i + 1] != null) {
						str += ", ";
					}
				}
			}
		}
		parler(str);

	}

}