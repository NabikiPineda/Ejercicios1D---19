package javaapplication45;
import java.util.Scanner;
public class JavaApplication45 {
    public static void main(String[] args) {
     Scanner objetoNum = new Scanner (System.in);
     Scanner objetoTexto = new Scanner (System.in);
     
     String seguir= "s";
     double suma;
     int conteo = 0, primo = 0, noprimo = 0, num;
     
     while ("s".equals(seguir) || "S".equals(seguir)) 
     {
         System.out.println("Ingresar un número positivo");
     num=objetoNum.nextInt();
     while(num<0)
     {
         System.out.println("Ingresar un número positivo");
     
     num=objetoNum.nextInt();
     }
     conteo++;
     
     if(num%2==0)
     {
     primo++;
     }
     else 
     {
     noprimo++;
     }
        System.out.println("Desea ingresar otro valor, s");
        seguir=objetoTexto.next();   
    }
    }
}
