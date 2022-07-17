package org.sofka.ejercicio7;
import static org.sofka.utilities.GetInput.getDouble;

import static org.sofka.utilities.PrintLogger.printMessage;
public class Ejercicio7 {

    /**
     * 7. Lee un número por teclado y comprueba que este numero es mayor o
     * igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
     * */
    public static void ejercicio() {
        Double input;

        do {
            printMessage("Enter number > 0");
            input = getDouble();
        }while (input < 0);

        printMessage("the number entered was ["+input+"]");
    }
}
