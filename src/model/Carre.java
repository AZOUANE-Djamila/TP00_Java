/**
 * 
 */
package model;
import java.lang.Math;

/**
 * Cette classe repr�sente un carr�
 * @author AZOUANE DJAMILA
 *
 */
public class Carre extends FormeGeometrique {
	
	private int longueur;
	
	
	/**
	 * R�cup�rer la longueur du carr�
	 * @return la longueur
	 */
	public int getLongueur() {
		return longueur;
	}


	/**
	 * @param longueur � affecter
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	/**
	 * Constructeur Carre vide
	 */
	public Carre() {
		super();
		setOrigine(new Point());
		setNom("Carre");
	}

	/**	
	 * Constructeur Carre avec ses parametres en argument
	 * 
	 * @param origine
	 * Point d'origine
	 * @param nomC 
	 * Ce parametre est h�rit� de la classe forme g�om�trique le nom de la forme g�om�trique ici il est = "Carr�"
	 * @param longueur
	 * La longueur du carr�
	 */
 	public Carre(Point origine, String nomC, int longueur) {
		super();
		setOrigine(origine);
		setNom(nomC);
		setLongueur(longueur);
	}

	/**
	  * Calculer et r�cup�rer la superficie du carr�e
	  * @return sC la superficie du carr�e
	 */
	@Override
	public double superficie() {
		double sC = Math.pow(longueur,2);//La formule math�matique =longueur^2
		return sC; 
	}
	
	/**
	 * Red�finir la classe toString() attribu�e � la classe Carre
	 */
	@Override
	public String toString() {
		return "Carre  Nom = " + getNom() + "\n" + "Longueur =" + getLongueur() + "\n " + "La superficie de carre =" + superficie();
	}
	
	
}
