# Obtención de Pi mediante el metodo de Montecarlo #

Este programa permite obtener una aproximación al numero pi mediante el método de Montecarlo.
Informacion adicional: https://www.ibm.com/es-es/cloud/learn/monte-carlo-simulation

# Funcionamiento #
Se parte de dibujar un circulo (simula una diana) dentro de un cuadrado, cuyo diámetro sea igual a la longitud del lado del cuadrado. 
Mientras se van dibujando progresivamente puntos de manera aleatoria sobre la superficie dibujada (simulan los dardos)
aquellos puntos dentro del circulo, seran los aciertos, y su relacion entre la cantodad de estos y de aquellos puntos o "dardos" fuera
del circulo se utilizaran como estimacion. A partir de la relación, se realiza un calculo multiplicando su division (aciertos/puntos totales) por 4,
obteniendo finalmente el calculo de pi.

### Pre-requisitos ###
- Tener instalado Java
- Tener instalado make

### Instrucciones de complilacion y ejecucion del programa ###
Al ejecutar el programa, este pedira por consola que se le pase por parametro un valor: la cantidad de puntos a generar.
A partir de este valor aportado por el usuario, se devolvera la aproximacion al valor del numero PI.

Compilar:
make jar

Ejecutar:
java -jar Main.jar

Generar documentacion HTML: MAKE DOC

## De manera grafica ##

![image-asset](https://user-images.githubusercontent.com/50625677/219369902-385168a8-8b7d-48da-898d-e06e144d280c.png)

### Autores ###
Programa desarrollado por Marta Canino Romero, @martacanirome4 en GitHub (2023)

