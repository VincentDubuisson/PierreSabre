package personnage;

import java.util.Random;

public class Traitre extends Samourai{

	private String boisson;
	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
		this.boisson = boisson;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est: " + niveauTraitrise + ". Chut!");
	}
	
	public void ranconner(Commercant commercant) {
	
		if (niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant * 2 / 10;
			
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			
			niveauTraitrise++;
			
			parler("Si tu veux ma protection contre kes Yakuzas, il va falloir payer ! Donne-moi " 
			+ argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
			
		} else {
			parler("Mince je ne peux plus rançonner personne sion un samouraï rique de me démasquer !");
		}
	}
	
	
	public void faireLeGentil() {
		
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Sinf.");
		} else {
			Random random = new Random();
			int indice = random.nextInt(nbConnaissance);
			
			int don = argent * 1 / 20;
			String nomAmi = memoire[indice].getNom();
			
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			
			memoire[indice].gagnerArgent(don);
			perdreArgent(don);
			
			String nom = getNom();
			memoire[indice].parler("Merci " + nom + ". Vous êtes quelqu'un de bien.");
			
			if (niveauTraitrise > 1) {
				niveauTraitrise--;
			}
		}
	}

}




