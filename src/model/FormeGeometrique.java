/**
 * 
 */
package model;

/**
 * @author AZOUANE DJAMILA
 *
 */

public abstract class FormeGeometrique {

	public static double epaisseur;/*Définition d’une variable globale « épaisseur » de type entier qui indiquera 
	l’épaisseur du trait des différente formes géométriques */
	
	
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
	
	//Déclarer la méthode superficie
	public abstract double superficie();// Cette méthode va étre définie dans les classes filles
	
	public boolean equals(FormeGeometrique fg) {
		
		return (superficie() == fg.superficie() );
	}
	
	/*-	Définition d’une fonction permettant de doubler (multiplier fois 2) 
	 * l’épaisseur des différentes formes géométriques
	 */
	public double doubleEpaisseur(FormeGeometrique FG) {
		return FG.epaisseur * 2;//Doubler l'épaisseur de la forme géométrique
	}
	
}
