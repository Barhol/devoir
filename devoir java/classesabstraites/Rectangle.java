package classesabstraites;

public class Rectangle extends Forme {

	private double largeur;
	private double  longeur;
	public Rectangle(double largeur,double  longeur) {
		this.largeur = largeur;
		this.longeur = longeur;
		
	
	}

	@Override
	public double calculersurface() {
		
		return largeur *longeur ;
	}

	@Override
	public double calculerpérimètre() {
		// TODO Auto-generated method stub
	  return 2 * (largeur + longeur);
	}
	
	public void afficher() {
		System.out.println("la surface est : "+calculersurface());
		System.out.println("la périmètre est : "+calculerpérimètre());
	}
	

}
