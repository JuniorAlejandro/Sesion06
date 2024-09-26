package semana06;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Ingrese un número (0 para salir): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            suma += numero; 
            System.out.println("Ingrese otro número (0 para salir): ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma total es: " + suma);
    }
}