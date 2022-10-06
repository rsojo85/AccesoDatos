import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String frase;
        Scanner sc=new Scanner(System.in);

        try(FileWriter fw=new FileWriter("\\AccesoDatos\\Tema1\\Ejercicio4\\Ejercicio4_1\\anotaciones.txt", true)){

            for(int i=0;i<10;i++){
                System.out.println("Introduce una anotación");
                frase= sc.nextLine();
                if(frase==""){
                    break;
                }else{
                    fw.write(frase);
                }
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
