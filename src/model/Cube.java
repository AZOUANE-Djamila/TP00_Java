/**
 * 
 */
package model;

/**
 * @author AZOUANE Djamila
 *
 */
public class Cube extends Carre {

	public Cube() {
		super();
		setNom("Cube");
	}

	
	public Cube(Point origine, String nomCb, int longueur) {
		super(origine, nomCb, longueur);
		setOrigine(origine);
		setNom(nomCb);
		setLongueur(longueur);
	}


	@Override
	public double superficie() {

		return 6 * Math.pow(getLongueur(),2);
	}
	public final double volume() {

		return Math.round(Math.pow(getLongueur(),3));//Retourner l'arrondie de la superficie
	}

	@Override
	public String toString() {
		return "La superficie du cube =" + superficie() + "\\n Le volume du cube =" + volume();
	}
	
	
}
