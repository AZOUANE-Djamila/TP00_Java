/**
 * 
 */
package model;

/**
 * Représente un cube
 * @author AZOUANE Djamila
 *
 */

//TODO La classe cube ne peut pas être héritée par une autre classe ;
	/**
	 * J'ai utilisé final pour ne pas autoriser l'héritage de la classe Cube par une autre classe
	 */
public final class Cube extends Carre {

	/**
	 * Constructeur Cube vide
	 */
	public Cube() {
		super();
		setNom("Cube");
	}

	//TODO	Exemple d’utilisation du mot « super » avec une méthode et un constructeur ; (mettre une explication en commentaire)
	/**
	 * Constructeur de la classe Cube
	 * super(origine, nomCb, longueur); est pour acceder aux attribut hérité de la classe mere
	 * @param origine
	 * Point d'origine du Cube
	 * @param nomCb
	 * Ce parametre est hérité de la classe forme géométrique le nom de la forme géométrique ici il est = "Cube"
	 * @param longueur
	 * La longueur du cube
	 */
	public Cube(Point origine, String nomCb, int longueur) {
		super(origine, nomCb, longueur);
		setOrigine(origine);
		setNom(nomCb);
		setLongueur(longueur);
	}

	/**
	  * @return la superficie du cube
	 */
	@Override
	public double superficie() {

		return 6 * Math.pow(getLongueur(),2);
	}
	
	//TODO La méthode volume ne peut pas être redéfinie par les classes filles ;

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
	
	
	//TODO	Redéfinition de la méthode « toString » pour la classe Cube
	/**
	 * Redefinir la méthode toString attribuée à Cube
	 */
	@Override
	public String toString() {
		return "La superficie du cube =" + superficie() + "\\n Le volume du cube =" + volume();
	}
	
	
}
