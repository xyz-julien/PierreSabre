package personnages;

public class Humain {
	private String nom;
	private String boissonfav;
	private int argent;
	
	public Humain(String nom, String boissonfav, int argent) {
		this.nom = nom;
		this.boissonfav = boissonfav;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		System.out.println(parler() + "Bonjour, je m'appelle " + nom + " et j'aime boire du "+boissonfav+".");
	}
	
	public void boire() {
		System.out.println(parler() + "Mmmm, un bon verre de "+ boissonfav + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix < argent) {
			System.out.println(parler() + "J'ai "+argent+ " sous en poche. Je vais pouvoir m'offrir un "+bien+" à "+prix+" sous.");
			perdreArgent(prix);
			assert argent >= 0;
		} else {
			System.out.println(parler() + "Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+prix+" sous.");
		}
	}
	
	private void gagnerArgent(int gain) {
		argent += gain;
	}
	
	private void perdreArgent(int perte) {
		argent -= perte;
	}
	
	private String parler() {
		return "("+nom+") - " ;
	}
	
}
