package divi;
//exercice5
public class ApplicationBancaire {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(100); // Initialisation avec un solde de 100

        try {
            compte.verser(-50); // Tentative de dépôt avec un montant négatif
        } catch (MontantNegatifException e) {
            System.out.println(e.getMessage()); // Message d'erreur si montant négatif
        }

        try {
            compte.retirer(-30); // Tentative de retrait avec un montant négatif
        } catch (MontantNegatifException e) {
            System.out.println(e.getMessage()); // Message d'erreur si montant négatif
        }
    }
}

