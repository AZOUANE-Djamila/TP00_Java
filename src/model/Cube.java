/**
 * 
 */
package model;

/**
 * Repr�sente un cube
 * @author AZOUANE Djamila
 *
 */

//TODO La classe cube ne peut pas �tre h�rit�e par une autre classe ;
	/**
	 * J'ai utilis� final pour ne pas autoriser l'h�ritage de la classe Cube par une autre classe
	 */
public final class Cube extends Carre {

	/**
	 * Constructeur Cube vide
	 */
	public Cube() {
		super();
		setNom("Cube");
	}

	//TODO	Exemple d�utilisation du mot � super � avec une m�thode et un constructeur ; (mettre une explication en commentaire)
	/**
	 * Constructeur de la classe Cube
	 * super(origine, nomCb, longueur); est pour acceder aux attribut h�rit� de la classe mere
	 * @param origine
	 * Point d'origine du Cube
	 * @param nomCb
	 * Ce parametre est h�rit� de la classe forme g�om�trique le nom de la forme g�om�trique ici il est = "Cube"
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
	
	//TODO La m�thode volume ne peut pas �tre red�finie par les classes filles ;

	/**
	 * Calculer et retourner le volume du cube
	 * La m�thode volume ne peut pas �tre red�finie par les classes filles ;
	 * @return vCb le colume du cube
	 * J'ai utilis� final pour ne pas autoriser l'h�ritage du volume par une autre classe
	 */
	public final double volume() {
		double vCb = Math.round(Math.pow(getLongueur(),3));//Retourner l'arrondie de la superficie
		return vCb;
	}
	
	
	//TODO	Red�finition de la m�thode � toString � pour la classe Cube
	/**
	 * Redefinir la m�thode toString attribu�e � Cube
	 */
	@Override
	public String toString() {
		return "La superficie du cube =" + superficie() + "\\n Le volume du cube =" + volume();
	}
	
	
}
