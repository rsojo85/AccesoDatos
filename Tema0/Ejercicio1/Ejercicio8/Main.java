import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        public static void main(String[] args) {
            ListaDeDatos listcadena=new ListaDeDatos();
            Scanner sc=new Scanner(System.in);
            String temp;
            int indice=0,numveces=0;
            boolean existe;
            do {
                System.out.println("Introduce una cadena de texto para añadir a la lista:");
                System.out.println("(Cuando introduzcas 'fin' dejara de añadir. Levas añadidas"+(indice+1)+" cadenas de texto.");
                temp=sc.nextLine();
                if(temp!="fin"){
                    (indice,temp);
                    indice++;
                }
            }while(temp!="fin");
            do {
                System.out.println("Introduce una cadena de texto para buscar en la lista:");
                System.out.println("(Cuando introduzcas 'fin' dejara de buscar.)");
                temp=sc.nextLine();
                existe=false;
                for(int i=0; i< strlist.size(); i++){
                    if(temp == strlist.get(i)) {
                        existe = true;
                        numveces++;
                    }
                }
                if(existe){
                    System.out.println("La cadena "+temp+" esta "+numveces+" veces.");
                }
                else{
                    System.out.println("La cadena no exixte.");
                }
            }while(temp!="fin");
        }
    }
}
