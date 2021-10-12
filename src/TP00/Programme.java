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

//TODO Documentation de toutes les classes d�velopp�es ;
//TODO Le code doit contenir toutes les classes, les attributs et les m�thodes du diagramme ;
//TODO Utilisation des trois (3) principes de l�orient�-objet ;

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
		if(pm.equals(p)) {System.out.println("Les points pm et p sont �gaux");}
		else System.out.println("Les points pm et p ne sont pos �gaux");
		System.out.println("____________________________________________________________________________________________________\n");
		
		double epaisseurFG = Carre.epaisseur;
		System.out.println("Saisir un point ps________________________________\n");
		Point ps = Point.pointSaisi();
		ps.afficher();
		System.out.println("____________________________________________________________________________________________________\n");

		//TODO deplacer & translate
		System.out.println("Cr�er puis afficher les coordonn�es point p2__________________________\n");
		/**
		 * D�placer et translater un point
		 */
		Point p2= new Point(9,10);
		p2.afficher();
		System.out.println("\nD�placer puis afficher les coordonn�es de p2_____________________________\n");
		
		/**
		 * D�placer le point p2 aux courdpnn�es (5,0)
		 */
		p2.deplacer(5,0);
		/**
		 * Afficher le point et ses coordonn�es
		 */
		p2.afficher();
		System.out.println("____________________________________________________________________________________________________\n");
		System.out.println("Translater puis afficher le point p2____________________________\n");
		/**
		 * Translater un point
		 */
		p2.translater(2, -1);
		/**
		 * Afficher le point et ses coordonn�es apr�s la translation
		 */
		p2.afficher();
		System.out.println("____________________________________________________________________________________________________\n");

		//Carre
		/**
		 * Cr�er un carr� 
		 */		
		System.out.println("Cr�er l'objet carr� cf en utilisant la classe FormeG�om�trique_________________________________\n");
		FormeGeometrique cf = new Carre();
		
		System.out.println("Cr�er puis afficher l'objet carr� c______________________________\n");
		Carre c = new Carre(ps,"Carre1",4);
		c.toString();
		System.out.println(c.toString());

		/**
		 * V�rifier si les deux carr�es cf & c sont �gaux
		 */
		if (c.equals(cf)) System.out.println(" \nLes deux carr�s cf & c sont �gaux");
		else System.out.println("\nLes deux carr�s cf & c ne sont pas �gaux");
		
		/**
		 * R�cup�rer le nom de la forme g�om�trique
		 */
		System.out.println("\nLes informations relatives � l'objet c_____________________________");
		System.out.println("Le nom de cette forme g�om�trique est "+ c.getNom());
		System.out.println(c.toString());
		
		System.out.println("____________________________________________________________________________________________________\n");

				/**
				 * Cr�er un rectangle
		 		*/
				Rectangle rect = new Rectangle(ps, "RectangleCr��", 8, 4);
				
				System.out.println("\nLes informations relatives � l'objet rect cr��_____________________________");

				/**
		 		* Afficher les informations relatives au rectangle
		 		*/
				rect.afficher();
				System.out.println("____________________________________________________________________________________________________\n");
				/**
				 * Cr�er un rectangle
				 */
				TriangleIsocele trIs = new TriangleIsocele(ps, "TriangleIsoceleCr��",7, 4);
				System.out.println("\nLes informations relatives � l'objet trIs cr��_____________________________");

				/**
				 * Afficher les informations relatives 
				 */
				trIs.afficher();
				System.out.println("____________________________________________________________________________________________________\n");
				/**
				 * Cr�er un triangle 
				 */
				TriangleEquilateral tEq = new TriangleEquilateral(ps, "TriangleEquilateraleCr��", 4,8);
				
				System.out.println("\nLes informations relatives � l'objet tEq_____________________________");

				/**
				 * Afficher les informations relatives � un triangle 
				 */
				tEq.afficher();
				
				System.out.println("____________________________________________________________________________________________________\n");

				/**
				 * Cr�er un cercle
				 */
				Cercle crcl = new Cercle(ps, "CercleCr��", 7);
				System.out.println("\nLes informations relatives � l'objet crcl Cr��_____________________________");

				/**
				 * Afficher les informations relatives au cercle
				 */
				crcl.afficher();
				
				System.out.println("____________________________________________________________________________________________________\n");

				/**
				 * Cr�er un cube
				 */
				Cercle cb = new Cercle(ps, "CubeCr��", 4);
				System.out.println("\nLes informations relatives � l'objet cb cr��_____________________________");

				/**
				 * Afficher les informations relatives au cube
				 */
				cb.afficher();
						
				System.out.println("____________________________________________________________________________________________________\n");

				/**
				 * Cr�er un sph�re
				 */
				Cercle sph = new Sphere();
				/**
				 * Modifier la longueur du diam�tere
				 */
				sph.setDiametre(8);//Indiquer la longeur du diametre
				System.out.println("\nLes informations relatives � l'objet sph cr��_____________________________");

				/**
				 * Afficher les informations relatives au sphere
				 */
				sph.afficher();
		
	}
}
