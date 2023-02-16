package mates;
import java.lang.Math;

public class Matematicas {
    public static double generarNumeroPi(long pasos) {
        // método que permite obtener una aproximación al númpero pi mediante el método de Montecarlo y devuelva el número real que es una aproximación de pi
        int aciertos = 0;

        double pi;

        double x = 0;
        double y = 0;
        double distancia = 0;

        for (int i=0; i<pasos; i++){
            // 1. Generar dos números aleatorios entre -1 y 1
            x = Math.random() * 2 - 1;
            y = Math.random() * 2 - 1;
            // 2. Calcular la distancia entre el punto (x,y) y el origen --> La raíz cuadrada de la suma de los cuadrados de los valores
            // distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            distancia = (Math.pow(x, 2) + Math.pow(y, 2));
            // 3. Si la distancia es menor o igual que 1, el punto está dentro del círculo
            if (distancia < 1) {
                aciertos++;
            }
            // 4. Si la distancia es mayor que 1, el punto está fuera del círculo
            // 5. Repetir el proceso tantas veces como indique el usuario
        }
        // 6. Calcular el número de puntos que han caído dentro del círculo y dividirlo entre el número total de puntos
        // 7. Multiplicar el resultado por 4
        pi = (double) 4.0*((float)aciertos / (float)pasos);
        // 8. El resultado es una aproximación de pi
        return pi;

    }
}