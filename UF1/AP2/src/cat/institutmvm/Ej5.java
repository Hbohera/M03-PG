/*
Nom: Helios
Cognoms: Bohera
INS Manuel Vázquez Montalbán
Data d’edició: 31/11/2022
Nom del cicle formatiu: ASIX
Nom del mòdul: Programació
*/
package cat.institutmvm;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anyo;
        System.out.println( "Introduce un año: " );
        anyo = sc.nextInt();
      if (((anyo % 4 == 0) && (anyo % 100 != 0)) || (anyo % 400 == 0)) {
         System.out.println( "El año " + anyo + " es bisiesto.");
      }
      else {
         System.out.println( "El año " + anyo + " no es bisiesto.");
      }      
   }
}
