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
	public static int EPAISSEUR = 1;
	
	/**
	 * origine est le point d'origine d'une forme géométrique
	 * nom est le nom de la forme géométrique
	 */
	private Point origine;
	/**
	 * @return origine Récupérer le point d'origine de la forme géométrique 
	 */
	public Point getOrigine() {
		return origine;
	}
	
	/**
	 * @param origine le point d'origine à mettre
	 * Attribuer l'argument origine à this.x = Attribuez la valeur du paramètre "origine" à la variable d'instance "origine"
	 * 'this' est utilisé pour désambiguïser les références de variables. 
	 */
	public void setOrigine(Point origine) {
		this.origine = origine;
	}
	

	/**
	 * Récupérer le nom relatif à la forme géométrique
	 * @return nom
	 */
	public String getNom() {
		return this.getClass().getSimpleName();
	}
	
	
	/**
	 * @param nom le nom à attribuer à la forme géométrique
	 */
	public void setNom(FormeGeometrique fg) {
		fg.getClass().getSimpleName();
	}
	
	
	/**
	 * Constructeur avec tous les attribut d'une orme géométrique
	 * @param origine Le point
	 * @param nom Le nom de la forme géométrique
	 */
	public FormeGeometrique(Point origine) {
		super();
		setOrigine(origine);
		setNom(this);
	}
	
	/**
	 * Constructeur forme géométrique vide
	 */
	public FormeGeometrique() {
		super();
	}

	/**
	 * Déclaration de la méthode superficie. Cette derniere va étre définie dans les classes filles
	 * @return la superficie de la forme géométrique
	 */
	public abstract double superficie();
	

	/**
	 * redéfinir la méthode equals
	 */
	@Override  	//overriding equals() method  
	public boolean equals(Object o)   
	{  
		if (o == null)  return false;  
		if (o == this)return true;  
		return this.superficie() == ((FormeGeometrique) o).superficie();  
	}  


	/**
	 * Une méthode qui sert à doubler l'épaisseur d'une forme géométrique
	 * @param FG
	 * La forme géométrique
	 * @return Le double d'épaisseur de la forme géométrique
	 */
	public static double doubleEpaisseur(FormeGeometrique FG) {
		return FormeGeometrique.EPAISSEUR * 2;//Doubler l'épaisseur de la forme géométrique
	}
	
}
