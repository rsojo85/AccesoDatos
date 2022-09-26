import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> numlist=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int num;
        int indice=0;


        do {
            System.out.println("Introduce un número para añadir a la lista:");
            System.out.println("(Cuando introduzcas un número negativo dejara de añadir) Levas añadidos"+indice+" números.");
            num=sc.nextInt();
            numlist.add(indice,num);
            indice++;
        }while(num>=0);

        do {
            System.out.println("Introduce un número para buscar en a la lista:");
            System.out.println("(Cuando introduzcas un número negativo dejara de leer)");
            num=sc.nextInt();

            for(int i=0; i< numlist.size(); i++){
                if(num == numlist.get(i)){
                    System.out.println("El número "+num+" esta en la posición "+i+".");
                }
            }

        }while(num>=0);




    }
}
