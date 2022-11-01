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

public class Ej4 {
    private static final String MSG1 = "Introduce un numero por teclado entre 1 y 12: ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("a) " + MSG1);
        num = sc.nextInt();
        if (num == 1){
            System.out.println("El mes correspondiente al numero es: Enero");
        }
        else if(num == 2){
            System.out.println("El mes correspondiente al numero es: Febrero");
        }
        else if(num == 3){
            System.out.println("El mes correspondiente al numero es: Marzo");
        }
        else if(num == 4){
            System.out.println("El mes correspondiente al numero es: Abril");
        }
        else if(num == 5){
            System.out.println("El mes correspondiente al numero es: Mayo");
        }
        else if(num == 6){
            System.out.println("El mes correspondiente al numero es: Junio");
        }
        else if(num == 7){
            System.out.println("El mes correspondiente al numero es: Julio");
        }
        else if(num == 8){
            System.out.println("El mes correspondiente al numero es: Agosto");
        }
        else if(num == 9){
            System.out.println("El mes correspondiente al numero es: Septiembre");
        }
        else if(num == 10){
            System.out.println("El mes correspondiente al numero es: Octubre");
        }
        else if(num == 11){
            System.out.println("El mes correspondiente al numero es: Noviembre");
        }
        else if(num == 12){
            System.out.println("El mes correspondiente al numero es: Diciembre");
        }
        else {
            System.out.println("Error: Has de introducir un numero entre 1 y 12!");
        }
        System.out.println("\nESTRUCTURA SWITCH");
        System.out.println("b) " + MSG1);
        num = sc.nextInt();
        switch(num) {
            case 1:
                System.out.println("El mes correspondiente al numero es: Enero");
                break;
            case 2:
                System.out.println("El mes correspondiente al numero es: Febrero");
                break;
            case 3:
                System.out.println("El mes correspondiente al numero es: Marzo");
                break;
            case 4:
                System.out.println("El mes correspondiente al numero es: Abril");
                break;
            case 5:
                System.out.println("El mes correspondiente al numero es: Mayo");
                break;
            case 6:
                System.out.println("El mes correspondiente al numero es: Junio");
                break;
            case 7:
                System.out.println("El mes correspondiente al numero es: Julio");
                break;
            case 8:
                System.out.println("El mes correspondiente al numero es: Agosto");
                break;
            case 9:
                System.out.println("El mes correspondiente al numero es: Septiembre");
                break;
            case 10:
                System.out.println("El mes correspondiente al numero es: Octubre");
                break;
            case 11:
                System.out.println("El mes correspondiente al numero es: Noviembre");
                break;
            case 12:
                System.out.println("El mes correspondiente al numero es: Diciembre");
                break;  
            default:
                System.out.println("Error: Has de introducir un numero entre 1 y 12!");
                break;
        }
    }
}
