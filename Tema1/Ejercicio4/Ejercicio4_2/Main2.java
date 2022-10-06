import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String frase;
        Scanner sc=new Scanner(System.in);

        try(BufferedWriter bw=new BufferedWriter(new FileWriter("\\AccesoDatos\\Tema1\\Ejercicio4\\Ejercicio4_2\\anotaciones.txt"))){
            for(int i=0;i<10;i++){
                System.out.println("Introduce una frase:");
                frase= sc.nextLine();
                if(frase==""){
                    break;
                }else{
                    bw.write(frase);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
