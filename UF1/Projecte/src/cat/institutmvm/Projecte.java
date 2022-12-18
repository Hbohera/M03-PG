/*
Nom: Helios
Cognoms: Bohera
INS Manuel Vázquez Montalbán
Data d’edició: 14/12/2022
Nom del cicle formatiu: ASIX
Nom del mòdul: Programació
*/
package cat.institutmvm;
import java.util.Scanner;

public class Projecte {
    private static final String ID = "Introduce el ID del cliente[111-999]: ";
    private static final String EDAT = "Introduce la EDAD del cliente[14-120]: ";
    private static final String TIPUS = "Tipo de venta: \nVenta libre (0)\nPensionista (1)\nCarnet Joven (2)\nSocio (3)\nIntroduce el tipo de venta[0-3]: ";
    private static final String COMPRA = "Introduce el importe de la compra[0-1000]: ";
    private static final String TLF = "Introduce el telefono de contacto del cliente[9 cifras]: ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id= 0, edat= 0, tipus= 0, compra= 0, tlf= 0, err= 3;
        do {
            System.out.print(ID);
            id = sc.nextInt();
            if(err >= 1 && id < 111 || id > 999){
                err --;
                System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
            }
        } while(err >= 1 && id < 111 || id > 999);
        if (err >= 1){
            err = 3;
            do {
                System.out.print(EDAT);
                edat = sc.nextInt();
                if(err >= 1 && edat < 14 || edat > 120){
                    err --;
                    System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
                }
            } while(err >= 1 && edat < 14 || edat > 120);
            if (err != 0){
                err = 3;
                do {
                    System.out.print(TIPUS);
                    tipus = sc.nextInt();
                    if(err >= 1 && tipus < 0 || tipus > 3){
                        err --;
                        System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
                    }
                } while(err >= 1 && tipus < 0 || tipus > 3);
                if (err != 0){
                    err = 3;
                    do {
                        System.out.print(COMPRA);
                        compra = sc.nextInt();
                        if(err >= 1 && compra < 0 || compra > 1000){
                            err --;
                            System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
                        }
                    } while(err >= 1 && compra < 0 || compra > 1000);
                    if (err != 0){
                        err = 3;
                        do {
                            System.out.print(TLF);
                            tlf = sc.nextInt();
                            if(err >= 1 && tlf < 111111111 || tlf > 999999999){
                                err --;
                                System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
                            }
                        } while(err >= 1 && tlf < 111111111 || tlf > 999999999);
                    }
                } 
            }
        }
        if(err == 0) {
            System.out.println("\nPrograma finalizado por errores a la hora de introducir los datos.");
        }
        else {
            System.out.println("\nId\tEdad\t\tTipo\t\tImporte\t\tTelefono");
            System.out.print("\n" + id);
            System.out.print("\t" + edat);
            switch(tipus){
                case 0:
                    System.out.print("\t\tVenta libre");
                    break;
                case 1:
                    System.out.print("\t\tPensionista");
                    break;
                case 2:
                    System.out.print("\t\tCarnet joven");
                    break;
                case 3:
                    System.out.print("\t\tSocio\t");
                    break;
                }
            System.out.print("\t" + compra);
            System.out.print("\t\t" + tlf + "\n\n");
        }
    }
}