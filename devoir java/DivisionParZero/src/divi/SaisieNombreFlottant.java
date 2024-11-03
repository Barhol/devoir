package divi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaisieNombreFlottant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");

        try {
            float nombre = scanner.nextFloat(); // Lecture de l'entrée de type float
            System.out.println("Vous avez entré : " + nombre);
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Vous devez entrer un nombre valide."); // Message d'erreur si saisie incorrecte
        } finally {
            scanner.close(); // Fermeture du scanner
        }
    }
}

