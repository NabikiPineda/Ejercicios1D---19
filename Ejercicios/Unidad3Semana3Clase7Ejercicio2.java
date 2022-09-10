package javaapplication36;
import java.util.Scanner;
public class JavaApplication36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        int contador, fin;
        
        System.out.println("Ingrese el valor con el que quiere iniciar: ");
        contador= reader.nextInt();
        System.out.println("Ingrese el ultimo valor: ");
        fin=reader.nextInt();
        while (contador<=fin){
            System.out.println("Valor actual: "+contador);
        contador++;
        }
        
    }
    
}
