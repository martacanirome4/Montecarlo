package aplicacion;
import mates.Matematicas;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        // Abrir el acceso a teclado para que el usuario introduzca el número de puntos a partir del que realizar el cálculo de pi
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca una cantidad de puntos para realizar el cálculo:");
        int myint = keyboard.nextInt();
        // Imprimir por pantalla el resultado
        System.out.println("El número Pi es " + Matematicas.generarNumeroPi(myint));
        // Cerrar el acceso al teclado
        keyboard.close();
    }
}