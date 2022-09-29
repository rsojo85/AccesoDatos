import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<String> strlist=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String temp;
        int indice=0;


        do {
            System.out.println("Introduce una cadena de texto para añadir a la lista:");
            System.out.println("(Cuando introduzcas 'fin' dejara de añadir. Levas añadidas"+(indice+1)+" cadenas de texto.");
            temp=sc.nextLine();
            strlist.add(indice,temp);
            indice++;
        }while(temp!="fin");

        do {
            System.out.println("Introduce una cadena de texto para buscar en la lista:");
            System.out.println("(Cuando introduzcas 'fin' dejara de buscar.)");
            temp=sc.nextLine();

            for(int i=0; i< strlist.size(); i++){
                if(temp == strlist.get(i)){
                    System.out.println("La cadena "+temp+" esta en la posición "+(i+1)+".");
                }
                else{
                    System.out.println("La cadena no exixte.");
                }
            }

        }while(temp!="fin");




    }
}
