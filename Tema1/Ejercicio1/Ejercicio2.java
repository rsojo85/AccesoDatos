import java.util.Scanner;

public class Ejercicio2 {
    public static void Calculafactor(int num){
        for(int i=2;i<num;i++){
            while(num%i==0){
                num=num/i;
                System.out.print(i+", ");
                }
            }
        }

    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un numero entero para mostrar sus factores primos:");
        num= sc.nextInt();
        Calculafactor(num);
    }
}
