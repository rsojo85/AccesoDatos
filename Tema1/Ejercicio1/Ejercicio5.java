
    public class Ejercicio5 {
        public static boolean EsCapicua(int num) {
            int faltante = num;
            int numeroInvertido = 0;

            for(int restante = false; faltante != 0; faltante /= 10) {
                restante = faltante % 10;
                numeroInvertido = numeroInvertido * 10 + restante;
            }

            boolean capicua;
            if (numeroInvertido == num) {
                capicua = true;
            } else {
                capicua = false;
            }

            return capicua;
        }

        public static boolean Esprimo(int num) {
            boolean esprimo = true;
            int divisor = 2;

            while(esprimo && divisor != num) {
                if (num % divisor == 0) {
                    esprimo = false;
                } else {
                    ++divisor;
                }
            }

            return esprimo;
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
