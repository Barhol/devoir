package classesabstraites;

public class Cercle extends Forme {
	private  double rayon ;
	

	public Cercle(double rayon) {
		this.rayon = rayon;
		
	}

	@Override
	public double calculersurface() {
		return Math.PI * Math.pow(rayon, 2);
	}

	@Override
	public double calculerpérimètre() {
		 return 2 * Math.PI * rayon; 
	}

	
	public void afficher() {
		System.out.println("la surface est : "+calculersurface());
		System.out.println("la périmètre est : "+calculerpérimètre());
	}
	
}
