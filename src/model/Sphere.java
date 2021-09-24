/**
 * 
 */
package model;

/**
 * @author AZOUANE Djamila
 *
 */
public class Sphere extends Cercle {

	public Sphere() {
		super();
		setNom("Sphere");
	}
	
	
	//== 4πr2
	@Override
	public double superficie() {
		double rSph = getDiametre()/2;
		return 4 * Math.PI * Math.pow(rSph,2);
	}
	
	//
	public final double volume() {
		double rSph = getDiametre()/2;
		return Math.round(4/3 * Math.PI * Math.pow(rSph,3));//Retourner l'arrondie de la superficie
	}

	@Override
	public String toString() {
		return "La superficie du sphere =" + superficie() + "\n Le volume du sphere =" + volume();
	}
	
	
	
}
