/**
 * 
 */
package model;

/**
 * Repr�sente un cube
 * @author AZOUANE Djamila
 *
 */
public class Cube extends Carre {

	/**
	 * Constructeur Cube vide
	 */
	public Cube() {
		super();
		setNom("Cube");
	}

	/**
	 * 
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
	
	/**
	 * Calculer et retourner le volume du cube
	 * La m�thode volume ne peut pas �tre red�finie par les classes filles ;
	 * @return vCb le colume du cube
	 */
	public final double volume() {
		double vCb = Math.round(Math.pow(getLongueur(),3));//Retourner l'arrondie de la superficie
		return vCb;
	}
	
	
	/**
	 * Redefinir la m�thode toString attribu�e � Cube
	 */
	@Override
	public String toString() {
		return "La superficie du cube =" + superficie() + "\\n Le volume du cube =" + volume();
	}
	
	
}
