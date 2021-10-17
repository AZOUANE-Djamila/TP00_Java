/**
 * 
 */
package TP00;

import model.*;

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
		if(pm.equals(p)) {System.out.println("Les points pm et p sont égaux");}
		else System.out.println("Les points pm et p ne sont pos égaux");
		System.out.println("____________________________________________________________________________________________________\n");
		
		System.out.println("Saisir un point ps________________________________\n");
		Point ps = Point.pointSaisi();
		ps.afficher();
		System.out.println("____________________________________________________________________________________________________\n");

		// deplacer & translate
		System.out.println("Créer puis afficher les coordonnées point p2__________________________\n");
		
		/**
		 * Déplacer et translater un point
		 */
		Point p2= new Point(9,10);
		System.out.println("p2 avant le déplacement: "+p2);
		
		System.out.println("\nDéplacer puis afficher les coordonnées de p2_____________________________\n");
		
		/**
		 * Déplacer le point p2 aux courdpnnées (5,0)
		 */
		p2.deplacer(5,4);
		/**
		 * Afficher le point et ses coordonnées
		 */
		p2.afficher();
		System.out.println("____________________________________________________________________________________________________\n");
		System.out.println("Translater puis afficher le point p2____________________________\n");
		/**
		 * Translater un point
		 */
		p2.translater(2, -1);
		/**
		 * Afficher le point et ses coordonnées aprés la translation
		 */
		p2.afficher();
		System.out.println("____________________________________________________________________________________________________\n");

		//Carre
		/**
		 * Créer un carré 
		 */		
		System.out.println("Créer l'objet carré cf en utilisant la classe FormeGéométrique_________________________________\n");
		FormeGeometrique cf = new Carre(p2,6);
		System.out.println("cf = "+cf);
		
		System.out.println("Créer puis afficher l'objet carré c______________________________\n");
		Carre c = new Carre(ps,4);
		System.out.println("c = "+c.toString());

		/**
		 * Vérifier si les deux carrées cf & c sont égaux
		 */
		if (c.equals(cf)) System.out.println(" \nLes deux carrés cf & c sont égaux");
		else System.out.println("\nLes deux carrés cf & c ne sont pas égaux");
		
		Carre carre= new Carre(pm,3);
		double epaisseurFG = Carre.EPAISSEUR;
		System.out.println("L'épaisseur du carré est: "+epaisseurFG);
		double doubleEpaisseurFG = Carre.doubleEpaisseur(carre);
		System.out.println("L'épaisseur du carré est: "+doubleEpaisseurFG);
		
		/**
		 * Récupérer le nom de la forme géométrique
		 */
		System.out.println("\nLes informations relatives à l'objet c_____________________________");
		System.out.println("Le nom de cette forme géométrique est "+ c.getNom());
		System.out.println(c.toString());
		
		System.out.println("____________________________________________________________________________________________________\n");

				/**
				 * Créer un rectangle
		 		*/
				Rectangle rect = new Rectangle(ps, 8, 4);
				
				System.out.println("\nLes informations relatives à l'objet rect créé_____________________________");

				/**
		 		* Afficher les informations relatives au rectangle
		 		*/
				rect.afficher();
				System.out.println("____________________________________________________________________________________________________\n");
				/**
				 * Créer un rectangle
				 */
				TriangleIsocele trIs = new TriangleIsocele(ps,7, 4);
				System.out.println("\nLes informations relatives à l'objet trIs créé_____________________________");

				/**
				 * Afficher les informations relatives 
				 */
				trIs.afficher();
				System.out.println("____________________________________________________________________________________________________\n");
				/**
				 * Créer un triangle 
				 */
				TriangleEquilateral tEq = new TriangleEquilateral(p,8);
				
				System.out.println("\nLes informations relatives à l'objet tEq_____________________________");

				/**
				 * Afficher les informations relatives à un triangle 
				 */
				tEq.afficher();
				
				System.out.println("____________________________________________________________________________________________________\n");

				/**
				 * Créer un cercle
				 */
				Cercle crcl = new Cercle(ps, 7);
				System.out.println("\nLes informations relatives à l'objet crcl Créé_____________________________");

				/**
				 * Afficher les informations relatives au cercle
				 */
				crcl.afficher();
				
				System.out.println("____________________________________________________________________________________________________\n");

				/**
				 * Créer un cube
				 */
				Cercle cb = new Cercle(ps, 4);
				System.out.println("\nLes informations relatives à l'objet cb créé_____________________________");

				/**
				 * Afficher les informations relatives au cube
				 */
				cb.afficher();
						
				System.out.println("____________________________________________________________________________________________________\n");

				/**
				 * Créer un sphére
				 */
				Cercle sph = new Sphere();
				/**
				 * Modifier la longueur du diamétere
				 */
				sph.setDiametre(8);//Indiquer la longeur du diametre
				System.out.println("\nLes informations relatives à l'objet sph créé_____________________________");

				/**
				 * Afficher les informations relatives au sphere
				 */
				sph.afficher();
		
	}
}
