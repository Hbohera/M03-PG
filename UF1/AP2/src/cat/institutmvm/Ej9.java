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

public class Ej9 {
    private static final String MSG1 = "Introduce un numero natural por teclado (Escribe '0' para terminar): ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count= 0, sum= 0 ;
        do {
            System.out.println(MSG1);
            num = sc.nextInt();
            count = count + 1;
            sum = sum + num;
        } while(num != 0);
        System.out.println(sum / count);
    }    
}
