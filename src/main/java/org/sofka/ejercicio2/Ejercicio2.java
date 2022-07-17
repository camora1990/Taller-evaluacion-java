package org.sofka.ejercicio2;

import static org.sofka.utilities.GetInput.getInteger;
import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio2 {

    private Ejercicio2() {
        throw new IllegalStateException("Utility class");
    }

    /**
     *2. Al ejercicio anterior agregar entrada por consola de dos valores e indicar
     * si son mayores, menores o iguales.
     * */
    public static void ejercicio() {
        Integer number1;
        Integer number2;
        do {
            printMessage("Insert number 1");
            number1 = getInteger();
            printMessage("Insert number 2");

            number2 = getInteger();
        } while (number1 == -99 || number2 == -99);

        if (number1 == number2) {
            printMessage("Number 1 [" + number1 + "] is equal to Number 2 [" + number2 + "]");
        } else if (number1 > number2) {
            printMessage("Number 1 [" + number1 + "] greater than Number 2 [" + number2 + "]");
        } else {
            printMessage("Number 2 [" + number2 + "] greater than Number 1 [" + number1 + "]");
        }
    }
}
