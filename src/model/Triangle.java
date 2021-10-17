/**
 * 
 */
package model;

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
		if (cote <= 0) 
		      throw new ArithmeticException("La longueur du cote doit etre superieure à 0"); 
		
		else {
	        	this.cote = cote;    	
	        	}
	}

	/**
	 * Constructeur Triangle vide
	 */
	public Triangle() {
		super();
	}

	/**
	 * Constructeur Triangle avec des parametres en argument
	 * @param origine
	 * Le point d'origine du traingle, il a été hérité de la classe forme géométrique
	 * @param cote
	 * Un côté de l'angle droit est soit opposé, soit adjacent à l'un des angles aigus du triangle.
	 */
	public Triangle(Point origine,int cote) {
		super(origine);
		setCote(cote);
	}
	
}
