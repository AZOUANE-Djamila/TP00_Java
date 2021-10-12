/**
 * 
 */
package model;
import java.lang.Math;

/**
 *  Représente un cercle
 * @author AZOUANE DJAMILA
 *
 */
public class Cercle extends FormeGeometrique {
	
	private int diametre;
	
	
	/**
	 * @return the diametre
	 */
	public int getDiametre() {
		return diametre;
	}


	/**
	 * @param diametre the diametre to set
	 */
	public void setDiametre(int diametre) {
		this.diametre = diametre;
	}

	/**
	 * Constructeur Cercle vide
	 */
	public Cercle() {
		super();
		setOrigine(new Point());
		setNom("Cercle");
	}

	/**
	 * 
	 * @param origine
	 * Le point d'origine de la classe Cercle
	 * @param nomC
	 * Ce parametre est hérité de la classe forme géométrique le nom de la forme géométrique ici il est = "Cercle"
	 * @param diametre
	 * Diametre du cercle 
	 */
	public Cercle(Point origine, String nomC, int diametre) {
		super();
		setOrigine(origine);
		setNom(nomC);
		setDiametre(diametre);
	}

	/**
	  * @return la superficie du cercle
	 */
	@Override
	public double superficie() {
		double rayon = getDiametre()/2;
		return Math.round(Math.pow(rayon,2) * Math.PI);//Retourner l'arrondie de la superficie
	}

	/**
	 * Redéfinir la méthode toString attribuée à la classe Cercle
	 */
	@Override
	public String toString() {
		return "La superficie  du '"+ getNom()+"'" + superficie();
	}
	
	/**
	 * Afficher les informations relatives à la classe Cercle
	 */
	public void afficher() {
		System.out.println(toString());
	}
	
}
