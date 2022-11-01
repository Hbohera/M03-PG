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

public class Ej8 {
    private static final String MSG1 = "Introduce un numero natural por teclado: ";
    private static final String MSG2 = "Cuantos numeros quieres introducir: ";
    private static final String MSG3 = "Gracias por utilizar el programa!";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cant, count= 0;
        System.out.println("a) ");
        do {
            System.out.println(MSG1);
            num = sc.nextInt();
        } while(num != 0);
        System.out.println("\nb) " + MSG2);
        cant = sc.nextInt();
        do {
            System.out.println(MSG1);
            num = sc.nextInt();
            count = count + 1;
        } while(count != cant);
        System.out.println(MSG3);
    }
}
