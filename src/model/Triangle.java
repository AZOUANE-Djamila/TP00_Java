/**
 * 
 */
package model;
import java.lang.Math;

/**
 * Repr�sente un triangle
 * @author AZOUANE DJAMILA
 *
 */
public abstract class Triangle extends FormeGeometrique {
	
	private int cote;
	
	
	/**
	 * @return cote
	 * R�cup�rer la taille du cot� d'un triangle
	 */
	public int getCote() {
		return cote;
	}


	/**
	 * Modifier la taille du cot� d'un triangle
	 * @param cote la taille du cot� � mettre
	 */
	public void setCote(int cote) {
		this.cote = cote;
	}

	/**
	 * Constructeur Triangle vide
	 */
	public Triangle() {
		super();
		setOrigine(new Point());
		setNom("Triangle");
	}

	/**
	 * Constructeur Triangle avec des parametres en argument
	 * @param origine
	 * Le point d'origine du traingle, il a �t� h�rit� de la classe forme g�om�trique
	 * @param nomC
	 * nomC est h�rit� de la classe g�om�trique ici il est = "Triangle"
	 * @param cote
	 * Un c�t� de l'angle droit est soit oppos�, soit adjacent � l'un des angles aigus du triangle.
	 */
	public Triangle(Point origine, String nomC, int cote) {
		super();
		setOrigine(origine);
		setNom(nomC);
		setCote(cote);
	}

	/**
	  * @return Retourne la superficie du traiangle
	 */
	@Override
	public abstract double superficie();//D�clarer la superficie du triangle comme m�thode abstract
	
	
}
