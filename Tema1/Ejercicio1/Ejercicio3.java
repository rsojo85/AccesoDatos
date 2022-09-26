import java.util.Scanner;

    public class Ejercicio3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String mes = "";
            int nummes;

            do {
                do {
                    System.out.println("Introduce un número del 1 al 12 para saber el mes:");
                    nummes = sc.nextInt();
                } while(nummes < 1);
            } while(nummes > 12);

            switch (nummes) {
                case 1:
                    mes = "enero";
                    break;
                case 2:
                    mes = "febrero";
                    break;
                case 3:
                    mes = "marzo";
                    break;
                case 4:
                    mes = "abril";
                    break;
                case 5:
                    mes = "mayo";
                    break;
                case 6:
                    mes = "junio";
                    break;
                case 7:
                    mes = "julio";
                    break;
                case 8:
                    mes = "agosto";
                    break;
                case 9:
                    mes = "septiembre";
                    break;
                case 10:
                    mes = "octubre";
                    break;
                case 11:
                    mes = "noviembre";
                    break;
                case 12:
                    mes = "diciembre";
            }

            System.out.println("El mes número " + nummes + " es el mes " + mes + ".");
        }
    }
