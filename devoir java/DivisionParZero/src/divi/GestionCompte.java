package divi;

public class GestionCompte {
    public static void main(String[] args) {
        Compte compte = new Compte(100); // Initialisation avec un solde de 100

        try {
            compte.retirer(150); // Tentative de retrait supérieur au solde
            System.out.println("Retrait réussi. Nouveau solde : " + compte.getSolde());
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage()); // Message d'erreur si solde insuffisant
        }
    }
}

