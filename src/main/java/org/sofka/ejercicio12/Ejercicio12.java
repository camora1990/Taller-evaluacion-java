package org.sofka.ejercicio12;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

import static org.sofka.utilities.GetInput.getString;
import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio12 {
    /***
     *
     * 12.	Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
     *
     */
    public static void ejercicio() {

        printMessage("Enter string 1");
        String input1 = Objects.requireNonNull(getString()).toLowerCase();
        printMessage("Enter string 1");
        String input2 =  Objects.requireNonNull(getString()).toLowerCase();
        if (input2.equalsIgnoreCase(input1)) {
            printMessage(input1+ " is equal to "+ input2);
        }else {
            String difference = StringUtils.difference(input1,input2);
            printMessage("Diferences "+ difference);
        }

    }
}
