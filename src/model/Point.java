package model;
import java.util.Scanner;
//import model.NegativeNumberException;
/**
 * 
 */

import java.util.Scanner;

/**
 * Représente un point
 * @author AZOUANE DJAMILA
 *
 */
public class Point  {
	
	private int x;
	private int y;
	/**
	 * @return the x
	 */
	
	//Génération des getters & setters
	
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 * Si le nombre est négatif afficher le message d'erreur "Le nombre n'est pas positif"
	 * Sinon attribuer l'argument origine à this.x = Attribuez la valeur du paramètre "x" à la variable d'instance "x"
	 * 'this' est utilisé pour désambiguïser les références de variables. 
	 */
	public void setX(int x) {
		if (x < 0) 
		      throw new ArithmeticException("Le nombre n'est pas positif"); 
		
		else {
	        	this.x = x;    	
	        	}

		
		}
			
	/**
	 * Récupérer la valeur de l'ordonée y
	 * L'ordonnée
	 * @return y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 * Si y est négatif Afficher le message d'erreur "Le nombre n'est pas positif"
	 * Sinon Attribuer l'argument origine à this.y = Attribuez la valeur du paramètre "y" à la variable d'instance "y"
	 * 'this' est utilisé pour désambiguïser les références de variables. 
	 */
	public void setY(int y) {
		if (y < 0) 
		      throw new ArithmeticException("Le nombre n'est pas positif"); 
		
		else this.y = y;    	
	        	
	}

	/**
	 * Constructeur Point vide
	 */
	public Point() {
	}

	//TODO Exemple d’utilisation du mot « this » avec un attribut et un constructeur ; (mettre une explication en commentaire)
	/**
	 * 
	 * @param x
	 * L'abscisse du point
	 * @param y 
	 * L'ordonné du point
	 * 	Attribuer l'argument x à this.x = Attribuez la valeur du paramètre "x" à la variable d'instance "x"
	 * 'this' est utilisé pour désambiguïser les références de variables. 
	 */
	public Point(int x, int y) {
		/**
		 * Pour accéder aux attributs de la classe mère 
		 */
		this.x = x;
		this.y = y;
	}
	
	//Implémentation des méthodes
	//TODO Redéfinition de la méthode « toString » pour la classe Point
	/**
	 * Redéfinir la méthode toString()
	 */
	@Override
	public String toString() {
		return "[x=" + getX()+", y=" + getY() + "]";
	}
	
	/**
	 * 
	 * @param p
	 * le point à comparer
	 * @return true si les coordonnées du point sont les mémes que les coordonnées données, false sinon
	 */
	public boolean equals(Point p) {
		return ((x == p.getX()) && (y == p.getY()));
	}
	/**
	 * Déplace le point vers les nouvelles coordonnées passés en argument
	 * @param a nouvelle abcisse
	 * 
	 * @param b nouvelle ordonnée
	 */
	public void deplacer(int a, int b) {
		Point p = new Point();
		p.setX(a);
		p.setY(b);
	}
	/**
	 * La méthode pour déplacer un point grace à ses courdonnées
	 * @param p1
	 * p1 le point à déplacer
	 */
	public void deplacer(Point p1) {
		deplacer(p1.x,p1.y);
	}
	/**
	 * Une méthode ^pour déplacer un point de dx en abscisse et de dy en ordonnée.
	 * @param deltaX
	 * L'offset du déplacement
	 * @param deltaY
	 * L'offset du déplacement
	 */
	public void translater(int deltaX, int deltaY) {
		setX(x+deltaX);
		setY(y+deltaY);
	}
	
	/**
	 * 
	 * @return ps les coordonnées saisies
	 */
	public static Point pointSaisi() {
		Scanner scan = new Scanner(System.in);//Create a Scanner Object
		Point ps = new Point(0,0);

		boolean flag = false;
		while(!flag) {
		System.out.print("Entrer l'abscisse du point : ");
		String reponse = scan.nextLine();
		try {

	        int abcisse = Integer.parseInt(reponse);
	        ps.setX(abcisse);
	        flag = true;

	    } catch (NumberFormatException e) {

	        System.err.println(reponse + " n'est pas un nombre.");
	        
	    } 
		}
		flag = false;
		while(!flag) {

	    System.out.print("Entrer l'ordonnée du point : ");
	   
		String reponse = scan.nextLine();
	    try {
	        int ordonnee = Integer.parseInt(reponse);ps.setY(ordonnee);
	        flag = true;
	    } catch (NumberFormatException e) {

	        System.err.println(reponse + " n'est pas un nombre.");
	    }
		}
		return ps;
	}
	
	
	/**
	 * Afficher le point et ses coordonnées
	 */
	public void afficher() {
		System.out.println("Les coordonnées sont: "+ this.toString());
	}
}
