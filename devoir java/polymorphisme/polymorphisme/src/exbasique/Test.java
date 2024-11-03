package exbasique;

public class Test {
    public static void main(String[] args) {
        Vehicule v1 = new Voiture();
        Vehicule v2 = new Velo();

        v1.seDeplacer(); 
        v2.seDeplacer(); 
    }
}

