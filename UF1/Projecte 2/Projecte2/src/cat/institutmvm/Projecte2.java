/*
Nom: Helios
Cognoms: Bohera
INS Manuel Vázquez Montalbán
Data d’edició: 18/12/2022
Nom del cicle formatiu: ASIX
Nom del mòdul: Programació
*/
package cat.institutmvm;
import java.util.Scanner;

public class Projecte2 {
    private static final String ID = "Introduce el ID del cliente[111-999]: ";
    private static final String EDAT = "Introduce la EDAD del cliente[14-120]: ";
    private static final String TIPUS = "Tipo de venta: \nVenta libre (0)\nPensionista (1)\nCarnet Joven (2)\nSocio (3)\nIntroduce el tipo de venta[0-3]: ";
    private static final String COMPRA = "Introduce el importe de la compra[0-1000]: ";
    private static final String TLF = "Introduce el telefono de contacto del cliente[9 cifras]: ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int err, clients, i, aux, suma= 0, sum_vent= 0, sum_pens= 0, sum_carnet= 0, sum_soci= 0;
        System.out.print("Cuantos clientes quieres introducir?: ");
        clients = sc.nextInt();
        int [] id = new int[clients];
        int [] edat = new int[clients];
        int [] tipus = new int[clients];
        int [] compra = new int[clients];
        int [] tlf = new int[clients];
        for(i=0; i < clients; i++){
            err = 3;
            System.out.println("\nCliente " + (i+1) + "=");
            do {
                System.out.print(ID);
                id[i] = sc.nextInt();
                if(err > 0 && id[i] < 111 || id[i] > 999){
                    err --;
                    System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
                }
            } while(err > 0 && id[i] < 111 || id[i] > 999);
            if (err > 0){
                err = 3;
                do {
                    System.out.print(EDAT);
                    edat[i] = sc.nextInt();
                    if(err > 0 && edat[i] < 14 || edat[i] > 120){
                        err --;
                        System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
                    }
                } while(err > 0 && edat[i] < 14 || edat[i] > 120);
                if (err > 0){
                    err = 3;
                    do {
                        System.out.print(TIPUS);
                        tipus[i] = sc.nextInt();
                        if(err > 0 && (tipus[i] < 0 || tipus[i] > 3)){
                            err --;
                            System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
                        }
                    } while(err > 0 && (tipus[i] < 0 || tipus[i] > 3));
                    if (err > 0){
                        err = 3;
                        do {
                            System.out.print(COMPRA);
                            compra[i] = sc.nextInt();
                            if(err > 0 && (compra[i] < 0 || compra[i] > 1000)){
                                err --;
                                System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
                            }
                        } while(err > 0 && (compra[i] < 0 || compra[i] > 1000));
                        if (err > 0){
                            err = 3;
                            do {
                                System.out.print(TLF);
                                tlf[i] = sc.nextInt();
                                if(err > 0 && tlf[i] < 111111111 || tlf[i] > 999999999){
                                    err --;
                                    System.out.println("Error al introducir los datos, te quedan " + err + " intentos!\n");
                                }
                            } while(err > 0 && tlf[i] < 111111111 || tlf[i] > 999999999);
                        }
                    } 
                }
            }
            if(err == 0) {
                System.out.println("Cliente no añadido, vuelve a introducir los datos correctamente.");
                i--;
            }
        }
        System.out.println("\nId\tEdad\t\tTipo\t\tImporte\t\tTelefono");
        for(i=0; i < clients; i++){
            System.out.print("\n" + id[i]);
            System.out.print("\t" + edat[i]);
            switch(tipus[i]){
                case 0:
                    System.out.print("\t\tVenta libre");
                    sum_vent = sum_vent + 1;
                    break;
                case 1:
                    System.out.print("\t\tPensionista");
                    sum_pens = sum_pens + 1;
                    break;
                case 2:
                    System.out.print("\t\tCarnet joven");
                    sum_carnet = sum_carnet + 1;
                    break;
                case 3:
                    System.out.print("\t\tSocio\t");
                    sum_soci = sum_soci + 1;
                    break;
            }
            System.out.print("\t" + compra[i]);
            System.out.print("\t\t" + tlf[i]);
        }
        System.out.println("\n\nSe han introducido " + clients + " registros de clientes.");
        System.out.print("\nQuieres consultar por tipo de cliente?(si: 1/ no: 0): ");
        aux = sc.nextInt();
        if (aux == 1){
            System.out.print("\nQue tipo de cliente?(Venta libre: 0/ Pensionista: 1/ Carnet Joven: 2/ Socio: 3): ");
            aux = sc.nextInt();
            System.out.println("\nId\tEdad\t\tTipo\t\tImporte\t\tTelefono");
            for(i=0; i < clients; i++){
                if(aux == tipus[i]){
                    System.out.print("\n" + id[i]);
                    System.out.print("\t" + edat[i]);
                    switch(tipus[i]){
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
                    System.out.print("\t" + compra[i]);
                    System.out.print("\t\t" + tlf[i]);
                }
            }
        }
        System.out.print("\n\nQuieres ver un resumen estadístico de los datos?(si: 1/ no: 0): ");
        aux = sc.nextInt();
        if (aux == 1){
            System.out.print("\nNúmero de clientes introducidos: " + clients);
            for(i=0; i < clients; i++){
                suma = suma + edat[i];
            }
            System.out.print("\nMedia de edad: " + (suma/clients) + " años");
            System.out.print("\nNúmero de clientes por tipos: ");
            if(sum_vent != 0){
                System.out.print("\n\tVenta libre: " + sum_vent);
            }
            if(sum_pens != 0){
                System.out.print("\n\tPensionista: " + sum_pens);
            }
            if(sum_carnet != 0){
                System.out.print("\n\tCarnet joven: " + sum_carnet);
            }
            if(sum_soci != 0){
                System.out.print("\n\tSocio: " + sum_soci);
            }
            System.out.println("\nHistograma de número de clientes por tipo: ");
            System.out.println("-----------------------------");
            if(sum_vent != 0){
                System.out.print("Venta libre: " );
                for(i=0; i < sum_vent; i++){
                     System.out.println("*");
                }
            }
            if(sum_pens != 0){
                System.out.print("Pensionista: ");
                for(i=0; i < sum_pens; i++){
                     System.out.println("*");
                }
            }
            if(sum_carnet != 0){
                System.out.print("Carnet joven: ");
                for(i=0; i < sum_carnet; i++){
                     System.out.println("*");
                }
            }
            if(sum_soci != 0){
                System.out.print("Socio: ");
                for(i=0; i < sum_soci; i++){
                     System.out.print("*");
                }
            }
            suma= 0;
            for(i=0; i < clients; i++){
                suma = suma + compra[i];
            }
            System.out.println("\nImporte total acumulado: " + suma + " €");
        }
    }
}