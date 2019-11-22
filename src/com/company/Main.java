package com.company;

import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Première fraction : ");
        Fraction f1 = promptFraction();

        System.out.println("Seconde fraction ");
        Fraction f2 = promptFraction();

        switch (promptOperation()){
            case 1:
                System.out.println(f1.addFraction(f2).toString());
                break;
            case 2:
                System.out.println(f1.divideFraction(f2).toString());
                break;
            case 3:
                System.out.println(f1.multiplyFraction(f2).toString());
                break;
            default:
                System.out.println("Unexpected situation");
                break;
        }
        scanner.close();
    }
    private static Fraction promptFraction()
    {
        int num =  scanInt("Numerateur de la fraction : ");
        int den = scanInt("Denominateur de la fraction : ");
        return new Fraction(den, num );
    }

    private static int promptOperation()
    {
        int choice = 0;
        while (choice < 1 || choice > 3)
        {
           if((choice = scanInt("Quel operation ? 1- somme, 2- division, 3- produit. ")) < 1 || choice >3)
           {
               System.out.println("Le nombre doit être entre 1 et 3.");
           }
        }
        return choice ;
    }

    private static int scanInt(String message)
    {
        int result = 0;

        System.out.println(message);
        try
        {
            result = Integer.parseInt( scanner.next());
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Veuillez entrer un nombre. ");
            scanInt(message);
        }
        return result;
    }
}
