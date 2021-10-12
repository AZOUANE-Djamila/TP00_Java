/**
 * 
 */
package model;

/**
 * Repr�sente une forme g�om�trique.
 * @author AZOUANE DJAMILA
 *
 */

public abstract class FormeGeometrique {

	/**
	 * D�finition d�une variable globale � �paisseur � de type entier qui indiquera l��paisseur du trait des diff�rente formes g�om�triques
	 */
	public static double epaisseur;
	
	/**
	 * origine est le point d'origine d'une forme g�om�trique
	 * nom est le nom de la forme g�om�trique
	 */
	private Point origine;
	private String nom;
	
	/**
	 * @return origine R�cup�rer le point d'origine de la forme g�om�trique 
	 */
	public Point getOrigine() {
		return origine;
	}
	
	/**
	 * @param origine le point d'origine � mettre
	 */
	public void setOrigine(Point origine) {
		this.origine = origine;
	}
	

	/**
	 * R�cup�rer le nom relatif � la forme g�om�trique
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	
	/**
	 * @param nom le nom � attribuer � la forme g�om�trique
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	

	/**
	 * D�claration de la m�thode superficie. Cette derniere va �tre d�finie dans les classes filles
	 * @return la superficie de la forme g�om�trique
	 */
	public abstract double superficie();
	
	/**
	 * Comparer deux formes g�om�trique selon la superficie de chacune
	 * @param fg 
	 * La forme g�om�trique
	 * @return false si les superficies des deux formes g�om�triques ne sont pas �gaux
	 * true si les superficies des deux formes g�om�triques sont �gaux
	 */
	public boolean equals(FormeGeometrique fg) {
		
		return (superficie() == fg.superficie() );
	}
	
	/**
	 * Une m�thode qui sert � doubler l'�paisseur d'une forme g�om�trique
	 * @param FG
	 * La forme g�om�trique
	 * @return Le double d'�paisseur de la forme g�om�trique
	 */
	public double doubleEpaisseur(FormeGeometrique FG) {
		return FG.epaisseur * 2;//Doubler l'�paisseur de la forme g�om�trique
	}
	
}
