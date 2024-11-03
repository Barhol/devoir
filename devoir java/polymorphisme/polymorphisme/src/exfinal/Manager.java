package exfinal;

public class Manager extends Employe {
    private int nombreDeSubordonnes;

    public Manager(String nom, int salaire, int nombreDeSubordonnes) {
        super(nom, salaire);
        this.nombreDeSubordonnes = nombreDeSubordonnes;
    }

   
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nombre de subordonn�s : " + nombreDeSubordonnes);
    }

    public void gererEquipe() {
        System.out.println(nom + " g�re une �quipe de " + nombreDeSubordonnes + " personnes.");
    }
}

