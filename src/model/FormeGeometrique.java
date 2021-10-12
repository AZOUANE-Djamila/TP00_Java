/**
 * 
 */
package model;

/**
 * Représente une forme géométrique.
 * @author AZOUANE DJAMILA
 *
 */

public abstract class FormeGeometrique {

	/**
	 * Définition d’une variable globale « épaisseur » de type entier qui indiquera l’épaisseur du trait des différente formes géométriques
	 */
	public static double epaisseur;
	
	/**
	 * origine est le point d'origine d'une forme géométrique
	 * nom est le nom de la forme géométrique
	 */
	private Point origine;
	private String nom;
	
	/**
	 * @return origine Récupérer le point d'origine de la forme géométrique 
	 */
	public Point getOrigine() {
		return origine;
	}
	
	/**
	 * @param origine le point d'origine à mettre
	 */
	public void setOrigine(Point origine) {
		this.origine = origine;
	}
	

	/**
	 * Récupérer le nom relatif à la forme géométrique
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	
	/**
	 * @param nom le nom à attribuer à la forme géométrique
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	

	/**
	 * Déclaration de la méthode superficie. Cette derniere va étre définie dans les classes filles
	 * @return la superficie de la forme géométrique
	 */
	public abstract double superficie();
	
	/**
	 * Comparer deux formes géométrique selon la superficie de chacune
	 * @param fg 
	 * La forme géométrique
	 * @return false si les superficies des deux formes géométriques ne sont pas égaux
	 * true si les superficies des deux formes géométriques sont égaux
	 */
	public boolean equals(FormeGeometrique fg) {
		
		return (superficie() == fg.superficie() );
	}
	
	/**
	 * Une méthode qui sert à doubler l'épaisseur d'une forme géométrique
	 * @param FG
	 * La forme géométrique
	 * @return Le double d'épaisseur de la forme géométrique
	 */
	public double doubleEpaisseur(FormeGeometrique FG) {
		return FG.epaisseur * 2;//Doubler l'épaisseur de la forme géométrique
	}
	
}
