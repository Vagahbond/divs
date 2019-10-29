package com.company;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Fraction f1 = promptFraction();

        Fraction f2 = promptFraction();

        switch (promptOperation()){
            case 1:
                System.out.println(f1.addFraction(f2));
        }




    }
    private static Fraction promptFraction()
    {

        System.out.println("Denominateur de la fraction : ");
        scanner.hasNextDouble();
        double den = scanner.nextDouble();
        System.out.println("Numerateur de la fraction : ");
        scanner.hasNextDouble();
        double num =  scanner.nextDouble();
        return new Fraction(den, num);
    }

    private static int promptOperation()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel operation ? 1- somme, 2- division, 3- produit. ");
        int choice = scanner.nextInt();
        scanner.close();
        return choice ;
    }



}
