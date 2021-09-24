package model;
import java.util.Scanner;
//import model.NegativeNumberException;
/**
 * 
 */

import java.util.Scanner;

/**
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
	 */
	public void setX(int x) {
		if (x < 0) 
		      throw new ArithmeticException("Le nombre n'est pas positif"); 
		
		else {
	        	this.x = x;    	
	        	}

		
		}
			
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		if (y < 0) 
		      throw new ArithmeticException("Le nombre n'est pas positif"); 
		
		else this.y = y;    	
	        	
	}
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//Implémentation des méthodes
	
	@Override
	public String toString() {
		return "(x=" + x + ", y=" + y + ")";
	}
	public boolean equals(Point p) {
		return ((x == p.getX()) && (y == p.getY()));
	}
	/*
	 * Déplace le point vers les nouvelles coordonnées passés en argument
	 * @param a nouvelle abcisse
	 * @param b nouvelle ordonné
	 */
	public void deplacer(int a, int b) {
		Point p = new Point();
		p.setX(a);
		p.setY(b);
	}
	public void deplacer(Point p1) {
		deplacer(p1.x,p1.y);
	}
	/**
	   * Déplace un point de dx en abscisse et de dy en ordonnée.
	   */
	public void translater(int deltaX, int deltaY) {
		setX(x+deltaX);
		setY(y+deltaY);
	}
	
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
	
	public void afficher() {
		System.out.println("Point = "+ this.toString());
	}
}
