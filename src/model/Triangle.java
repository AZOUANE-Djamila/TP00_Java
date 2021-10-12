/**
 * 
 */
package model;
import java.lang.Math;

/**
 * Représente un triangle
 * @author AZOUANE DJAMILA
 *
 */
public abstract class Triangle extends FormeGeometrique {
	
	private int cote;
	
	
	/**
	 * @return cote
	 * Récupérer la taille du coté d'un triangle
	 */
	public int getCote() {
		return cote;
	}


	/**
	 * Modifier la taille du coté d'un triangle
	 * @param cote la taille du coté à mettre
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
	 * Le point d'origine du traingle, il a été hérité de la classe forme géométrique
	 * @param nomC
	 * nomC est hérité de la classe géométrique ici il est = "Triangle"
	 * @param cote
	 * Un côté de l'angle droit est soit opposé, soit adjacent à l'un des angles aigus du triangle.
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
	public abstract double superficie();//Déclarer la superficie du triangle comme méthode abstract
	
	
}
