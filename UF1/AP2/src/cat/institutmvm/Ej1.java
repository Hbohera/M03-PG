package cat.institutmvm;

public class Ej1 {
    // Creamos la diferentes constantes que usaremos a lo largo del ejercicio.
    private static final String NOM = "Helios";
    private static final String COGNOM= "Bohera";
    private static final String ASTERISC= "*";
    private static final int SIZE= 10;
    public static void main(String[] args) {
        // Inicialicamos las variables.
        int i, j, aux= 1, h;
        // Mostramos el nombre.
        System.out.println("a) " + NOM + "\n");
        // Mostramos el nombre y apellido en una misma línea.
        System.out.println("b) " + NOM + " " + COGNOM+ "\n");
        // Mostramos el nombre y apellido en diferentes líneas.
        System.out.println("c) " +NOM + "\n" + COGNOM+ "\n");
        System.out.println("d) ");
        for (i=0;i<SIZE;i++){
            for (j=0;j<SIZE;j++){
                System.out.print(ASTERISC + " ");
            }
            System.out.println();
        }
        System.out.println("\ne) ");
        for (i=10;i>0;i--){
            for (j=0; j<i;j++){
                System.out.print(" ");
            }
            for (h=0; h<aux;h++){
                System.out.print(ASTERISC + " ");
            }
            aux++;
            System.out.print("\n");
        }
    }
}
