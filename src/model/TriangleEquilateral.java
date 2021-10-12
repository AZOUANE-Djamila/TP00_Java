/**
 * 
 */
package model;

/**
 * 	Représente un triangle equilateral. Un triangle équilatéral est un triangle dont les trois côtés ont la même longueur.
 * 	@author AZOUANE DJAMILA
 * {@summary -	Un triangle équilatéral est un triangle dont tous les côtés sont égaux } 

 */
public class TriangleEquilateral extends Triangle {
	
	/**
	 * Constructeur TriangleEquilateral vide
	 */
	public TriangleEquilateral() {
		super();
		setOrigine(new Point());//setOrigine est hérité de la classe mere triangle
		setNom("Triangle Equilateral"); //setNom sont hérités de la classe mere triangle
	}

	/**
	 * 
	 * @param origine
	 * L'origine point 
	 * @param nomTs
	 * Ce parametre est hérité de la classe forme géométrique le nom de la forme géométrique ici il est = "TriangleEquilateral"
	 * @param cote
	 * La taille du coté
	 * @param base
	 * La taille de la base du triangle Equilateral
	 */
	public TriangleEquilateral(Point origine, String nomTs, int cote, int base) {
		super(origine, nomTs, cote);
		setOrigine(origine);//setOrigine est hérité de la classe mere triangle
		setNom(nomTs);		//setNom sont hérités de la classe mere triangle
	}

	/**
	  * @return Retourne la superficie du triangle Equilateral
	 */
	@Override
	public double superficie() {
		return Math.round( Math.sqrt(3)/4 ) * getCote();//Formule de la superficie = √ 3/4 *cote
		//Retourner l'arrondie de la superficie
	}

	//TODO Redéfinition de la méthode « toString » pour la classe Triangle Equilateral

	/**
	 * @return la superficie du triangle equilateral
	 */
	@Override
	public String toString() { 
		return "Le nom du triangle est " + getNom() + "\nLe point d'origine est " 
	+ getOrigine() + "\nLa taille du coté est " + getCote() + "\nLa superficie est " + superficie();
	}
	
	/**
	 * Afficher la superficie du triangle Equilateral
	 */
	public void afficher() {
		System.out.println("La superficie du triangle Equilateral"+toString());
	}

	
	

}
