package quieresseguirjugando;
import java.util.Scanner;
public class QuieresSeguirJugando {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        String quierojugar = "Si";
        String indicacion; 
        System.out.println(" ++++Porfavor ingrese su respuesta con inicial mayúscula++++ ");
        indicacion = ingresar.nextLine();
        while (quierojugar.equals("Si")){
        System.out.println("Quieres seguir jugando? ");
    quierojugar = ingresar.next();
    }
        
    }
    
}
