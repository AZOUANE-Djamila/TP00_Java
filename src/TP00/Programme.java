/**
 * 
 */
package TP00;
import java.util.stream.Collectors;

import model.*;

import java.util.Scanner;

/**
 * @author AZOUANE DJAMILA
 *
 */
public class Programme {

	public static void main(String[] args) {
		// Programme principal
		
		Point p = new Point(1,2);
		p.afficher();
		Point pm = new Point(4,5);
		p.deplacer(pm);
		//System.out.println(pm.toString());
		pm.afficher();
		System.out.println(pm.equals(p));
		
		double epaisseurFG = Carre.epaisseur;
		
		Point ps = Point.pointSaisi();
		ps.afficher();
		//TODO deplacer & translate
		Point p2= new Point(9,10);
		p2.deplacer(5,0);
		p2.afficher();
		
		//Carre
		System.out.println("_________________________________\n\n Cr�er un carr�\n");
		FormeGeometrique cf = new Carre();
		Carre c = new Carre(ps,"Carre1",4);
		
		//V�rifier si les deux carr�es cf & c sont �gaux
		if (c.equals(cf)) System.out.println("Les deux carr�s cf & c sont �gaux");
		else System.out.println("Les deux carr�s cf & c ne sont pas �gaux");
		System.out.println("Le nom de cette forme g�om�trique est "+ c.getNom());
		System.out.println(c.toString());
		
		//Rectangle
		System.out.println("_________________________________\n\n Cr�er un rectangle\n");
		Rectangle rect = new Rectangle(ps, "RectangleCr��", 8, 4);
		rect.afficher();
		//Triangle Socele
				System.out.println("_________________________________\n\n Cr�er un rectangle\n");
				Trianglesocele trS = new Trianglesocele(ps, "TriangleSoceleCr��",7, 4);
				trS.afficher();
		//Triangle equilaterale
				TriangleEquilateral tEq = new TriangleEquilateral(ps, "TriangleEquilateraleCr��", 4,8);
				tEq.afficher();
		
		//Cercle
				System.out.println("_________________________________\n\n Cr�er un cercle\n");
				Cercle crcl = new Cercle(ps, "CercleCr��", 7);
				crcl.afficher();
				
		//Cube
				System.out.println("_________________________________\n\n Cr�er un cube\n");
				Cercle cb = new Cercle(ps, "CubeCr��", 4);
				cb.afficher();
							
		//Sphere
				System.out.println("_________________________________\n\n Cr�er un sphere\n");
				Cercle sph = new Sphere();
				sph.setDiametre(8);//Indiquer la longeur du diametre
				sph.afficher();
		
	}
}
