/**
 * 
 */
package model;
import java.lang.Math;

/**
 * @author AZOUANE DJAMILA
 *
 */
public class Carre extends FormeGeometrique {
	
	private int longueur;
	
	
	/**
	 * @return the longueur
	 */
	public int getLongueur() {
		return longueur;
	}


	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	// Constructeur pour Carre
	public Carre() {
		super();
		setOrigine(new Point());
		setNom("Carre");
	}

	// Constructeur pour Carre avec les parametres
	public Carre(Point origine, String nomC, int longueur) {
		super();
		setOrigine(origine);
		setNom(nomC);
		setLongueur(longueur);
	}


	@Override
	public double superficie() {
		return Math.pow(longueur,2);
	}


	@Override
	public String toString() {
		return "Carre  Nom = " + getNom() + "\n" + "Longueur =" + getLongueur() + "\n " + "La superficie de carre =" + superficie();
	}
	
	
}
