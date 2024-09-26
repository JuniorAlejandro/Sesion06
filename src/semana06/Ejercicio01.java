package semana06;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7; 
        int intento;

        System.out.println("Adivina el número entre 1 y 10: ");
        intento = scanner.nextInt();

        while (intento != numeroSecreto) {
            if (intento > numeroSecreto) {
                System.out.println("El número es menor, intenta de nuevo: ");
            } else {
                System.out.println("El número es mayor, intenta de nuevo: ");
            }
            intento = scanner.nextInt(); 
        }

        System.out.println("¡Felicidades! Adivinaste el número.");
    }
}