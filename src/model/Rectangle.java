/**
 * 
 */
package model;

/**
 * @author AZOUANE DJAMILA
 *
 */
public class Rectangle extends Carre {
	public double largeur;

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public Rectangle() {
		super();
		setOrigine(new Point());
		setNom("Rectangle");
		setLargeur(largeur);
	}

	public Rectangle(Point origine, String nomR, int largeur, int longueur) {
		super(origine, nomR, longueur);
		setOrigine(origine);
		setNom(nomR);
		setLargeur(largeur);
	}

	public Rectangle(double largeur) {
		super();
		setLargeur(largeur);
	}

	@Override
	public double superficie() {
		return Math.round(getLongueur() * getLargeur());//Retourner l'arrondie de la superficie
	}

	@Override
	public String toString() {
		return "La superficie du réctangle '"+ getNom() +"' est " + superficie();
	}
	public void afficher() {
		System.out.println(this.toString());
	}
	
}
