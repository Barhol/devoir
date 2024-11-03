package classesabstraites;

public class Triangle extends Forme  {
	
    private double base; 
    private double hauteur; 
    private double coteA; 
    private double coteB; 
    private double coteC;
	
    
    public Triangle(double base, double hauteur, double coteA, double coteB, double coteC) {
        this.base = base;
        this.hauteur = hauteur;
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;
    }

	@Override
	public double calculersurface() {
		  return 0.5 * base * hauteur; 
	}

	@Override
	public double calculerpérimètre() {
		// TODO Auto-generated method stub
		 return coteA + coteB + coteC; 
	}
	
	public void afficher() {
		System.out.println("la surface est : "+calculersurface());
		System.out.println("la périmètre est : "+calculerpérimètre());
	}

}
