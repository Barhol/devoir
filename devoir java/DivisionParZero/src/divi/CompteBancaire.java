package divi;

class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public void verser(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Erreur : Le montant à déposer ne peut pas être négatif.");
        }
        solde += montant;
    }

    public void retirer(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Erreur : Le montant à retirer ne peut pas être négatif.");
        }
        if (montant > solde) {
            throw new MontantNegatifException("Erreur : Solde insuffisant pour le retrait.");
        }
        solde -= montant;
    }
}

