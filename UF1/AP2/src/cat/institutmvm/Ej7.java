/*
Nom: Helios
Cognoms: Bohera
INS Manuel Vázquez Montalbán
Data d’edició: 31/11/2022
Nom del cicle formatiu: ASIX
Nom del mòdul: Programació
*/
package cat.institutmvm;

public class Ej7 {
    public static void main(String[] args) {
        int num= 0;
        System.out.print("a) ");
        do {
            System.out.print(num + " ");
            num = num + 1;
        } while(num + 1 <= 10);
        System.out.print("\n\nb) ");
        num = 0;
        do {
            System.out.print(num + " ");
            num = num + 1;
        } while(num + 1 <= 100);
        System.out.print("\n\nc) ");
        num = 0;
        do {
            if ((num % 2) == 0) {
                System.out.print(num + " ");
            }
            num = num + 1;
        } while(num + 1 <= 100);
        System.out.print("\n\nd) ");
        num = 99;
        do {
            System.out.print(num + " ");
            num = num - 1;
        } while(num - 1 >= -1);
    }
}
