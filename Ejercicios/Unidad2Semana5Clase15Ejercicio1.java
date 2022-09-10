package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int aumento;
        double sueldo, nsueldo;
        
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Ingrese su sueldo: ");
        sueldo = Entrada.nextDouble();
        System.out.println("Ingrese 1 si su sueldo esta entre 0 y $500");
        System.out.println("Ingrese 2 si su sueldo esta entre $501 y $1000");
        System.out.println("Ingrese 3 si su sueldo esta entre $1001 y $1500");
        System.out.println("Ingrese 4 si su sueldo esta a más de $1501");
        System.out.println("Ingrese el número: ");
        aumento = Entrada.nextInt();
        
        if (sueldo > 0){
        switch (aumento){
            case 1:{
            nsueldo = sueldo + (sueldo * 0.20);
                System.out.println("Su nuevo sueldo es: " + nsueldo);
            break;
            }
            case 2: {
            nsueldo = sueldo + (sueldo * 0.10);
                System.out.println("Su nuevo sueldo es: " + nsueldo);
            break;
            }
            case 3: {
            nsueldo = sueldo + (sueldo * 0.05);
                System.out.println("Su nuevo sueldo es:" + nsueldo);
            break;
            }
            case 4: {
            nsueldo = sueldo + (sueldo * 0.03);
                System.out.println("Su nuevo sueldo es:" + nsueldo);
            break;
            }
            default: {
                System.out.println("Resultado inválido");
            break;
            }
        }
        }
        else {
            System.out.println("El sueldo no tiene que ser menor o igual que 0");
        }       
    }
    
}
