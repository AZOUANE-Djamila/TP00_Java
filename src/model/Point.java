package model;
import java.util.Scanner;
//import model.NegativeNumberException;
/**
 * 
 */

import java.util.Scanner;

/**
 * Repr�sente un point
 * @author AZOUANE DJAMILA
 *
 */
public class Point  {
	
	private int x;
	private int y;
	/**
	 * @return the x
	 */
	
	//G�n�ration des getters & setters
	
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 * Si le nombre est n�gatif afficher le message d'erreur "Le nombre n'est pas positif"
	 * Sinon attribuer l'argument origine � this.x = Attribuez la valeur du param�tre "x" � la variable d'instance "x"
	 * 'this' est utilis� pour d�sambigu�ser les r�f�rences de variables. 
	 */
	public void setX(int x) {
		if (x < 0) 
		      throw new ArithmeticException("Le nombre n'est pas positif"); 
		
		else {
	        	this.x = x;    	
	        	}

		
		}
			
	/**
	 * R�cup�rer la valeur de l'ordon�e y
	 * L'ordonn�e
	 * @return y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 * Si y est n�gatif Afficher le message d'erreur "Le nombre n'est pas positif"
	 * Sinon Attribuer l'argument origine � this.y = Attribuez la valeur du param�tre "y" � la variable d'instance "y"
	 * 'this' est utilis� pour d�sambigu�ser les r�f�rences de variables. 
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

	//TODO Exemple d�utilisation du mot � this � avec un attribut et un constructeur ; (mettre une explication en commentaire)
	/**
	 * 
	 * @param x
	 * L'abscisse du point
	 * @param y 
	 * L'ordonn� du point
	 * 	Attribuer l'argument x � this.x = Attribuez la valeur du param�tre "x" � la variable d'instance "x"
	 * 'this' est utilis� pour d�sambigu�ser les r�f�rences de variables. 
	 */
	public Point(int x, int y) {
		/**
		 * Pour acc�der aux attributs de la classe m�re 
		 */
		this.x = x;
		this.y = y;
	}
	
	//Impl�mentation des m�thodes
	//TODO Red�finition de la m�thode � toString � pour la classe Point
	/**
	 * Red�finir la m�thode toString()
	 */
	@Override
	public String toString() {
		return "[x=" + getX()+", y=" + getY() + "]";
	}
	
	/**
	 * 
	 * @param p
	 * le point � comparer
	 * @return true si les coordonn�es du point sont les m�mes que les coordonn�es donn�es, false sinon
	 */
	public boolean equals(Point p) {
		return ((x == p.getX()) && (y == p.getY()));
	}
	/**
	 * D�place le point vers les nouvelles coordonn�es pass�s en argument
	 * @param a nouvelle abcisse
	 * 
	 * @param b nouvelle ordonn�e
	 */
	public void deplacer(int a, int b) {
		Point p = new Point();
		p.setX(a);
		p.setY(b);
	}
	/**
	 * La m�thode pour d�placer un point grace � ses courdonn�es
	 * @param p1
	 * p1 le point � d�placer
	 */
	public void deplacer(Point p1) {
		deplacer(p1.x,p1.y);
	}
	/**
	 * Une m�thode ^pour d�placer un point de dx en abscisse et de dy en ordonn�e.
	 * @param deltaX
	 * L'offset du d�placement
	 * @param deltaY
	 * L'offset du d�placement
	 */
	public void translater(int deltaX, int deltaY) {
		setX(x+deltaX);
		setY(y+deltaY);
	}
	
	/**
	 * 
	 * @return ps les coordonn�es saisies
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

	    System.out.print("Entrer l'ordonn�e du point : ");
	   
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
	 * Afficher le point et ses coordonn�es
	 */
	public void afficher() {
		System.out.println("Les coordonn�es sont: "+ this.toString());
	}
}
