package classesabstraites;

public class Main {

	public static void main(String[] args) {
		
		
		Forme c1 = new Cercle(3.0);
		
		c1.afficher() ;
		
		Forme r1 = new Rectangle(2.0,4.0);
		r1.afficher();
		
		Forme t1 = new Triangle(4, 5, 3, 3, 3);
		t1.afficher();

	}

}
