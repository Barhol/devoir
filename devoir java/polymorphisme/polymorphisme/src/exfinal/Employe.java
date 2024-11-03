package exfinal;

public class Employe {
    protected String nom ;
    private int salaire ;

    
  
    		
    
    public Employe(String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom + "\n Salaire : " + salaire);
    }
}

