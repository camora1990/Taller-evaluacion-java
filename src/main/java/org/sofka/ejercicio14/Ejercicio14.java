package org.sofka.ejercicio14;

import static org.sofka.utilities.GetInput.getInteger;

import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio14 {

    /**
     * 14.Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde
     * el numero introducido hasta 1000 con saldos de 2 en 2.
     *
     * */

    public static void ejercicio() {

       Integer input;
        do {
            printMessage("Insert number <= 1000 and number >= 0");
            input = getInteger();
        }while (input < 0 || input>1000);
        final String[] message = {"|Numbers since| "+input+"\n"};
        for (int i = input; i <= 1000; i+=2) {
            message[0] = message[0] + i+"\n";
        }

        printMessage(message[0]);



    }
}
