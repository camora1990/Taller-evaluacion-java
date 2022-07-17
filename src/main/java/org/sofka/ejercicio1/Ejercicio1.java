package org.sofka.ejercicio1;

import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio1 {

    /**
     * 1.	Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
     * Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
     * */
    private Ejercicio1() {
        throw new IllegalStateException("Utility class");
    }
    public static void ejercicio() {
        Integer number1 = 70;
        Integer number2 = 50;

        if (number1 == number2) {
            printMessage("Number 1 [" + number1 + "] is equal to Number 2 [" + number2 + "]");
        } else if (number1 > number2) {
            printMessage("Number 1 [" + number1 + "] greater than Number 2 [" + number2 + "]");
        } else {
            printMessage("Number 2 [" + number2 + "] greater than Number 1 [" + number1 + "]");
        }
    }
}
