/**
 * 
 */
package model;

/** 
 * Représente un triangle isocèle. un triangle isocèle est un triangle ayant au moins deux côtés de même longueur.
 * @author AZOUANE DJAMILA
 * {@summary Un triangle isocèle est un triangle dont deux côté sont égaux. Le troisième côté est appelé la base} 
 */

public class TriangleIsocele extends Triangle {
	
	private int base;
	
	
	/**
	 * @return la base du triangle isocele
	 */
	public int getBase() {
		return base;
	}


	/**
	 * @param base 
	 * Remplacer la taille de la base par la base en argument
	 */
	public void setBase(int base) {
		if (base <= 0) 
		      throw new ArithmeticException("La longueur de la base doit etre superieure à 0"); 
		
		else {
	        	this.base = base;    	
	        	}
	}

	
	/**
	 * Constructeur Triangle socele vide
	 */
	public TriangleIsocele() {
		super();
		setOrigine(new Point());//setOrigine est hérité de la classe mere triangle
		setBase(base);
	}

	/**
	 * Constructeur Triangle socele avec ses parametres
	 * @param origine
	 * Relative à l'origine
	 * @param cote
	 * La taille du coté 
	 * @param base
	 * La base du triangle Isocele
	 */
	public TriangleIsocele(Point origine, int cote, int base) {
		super(origine, cote);//Les parametres sont hérités de la classe mere triangle
		setOrigine(origine);
		setBase(base);
		
	}

	/**
	 * Calculer la superficie du Triangle Isocele
	 * @return Retourne la superficie du triangle socele
	 */
	@Override
	public double superficie() {
		return Math.round(1/2 * getBase() * getCote());//Retourner l'arrondie de la superficie
	}

	

	/**
	 * @return la superficie du triangle Isocele
	 */
	

	@Override
	public String toString() {
		return String.format(
				"TriangleIsocele [Base=%s, superficie=%s, Cote=%s, Origine=%s, Nom()=%s]",
				getBase(), superficie(), getCote(), getOrigine(), getNom());
	}


	/**
	 * Afficher la superficie du triangle Isocele
	 */
	public void afficher() {
		System.out.println("La superficie du triangle socele"+toString());
	}


	
	
}
