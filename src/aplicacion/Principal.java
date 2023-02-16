package aplicacion;
import mates.Matematicas;
import java.util.Scanner;

public class Principal{
    /**
     * @author Marta
     * @version 1.0 16/02/23
     * @param args --> numero grante (muyint) a partir del que calcular Pi, por teclado
     * Imprime por pantalla el valor obtenido de la función generarNumeroPi
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca una cantidad de puntos para realizar el cálculo:");

        int myint = keyboard.nextInt();
        System.out.println("El número Pi es " + Matematicas.generarNumeroPi(myint));

        keyboard.close();
    }
}