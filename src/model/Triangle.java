/**
 * 
 */
package model;
import java.lang.Math;

/**
 * @author AZOUANE DJAMILA
 *
 */
public abstract class Triangle extends FormeGeometrique {
	
	private int cote;
	
	
	/**
	 * @return the cote
	 */
	public int getCote() {
		return cote;
	}


	/**
	 * @param cote the cote to set
	 */
	public void setCote(int cote) {
		this.cote = cote;
	}

	//Constructeur Triangle 
	public Triangle() {
		super();
		setOrigine(new Point());
		setNom("Triangle");
	}

	//Constructeur Triangle avec parametres
	public Triangle(Point origine, String nomC, int cote) {
		super();
		setOrigine(origine);
		setNom(nomC);
		setCote(cote);
	}


	@Override
	public abstract double superficie();//Déclarer la superficie du triangle comme méthode abstract
	
	
}
