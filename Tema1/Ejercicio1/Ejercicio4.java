import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mes = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int nummes;
        do {
            do {
                System.out.println("Introduce un número del 1 al 12 para saber el mes:");
                nummes = sc.nextInt();
            } while(nummes < 1);
        } while(nummes > 12);

        System.out.println("El mes número " + nummes + " es el mes " + mes[nummes - 1] + ".");
    }
}
