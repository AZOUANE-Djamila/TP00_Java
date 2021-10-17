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
	
	protected int longueur;
	
	
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
		if (longueur <= 0) 
		      throw new ArithmeticException("La longueur doit etre superieure à 0"); 
		
		else {
	        	this.longueur = longueur;    	
	        	}
	}

	
	/**
	 * Constructeur Carre vide
	 */
	public Carre() {
		super();
	}


	/**	
	 * Constructeur Carre avec ses parametres en argument
	 * 
	 * @param origine
	 * Point d'origine
	 * @param longueur
	 * La longueur du carré
	 */
 	public Carre(Point origine, int longueur) {
		super(origine);//Les attribut hérités de la classe mere
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

	// Redéfinition de la méthode « toString » pour toutes les classes non abstraites ;
		/**
		 * Redéfinir la classe toString() attribuée à la classe Carre
		 */
	@Override
	public String toString() {
		return String.format("Carre [Longueur=%s, Superficie=%s, Origine=%s, Nom=%s]", getLongueur(),
				superficie(), getOrigine(), getNom());
	}
	
	
	
	
	
}
