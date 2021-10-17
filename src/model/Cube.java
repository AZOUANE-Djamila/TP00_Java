/**
 * 
 */
package model;

/**
 * Représente un cube
 * @author AZOUANE Djamila
 *
 */

// La classe cube ne peut pas être héritée par une autre classe ;
	/**
	 * J'ai utilisé final pour ne pas autoriser l'héritage de la classe Cube par une autre classe
	 */
public final class Cube extends Carre {

	/**
	 * Constructeur Cube vide
	 */
	public Cube() {
		super();
	}

	//	Exemple d’utilisation du mot « super » avec une méthode et un constructeur ; (mettre une explication en commentaire)
	/**
	 * Constructeur de la classe Cube
	 * super(origine, longueur); est pour acceder aux attribut hérité de la classe mere
	 * @param origine
	 * Point d'origine du Cube
	 * @param longueur
	 * La longueur du cube
	 */
	public Cube(Point origine, int longueur) {
		super(origine, longueur);
		setOrigine(origine);
		setLongueur(longueur);
	}

	/**
	  * @return la superficie du cube
	  * Superficie du cube = La superficie deu carré * 6
	 */
	@Override
	public double superficie() {

		//return 6 * Math.pow(getLongueur(),2);
		return super.superficie() * 6;
	}
	

	/**
	 * Calculer et retourner le volume du cube
	 * La méthode volume ne peut pas être redéfinie par les classes filles ;
	 * @return vCb le colume du cube
	 * J'ai utilisé final pour ne pas autoriser l'héritage du volume par une autre classe
	 */
	public final double volume() {
		double vCb = Math.round(Math.pow(getLongueur(),3));//Retourner l'arrondie de la superficie
		return vCb;
	}

	//	Redéfinition de la méthode « toString » pour la classe Cube
		/**
		 * Redefinir la méthode toString attribuée à Cube
		 */
	@Override
	public String toString() {
		return String.format(
				"Cube [superficie=%s, volume=%s, Longueur=%s, Origine=%s, Nom=%s]",
				superficie(), volume(), getLongueur(), getOrigine(), getNom());
	}
	
	
	
}
