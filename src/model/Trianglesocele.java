/**
 * 
 */
package model;

/** 
 * Repr�sente un triangle isoc�le. un triangle isoc�le est un triangle ayant au moins deux c�t�s de m�me longueur.
 * @author AZOUANE DJAMILA
 * {@summary Un triangle isoc�le est un triangle dont deux c�t� sont �gaux. Le troisi�me c�t� est appel� la base} 
 */

public class Trianglesocele extends Triangle {
	
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
		this.base = base;
	}

	
	/**
	 * Constructeur Triangle socele vide
	 */
	public Trianglesocele() {
		super();
		setOrigine(new Point());//setOrigine est h�rit� de la classe mere triangle
		setNom("Triangle socele");//setNom sont h�rit�s de la classe mere triangle
		setBase(base);
	}

	/**
	 * Constructeur Triangle socele avec ses parametres
	 * @param origine
	 * Relative � l'origine
	 * @param nomTs
	 * Ce parametre est h�rit� de la classe forme g�om�trique le nom de la forme g�om�trique ici il est = "TriangleIsocele"
	 * @param cote
	 * La taille du cot� 
	 * @param base
	 * La base du triangle Isocele
	 */
	public Trianglesocele(Point origine, String nomTs, int cote, int base) {
		super(origine, nomTs, cote);//Les parametres sont h�rit�s de la classe mere triangle
		setOrigine(origine);
		setNom(nomTs);
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

	
	//TODO Red�finition de la m�thode � toString � pour la classe TriangleIsocele

	/**
	 * @return la superficie du triangle Isocele
	 */
	@Override
	public String toString() {
		return "La superficie du Trianglesocele est" + superficie();
	}
	
	/**
	 * Afficher la superficie du triangle Isocele
	 */
	public void afficher() {
		System.out.println("La superficie du triangle socele"+toString());
	}
	
}
