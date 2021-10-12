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
		System.out.println("_________________________________\n\n Créer un carré\n");
		FormeGeometrique cf = new Carre();
		Carre c = new Carre(ps,"Carre1",4);
		
		//Vérifier si les deux carrées cf & c sont égaux
		if (c.equals(cf)) System.out.println("Les deux carrés cf & c sont égaux");
		else System.out.println("Les deux carrés cf & c ne sont pas égaux");
		System.out.println("Le nom de cette forme géométrique est "+ c.getNom());
		System.out.println(c.toString());
		
		//Rectangle
		System.out.println("_________________________________\n\n Créer un rectangle\n");
		Rectangle rect = new Rectangle(ps, "RectangleCréé", 8, 4);
		rect.afficher();
		//Triangle Socele
				System.out.println("_________________________________\n\n Créer un rectangle\n");
				Trianglesocele trS = new Trianglesocele(ps, "TriangleSoceleCréé",7, 4);
				trS.afficher();
		//Triangle equilaterale
				TriangleEquilateral tEq = new TriangleEquilateral(ps, "TriangleEquilateraleCréé", 4,8);
				tEq.afficher();
		
		//Cercle
				System.out.println("_________________________________\n\n Créer un cercle\n");
				Cercle crcl = new Cercle(ps, "CercleCréé", 7);
				crcl.afficher();
				
		//Cube
				System.out.println("_________________________________\n\n Créer un cube\n");
				Cercle cb = new Cercle(ps, "CubeCréé", 4);
				cb.afficher();
							
		//Sphere
				System.out.println("_________________________________\n\n Créer un sphere\n");
				Cercle sph = new Sphere();
				sph.setDiametre(8);//Indiquer la longeur du diametre
				sph.afficher();
		
	}
}
