import java.util.Scanner;

public class ejercicio1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String nombre = "";
            System.out.println("Introduce tu nombre:");
            nombre = sc.nextLine();

            for (int i = 0; i < 5; ++i) {
                System.out.println("Hola" + nombre);
            }
        }
}
