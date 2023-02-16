package aplicacion;
import dominio.*;

// diagrama de clases + diagrama de flujo con plantUML

public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        // es un servicio de la clase y se invoca a través de la clase
        // son como métodos sin parámetros self
        System.out.println(Montecarlo.calcularPi(1000000));
    }
}