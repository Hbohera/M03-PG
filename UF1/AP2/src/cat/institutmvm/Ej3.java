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

public class Ej3 {
    private static final String MSG1 = "Introduce un numero por teclado: ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2, num3;
        System.out.println("a) " + MSG1);
        num = sc.nextInt();
        if (num < 0){
            System.out.println("El numero introducido es negativo.");
        }
        else {
            System.out.println("El numero introducido es positivo.");
        }
        System.out.println("\nb) " + MSG1);
        num = sc.nextInt();
        if (num > 35){
            System.out.println("El numero introducido es mayor que 35.");
        }
        else {
            System.out.println("El numero introducido es menor que 35.");
        }
        System.out.println("\nc) " + MSG1);
        num = sc.nextInt();
        if (num > 0 && num < 100){
            System.out.println("El numero introducido es menor que 100 y positivo.");
        }
        else if(num < 0 && num < 100){
            System.out.println("El numero introducido es menor que 100 y negativo.");
        }
        else {
            System.out.println("El numero introducido es mayor que 100.");
        }
        System.out.println("\nd) " + MSG1);
        num = sc.nextInt();
        if (num >= -3 && num <= 27){
            System.out.println("El numero introducido esta dentro del rango (-3 a 27).");
        }
        else {
            System.out.println("El numero introducido NO esta dentro del rango (-3 a 27).");
        }
        System.out.println("\ne) " + MSG1);
        num = sc.nextInt();
        if (num <= 25 || num >= 50){
            System.out.println("El numero introducido NO esta dentro del rango (25 a 50).");
        }
        else {
            System.out.println("El numero introducido esta dentro del rango (25 a 50).");
        }
        System.out.println("\nf) " + MSG1);
        num = sc.nextInt();
        System.out.println(MSG1);
        num2 = sc.nextInt();
        if ((num % num2) < 15){
            System.out.println("El modulo de los dos numeros es menor que 15.");
        }
        else {
            System.out.println("El modulo de los dos numeros es mayor que 15.");
        }
        System.out.println("\ng) " + MSG1);
        num = sc.nextInt();
        if ((num % 2) == 0){
            System.out.println("El numero introducido es par.");
        }
        else {
            System.out.println("El numero introducido es impar.");
        }
        System.out.println("\nh) " + MSG1);
        num = sc.nextInt();
        if ((num % 2) == 0){
            System.out.println("El numero introducido es par y su resultado es: .");
            num = num * 2;
            System.out.println(num);
        }
        else {
            System.out.println("El numero introducido es impar y su resultado es: .");
            num = num * 3;
            System.out.println(num);
        }   
        System.out.println("\ni) " + MSG1);
        num = sc.nextInt();
        System.out.println(MSG1);
        num2 = sc.nextInt();
        if (num > num2){
            System.out.println(num + " es el numero mas grande.");
        }
        else {
            System.out.println(num2 + " es el numero mas grande.");
        }  
        System.out.println("\nj) " + MSG1);
        num = sc.nextInt();
        System.out.println(MSG1);
        num2 = sc.nextInt();
        System.out.println(MSG1);
        num3 = sc.nextInt();
        if (num > num2){
            if (num > num3){
                System.out.println("El mayor es: " + num);                                             
            } 
            else {
                System.out.println("el mayor es: " + num3);     
            }
        } 
        else if (num2 > num3){
            System.out.println("El mayor es: " + num2);
        } 
        else {
            System.out.println("El mayor es: " + num3);
        }
        System.out.println("\nk) " + MSG1);
        num = sc.nextInt();
        System.out.println(MSG1);
        num2 = sc.nextInt();
        if ((num % num2) == 0){
            System.out.println("El primer numero introducido es multiplo del segundo");
        }
        else {
            System.out.println("El primer numero introducido NO es multiplo del segundo");
        }
    }
}
