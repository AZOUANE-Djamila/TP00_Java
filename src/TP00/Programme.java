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

	/**
	 * Programme principal
	 * @param args
	 * Default String array argument
	 */
	public static void main(String[] args) {
		// Programme principal
		
		Point p = new Point(1,2);
		/**
		 * Afficher le point p
		 */
		p.afficher();
		
		Point pm = new Point(4,5);
		/**
		 * D�placer le point pm
		 */
		p.deplacer(pm);
		/**
		 * Affiche pm
		 */
		pm.afficher();
		
		if(pm.equals(p)) {System.out.println("Les point sont �gaux");}
		else System.out.println("Les points ne sont pos �gaux");
		
		
		double epaisseurFG = Carre.epaisseur;
		
		Point ps = Point.pointSaisi();
		ps.afficher();
		//TODO deplacer & translate
		/**
		 * D�placer et translater un point
		 */
		Point p2= new Point(9,10);
		/**
		 * D�placer le point p2 aux courdpnn�es (5,0)
		 */
		p2.deplacer(5,0);
		/**
		 * Afficher le point et ses coordonn�es
		 */
		p2.afficher();
		/**
		 * Translater un point
		 */
		p2.translater(2, -1);
		/**
		 * Afficher le point et ses coordonn�es apr�s la translation
		 */
		p2.afficher();
		
		
		//Carre
		/**
		 * Cr�er un carr�
		 */
		System.out.println("_________________________________\n\n Cr�er un carr�\n");
		FormeGeometrique cf = new Carre();
		Carre c = new Carre(ps,"Carre1",4);
		

		/**
		 * V�rifier si les deux carr�es cf & c sont �gaux
		 */
		if (c.equals(cf)) System.out.println("Les deux carr�s cf & c sont �gaux");
		else System.out.println("Les deux carr�s cf & c ne sont pas �gaux");
		
		/**
		 * R�cup�rer le nom de la forme g�om�trique
		 */
		System.out.println("Le nom de cette forme g�om�trique est "+ c.getNom());
		System.out.println(c.toString());
		
				/**
				 * Cr�er un rectangle
		 		*/
				System.out.println("_________________________________\n\n Cr�er un rectangle\n");
				Rectangle rect = new Rectangle(ps, "RectangleCr��", 8, 4);
				/**
		 		* Afficher les informations relatives au rectangle
		 		*/
				rect.afficher();
				/**
				 * Cr�er un rectangle
				 */
				System.out.println("_________________________________\n\n Cr�er un rectangle\n");
				Trianglesocele trS = new Trianglesocele(ps, "TriangleSoceleCr��",7, 4);
				/**
				 * Afficher les informations relatives 
				 */
				trS.afficher();

				/**
				 * Cr�er un triangle 
				 */
				TriangleEquilateral tEq = new TriangleEquilateral(ps, "TriangleEquilateraleCr��", 4,8);
				/**
				 * Afficher les informations relatives � un triangle 
				 */
				tEq.afficher();
		
				/**
				 * Cr�er un cercle
				 */
				System.out.println("_________________________________\n\n Cr�er un cercle\n");
				Cercle crcl = new Cercle(ps, "CercleCr��", 7);
				/**
				 * Afficher les informations relatives au cercle
				 */
				crcl.afficher();
				
				/**
				 * Cr�er un cube
				 */
				System.out.println("_________________________________\n\n Cr�er un cube\n");
				Cercle cb = new Cercle(ps, "CubeCr��", 4);
				/**
				 * Afficher les informations relatives au cube
				 */
				cb.afficher();
							
				/**
				 * Cr�er un sph�re
				 */
				System.out.println("_________________________________\n\n Cr�er un sphere\n");
				Cercle sph = new Sphere();
				/**
				 * Modifier la longueur du diam�tere
				 */
				sph.setDiametre(8);//Indiquer la longeur du diametre
				/**
				 * Afficher les informations relatives au sphere
				 */
				sph.afficher();
		
	}
}
