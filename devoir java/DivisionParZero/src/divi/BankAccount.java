package divi;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Erreur : Le montant à déposer ne peut pas être négatif.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientBalanceException {
        if (amount < 0) {
            throw new NegativeAmountException("Erreur : Le montant à retirer ne peut pas être négatif.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Erreur : Solde insuffisant !");
        }
        balance -= amount;
    }
}
