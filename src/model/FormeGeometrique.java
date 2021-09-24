/**
 * 
 */
package model;

/**
 * @author AZOUANE DJAMILA
 *
 */

public abstract class FormeGeometrique {

	public static double epaisseur;/*D�finition d�une variable globale � �paisseur � de type entier qui indiquera 
	l��paisseur du trait des diff�rente formes g�om�triques */
	
	
	private Point origine;
	private String nom;
	/**
	 * @return the origine
	 */
	public Point getOrigine() {
		return origine;
	}
	/**
	 * @param origine the origine to set
	 */
	public void setOrigine(Point origine) {
		this.origine = origine;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//D�clarer la m�thode superficie
	public abstract double superficie();// Cette m�thode va �tre d�finie dans les classes filles
	
	public boolean equals(FormeGeometrique fg) {
		
		return (superficie() == fg.superficie() );
	}
	
	/*-	D�finition d�une fonction permettant de doubler (multiplier fois 2) 
	 * l��paisseur des diff�rentes formes g�om�triques
	 */
	public double doubleEpaisseur(FormeGeometrique FG) {
		return FG.epaisseur * 2;//Doubler l'�paisseur de la forme g�om�trique
	}
	
}
