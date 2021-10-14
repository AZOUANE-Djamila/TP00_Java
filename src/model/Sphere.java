/**
 * 
 */
package model;

/**
 * Représente un sphere
 * @author AZOUANE Djamila
 *
 */

public class Sphere extends Cercle {

	/**
	 * Le constructeur du sphere vide
	 */
	public Sphere() {
		super();
		setNom("Sphere");
	}
	
	/**
	  * @return sSph la superficie du sphere
	 */
	
	@Override
	public double superficie() {
		double rSph = getDiametre()/2;
		double sSph = 4 * Math.PI * Math.pow(rSph,2);//Formule mathémtique= 4πr2
		return sSph;
	}
	
	/**
	 * 
	 * @return v
	 * Le volume du sphere
	 */
	public final double volume() {
		double rSph = getDiametre()/2;
		double v = Math.round(4/3 * Math.PI * Math.pow(rSph,3));//Retourner l'arrondie de la superficie
		return v;
	}
	
	//TODO Redéfinition de la méthode « toString » pour la classe Sphere
	/**
	 * Redéfinir la méthode toString attribué à la classe Sphere
	 */
	@Override
	public String toString() {
		return "Le nom du sphere est " + getNom() + "\nL'origine est " + getOrigine() + "\nLa taille du diametre " + getDiametre() +"\nLa superficie du Sphere est " + superficie() + "\nSon volume est " + volume();
			
	}
	
	/**
	 * Afficher le contenu de toString
	 */
	public void afficher() {System.out.println(this.toString());}	
}
