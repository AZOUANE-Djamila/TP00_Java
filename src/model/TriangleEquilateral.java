/**
 * 
 */
package model;

/**
 * @author AZOUANE DJAMILA
  * {@summary -	Un triangle équilatéral est un triangle dont tous les côtés sont égaux } 

 */

public class TriangleEquilateral extends Triangle {
	
	public TriangleEquilateral() {
		super();
		setOrigine(new Point());//setOrigine est hérité de la classe mere triangle
		setNom("Triangle Equilateral");//setNom sont hérités de la classe mere triangle
	}


	public TriangleEquilateral(Point origine, String nomTs, int cote, int base) {
		super(origine, nomTs, cote);
		setOrigine(origine);//setOrigine est hérité de la classe mere triangle
		setNom(nomTs);		//setNom sont hérités de la classe mere triangle
	}

	// Calculer la superficie du Triangle equilaterale
	@Override
	public double superficie() {
		return Math.round( Math.sqrt(3)/4 ) * getCote();//Formule de la superficie = √ 3/4 *cote
		//Retourner l'arrondie de la superficie
	}

	
	/**
	 * @return la superficie du triangle equilateral
	 */
	@Override
	public String toString() {
		return "La superficie de TriangleEquilateral nommé '"+getNom()+"' est" + superficie();
	}
	
	public void afficher() {
		System.out.println(toString());
	}
	

}
