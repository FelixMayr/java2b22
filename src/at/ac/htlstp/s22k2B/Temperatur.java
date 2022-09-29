package at.ac.htlstp.s22k2B;

import java.util.Scanner;

/**

 * Entwickle ein Java-Programm, welches vom Benutzer eine Temperatur in °C abfrägt und dann die Temperatur in Kelvin ausgibt.
 *
 * Verwende eine formatierte Ausgabe mit drei Nachkommastellen!
 */

public class Temperatur {
    public static void main(String[] args) {

        double c;
        double k;

        System.out.println("Bitte gib die Temperatur in °C an: ");
        Scanner sc=new Scanner(System.in);
        c=sc.nextDouble();
        k=c+273.15;
        System.out.printf("Die Temperatur beträgt %7.3f Kelvin",k);
        sc.close();


    }
}
