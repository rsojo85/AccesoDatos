import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        String frase;
        Scanner sc=new Scanner(System.in);
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
        String historial = hourdateFormat.format(date);

        try(BufferedWriter bw=new BufferedWriter(new FileWriter("\\AccesoDatos\\Tema1\\Ejercicio4\\Ejercicio4_2\\anotaciones.txt"))){
            for(int i=0;i<10;i++){
                System.out.println("Introduce una anotación:");
                frase= sc.nextLine();
                if(frase==""){
                    break;
                }else{
                    bw.write(historial+frase);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
