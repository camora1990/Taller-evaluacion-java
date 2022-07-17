package org.sofka.ejercicio10;


import static org.sofka.utilities.GetInput.getString;

import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio10 {
    /***
     *
     * 10.	Realizar una aplicación de consola, que al ingresar una frase por
     * teclado elimine los espacios que esta contenga.
     *
     */
    public static void ejercicio(){

        printMessage("Enter string to remove spaces");
        String input = getString();
        assert input != null;
        printMessage(input.replaceAll("\\s+",""));
    }
}
