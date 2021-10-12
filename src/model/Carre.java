/**
 * 
 */
package model;
import java.lang.Math;

/**
 * Cette classe représente un carré
 * @author AZOUANE DJAMILA
 *
 */
public class Carre extends FormeGeometrique {
	
	private int longueur;
	
	
	/**
	 * Récupérer la longueur du carré
	 * @return la longueur
	 */
	public int getLongueur() {
		return longueur;
	}


	/**
	 * @param longueur à affecter
	 * Attribuer l'argument longueur à this.longueur = Attribuez la valeur du paramètre "longueur" à la variable d'instance "longueur"
	 * 'this' est utilisé pour désambiguïser les références de variables. 
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
	 * Ce parametre est hérité de la classe forme géométrique le nom de la forme géométrique ici il est = "Carré"
	 * @param longueur
	 * La longueur du carré
	 */
 	public Carre(Point origine, String nomC, int longueur) {
		super();
		setOrigine(origine);
		setNom(nomC);
		setLongueur(longueur);
	}

	/**
	  * Calculer et récupérer la superficie du carrée
	  * @return sC la superficie du carrée
	 */
	@Override
	public double superficie() {
		double sC = Math.pow(longueur,2);//La formule mathématique =longueur^2
		return sC; 
	}
	
	//TODO Redéfinition de la méthode « toString » pour toutes les classes non abstraites ;
	/**
	 * Redéfinir la classe toString() attribuée à la classe Carre
	 */
	@Override
	public String toString() {
		return "Le nom du carré est " + getNom() + "\n" + "Longueur = " + getLongueur() + "\n" + "La superficie de carré = " + superficie();
	}
	
	
}
