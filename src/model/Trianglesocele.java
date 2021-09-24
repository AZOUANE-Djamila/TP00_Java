/**
 * 
 */
package model;

/**
 * @author AZOUANE DJAMILA
 * {@summary Un triangle isoc�le est un triangle dont deux c�t� sont �gaux. Le troisi�me c�t� est appel� la base} 
 */

public class Trianglesocele extends Triangle {
	
	private int base;
	
	
	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}


	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	//Constructeur Triangle socele
	public Trianglesocele() {
		super();
		setOrigine(new Point());//setOrigine est h�rit� de la classe mere triangle
		setNom("Triangle socele");//setNom sont h�rit�s de la classe mere triangle
		setBase(base);
	}

	// Constructeur Triangle socele avec ses parametres
	public Trianglesocele(Point origine, String nomTs, int cote, int base) {
		super(origine, nomTs, cote);//Les parametres sont h�rit�s de la classe mere triangle
		setOrigine(origine);
		setNom(nomTs);
		setBase(base);
		
	}

	// Calculer la superficie du Triangle socele
	/**
	 * @return la superficie du triangle socele
	 */
	@Override
	public double superficie() {
		return Math.round(1/2 * getBase() * getCote());//Retourner l'arrondie de la superficie
	}


	@Override
	public String toString() {
		return "La superficie du Trianglesocele est" + superficie();
	}
	
	public void afficher() {
		System.out.println(toString());
	}
	
}
