package mates;
import java.lang.Math;

public class Matematicas {
    /**
     * Esta clase contiene un metodo para generar Pi por Montecarlo
     * @author Marta
     * @version 1.0 16/02/23
     * @param pasos --> numero grande a partir del cual se calcula el valor de Pi
     * @return número pi
     */
    public static double generarNumeroPi(long pasos) {

        int aciertos = 0;
        double pi;
        double x, y;
        double distancia;

        for (int i=0; i<pasos; i++){

            x = Math.random() * 2 - 1;
            y = Math.random() * 2 - 1;

            distancia = (Math.pow(x, 2) + Math.pow(y, 2));

            if (distancia < 1) {
                aciertos++;
            }
        }
        pi = (double) 4.0*((float)aciertos / (float)pasos);
        return pi;
    
    }
}