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
		this.base = base;
	}

	
	/**
	 * Constructeur Triangle socele vide
	 */
	public TriangleIsocele() {
		super();
		setOrigine(new Point());//setOrigine est hérité de la classe mere triangle
		setNom("Triangle socele");//setNom sont hérités de la classe mere triangle
		setBase(base);
	}

	/**
	 * Constructeur Triangle socele avec ses parametres
	 * @param origine
	 * Relative à l'origine
	 * @param nomTs
	 * Ce parametre est hérité de la classe forme géométrique le nom de la forme géométrique ici il est = "TriangleIsocele"
	 * @param cote
	 * La taille du coté 
	 * @param base
	 * La base du triangle Isocele
	 */
	public TriangleIsocele(Point origine, String nomTs, int cote, int base) {
		super(origine, nomTs, cote);//Les parametres sont hérités de la classe mere triangle
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

	
	//TODO Redéfinition de la méthode « toString » pour la classe TriangleIsocele

	/**
	 * @return la superficie du triangle Isocele
	 */
	@Override
	public String toString() {
		return "Le nom du triangle est "+ getNom() +"\nL'origine est "+ getOrigine() +" La taille de la base est " + getBase()+"\nLa taille du coté est "+ getCote() +"\nLa superficie est" + superficie();
	}

	/**
	 * Afficher la superficie du triangle Isocele
	 */
	public void afficher() {
		System.out.println("La superficie du triangle socele"+toString());
	}


	
	
}
