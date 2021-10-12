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
		 * Déplacer le point pm
		 */
		p.deplacer(pm);
		/**
		 * Affiche pm
		 */
		pm.afficher();
		
		if(pm.equals(p)) {System.out.println("Les point sont égaux");}
		else System.out.println("Les points ne sont pos égaux");
		
		
		double epaisseurFG = Carre.epaisseur;
		
		Point ps = Point.pointSaisi();
		ps.afficher();
		//TODO deplacer & translate
		/**
		 * Déplacer et translater un point
		 */
		Point p2= new Point(9,10);
		/**
		 * Déplacer le point p2 aux courdpnnées (5,0)
		 */
		p2.deplacer(5,0);
		/**
		 * Afficher le point et ses coordonnées
		 */
		p2.afficher();
		/**
		 * Translater un point
		 */
		p2.translater(2, -1);
		/**
		 * Afficher le point et ses coordonnées aprés la translation
		 */
		p2.afficher();
		
		
		//Carre
		/**
		 * Créer un carré
		 */
		System.out.println("_________________________________\n\n Créer un carré\n");
		FormeGeometrique cf = new Carre();
		Carre c = new Carre(ps,"Carre1",4);
		

		/**
		 * Vérifier si les deux carrées cf & c sont égaux
		 */
		if (c.equals(cf)) System.out.println("Les deux carrés cf & c sont égaux");
		else System.out.println("Les deux carrés cf & c ne sont pas égaux");
		
		/**
		 * Récupérer le nom de la forme géométrique
		 */
		System.out.println("Le nom de cette forme géométrique est "+ c.getNom());
		System.out.println(c.toString());
		
				/**
				 * Créer un rectangle
		 		*/
				System.out.println("_________________________________\n\n Créer un rectangle\n");
				Rectangle rect = new Rectangle(ps, "RectangleCréé", 8, 4);
				/**
		 		* Afficher les informations relatives au rectangle
		 		*/
				rect.afficher();
				/**
				 * Créer un rectangle
				 */
				System.out.println("_________________________________\n\n Créer un rectangle\n");
				Trianglesocele trS = new Trianglesocele(ps, "TriangleSoceleCréé",7, 4);
				/**
				 * Afficher les informations relatives 
				 */
				trS.afficher();

				/**
				 * Créer un triangle 
				 */
				TriangleEquilateral tEq = new TriangleEquilateral(ps, "TriangleEquilateraleCréé", 4,8);
				/**
				 * Afficher les informations relatives à un triangle 
				 */
				tEq.afficher();
		
				/**
				 * Créer un cercle
				 */
				System.out.println("_________________________________\n\n Créer un cercle\n");
				Cercle crcl = new Cercle(ps, "CercleCréé", 7);
				/**
				 * Afficher les informations relatives au cercle
				 */
				crcl.afficher();
				
				/**
				 * Créer un cube
				 */
				System.out.println("_________________________________\n\n Créer un cube\n");
				Cercle cb = new Cercle(ps, "CubeCréé", 4);
				/**
				 * Afficher les informations relatives au cube
				 */
				cb.afficher();
							
				/**
				 * Créer un sphére
				 */
				System.out.println("_________________________________\n\n Créer un sphere\n");
				Cercle sph = new Sphere();
				/**
				 * Modifier la longueur du diamétere
				 */
				sph.setDiametre(8);//Indiquer la longeur du diametre
				/**
				 * Afficher les informations relatives au sphere
				 */
				sph.afficher();
		
	}
}
