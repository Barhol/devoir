package divi;
//exercice6
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountManager {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100); // Initialisation avec un solde de 100
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Entrez un montant à retirer : ");
            try {
                double amount = scanner.nextDouble(); // Lecture de l'entrée utilisateur

                // Essai de retirer le montant
                account.withdraw(amount);
                System.out.println("Retrait réussi. Nouveau solde : " + account.getBalance());
                break; // Sortie de la boucle si le retrait est réussi
            } catch (NegativeAmountException e) {
                System.out.println(e.getMessage()); // Message d'erreur pour montant négatif
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage()); // Message d'erreur pour solde insuffisant
            } catch (InputMismatchException e) {
                System.out.println("Erreur : Vous devez entrer un nombre valide."); // Message d'erreur pour saisie incorrecte
                scanner.next(); // Consommer l'entrée incorrecte pour éviter une boucle infinie
            }
        }

        scanner.close(); // Fermeture du scanner
    }
}

