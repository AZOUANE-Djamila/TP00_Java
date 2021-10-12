/**
 * 
 */
package model;

/**
 * @author AZOUANE DJAMILA
 * La classe réctangle défini le rectangle, sa largeur et sa superficie
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
	 * Ce parametre est hérité de la classe forme géométrique le nom de la forme géométrique ici il est = "Rectangle"
	 * @param largeur
	 * La largeur du rectangle
	 * @param longueur
	 * La longueur du rectangle hérité de la classe Carre
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
	 * La largeur du réctangle
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

	//TODO Redéfinition de la méthode « toString » pour la classe Rectangle
	/**
	 * Redéfinir la classe toString de la classe Rectangle
	 */
	@Override
	public String toString() {
		return "La superficie du réctangle '"+ getNom() +"' est " + superficie();
	}

	/**
	 * Afficher la superficie du rectangle
	 */
	public void afficher() {
		System.out.println(this.toString());
	}
	
}
