import java.util.Scanner;

public class Ejercicio5 {
        public static boolean EsCapicua(int num) {
            int faltante = num;
            int numeroInvertido = 0;
            for (int restante = faltante; faltante != 0; faltante /= 10) {
                restante = faltante % 10;
                numeroInvertido = numeroInvertido * 10 + restante;
            }
            if (numeroInvertido == num) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean Esprimo(int num) {
            if(num<=1|| num%2==0){return false};
            for(int i=3;i*i<=num; i+=2){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un número para saber si es primo y capicua:");
            int num = sc.nextInt();
            if (Esprimo(num) && EsCapicua(num)) {
                System.out.println("El número " + num + " es primo y capicua.");
            } else if (!Esprimo(num) && EsCapicua(num)) {
                System.out.println("El número " + num + "  no es primo, pero sí capicua.");
            } else if (Esprimo(num) && !EsCapicua(num)) {
                System.out.println("El número " + num + " es primo, pero no capicua.");
            } else {
                System.out.println("El número " + num + "  no es primo ni capicua.");
            }

        }
    }