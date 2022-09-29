package at.ac.htlstp.s22k2B;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 *
 * Lies vom Benutzer einen Winkel in Grad ein und gib den Winkel in Radiant aus.
 *
 * Verwende eine formatierte Ausgabe mit vier Nachkommastellen!
 */
public class Letto {


    public static void main(String[] args){
        System.out.println("Bitte geben Sie den Winkel in ° an!");
        Scanner sc=new Scanner(System.in);
     double c= (double) sc.nextDouble();
     double k = c+180/3.41;
        System.out.printf("",k);
        sc.close();
