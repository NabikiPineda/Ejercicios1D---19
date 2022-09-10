package ejerciciowhile;
import java.util.Scanner;
public class EjercicioWhile {
    public static void main(String[] args) {
      Scanner ingresar = new Scanner (System.in);
      double nota;
      
        System.out.println("Ingresar un valor desde 1 hasta 10 ");
        nota=ingresar.nextDouble();
        
        while (nota<1 | nota>10)
        {
            System.out.println("Lo siento mucho, pero no es válido :/ ");
        nota=ingresar.nextDouble();
        }
    }
    
}
