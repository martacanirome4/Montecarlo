package aplicacion;
import mates.Matematicas;
import java.util.Scanner;

public class Principal{
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca una cantidad de puntos para realizar el cálculo:");

        int myint = keyboard.nextInt();
        System.out.println("El número Pi es " + Matematicas.generarNumeroPi(myint));

        keyboard.close();
    }
}