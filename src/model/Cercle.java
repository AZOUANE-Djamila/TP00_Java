/**
 * 
 */
package model;
import java.lang.Math;

/**
 * @author AZOUANE DJAMILA
 *
 */
public class Cercle extends FormeGeometrique {
	
	private int diametre;
	
	
	/**
	 * @return the diametre
	 */
	public int getDiametre() {
		return diametre;
	}


	/**
	 * @param diametre the diametre to set
	 */
	public void setDiametre(int diametre) {
		this.diametre = diametre;
	}

	
	public Cercle() {
		super();
		setOrigine(new Point());
		setNom("Cercle");
	}


	public Cercle(Point origine, String nomC, int diametre) {
		super();
		setOrigine(origine);
		setNom(nomC);
		setDiametre(diametre);
	}


	@Override
	public double superficie() {
		double rayon = getDiametre()/2;
		return Math.round(Math.pow(rayon,2) * Math.PI);//Retourner l'arrondie de la superficie
	}


	@Override
	public String toString() {
		return "La superficie  du '"+ getNom()+"'" + superficie();
	}
	public void afficher() {
		System.out.println(toString());
	}
	
}
