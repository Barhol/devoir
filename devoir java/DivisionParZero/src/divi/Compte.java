package divi;

class Compte {
    private double solde;

    public Compte(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Erreur : Solde insuffisant");
        }
        solde -= montant;
    }

    public void deposer(double montant) {
        solde += montant;
    }
}
