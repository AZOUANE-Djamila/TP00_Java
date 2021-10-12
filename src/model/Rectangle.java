/**
 * 
 */
package model;

/**
 * @author AZOUANE DJAMILA
 * La classe r�ctangle d�fini le rectangle, sa largeur et sa superficie
 */

public class Rectangle extends Carre {
	/**
	 * largeur est la largeur du Rectangle
	 */
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

	/**
	 * Le constructeur Recytangle sans parametre
	 */
	public Rectangle() {
		super();
		setOrigine(new Point());
		setNom("Rectangle");
		setLargeur(largeur);
	}

	/**
	 * 
	 * @param origine
	 * L'orgine point du rectangle
	 * @param nomR
	 * Ce parametre est h�rit� de la classe forme g�om�trique le nom de la forme g�om�trique ici il est = "Rectangle"
	 * @param largeur
	 * La largeur du rectangle
	 * @param longueur
	 * La longueur du rectangle h�rit� de la classe Carre
	 */
	public Rectangle(Point origine, String nomR, int largeur, int longueur) {
		super(origine, nomR, longueur);
		setOrigine(origine);
		setNom(nomR);
		setLargeur(largeur);
	}

	/**
	 * Constructeur Rectangle avec un seul parametre "largeur"
	 * @param largeur
	 * La largeur du r�ctangle
	 */
	public Rectangle(double largeur) {
		super();
		setLargeur(largeur);
	}

	/**
	 * @return sRect 
	 * La superficie du rectangle
	 */
	@Override
	public double superficie() {
		double sRect = Math.round(getLongueur() * getLargeur());//Retourner l'arrondie de la superficie
		return sRect;
	}

	//TODO Red�finition de la m�thode � toString � pour la classe Rectangle
	/**
	 * Red�finir la classe toString de la classe Rectangle
	 */
	@Override
	public String toString() {
		return "La superficie du r�ctangle '"+ getNom() +"' est " + superficie();
	}

	/**
	 * Afficher la superficie du rectangle
	 */
	public void afficher() {
		System.out.println(this.toString());
	}
	
}
