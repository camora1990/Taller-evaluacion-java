package org.sofka.ejercicio9;

import org.sofka.utilities.PrintLogger;

public class Ejercicio9 {

    /**
     * 9. Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a
     * del String anterior por una e, adicionalmente concatenar a esta frase una adicional que
     *  ustedes quieran incluir por consola y las muestre luego unidas.
     * */

    public static void ejercicio() {
        String message = "La sonrisa sera la mejor arma contra la tristeza";
        String newMessage = message.replace("a","e").concat(" la sonrisa cura el alma");

        PrintLogger.printMessage(newMessage);
    }
}
