package org.sofka.ejercicio8;

import java.util.Locale;
import java.util.Objects;

import static org.sofka.utilities.GetInput.getString;
import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio8 {

    /**
     * 8. Crea una aplicación por consola que nos pida un día de la semana y que
     * nos diga si es un día laboral o no. Usa un switch para ello.
     */
    public static void ejercicio() {
        printMessage("Ingrese el dia de la semana");
        String diaLaboral = "Dia laboral";
        String diaNoLaboral = "No es un dia laboral";
        switch (Objects.requireNonNull(getString()).toUpperCase().trim()) {
            case "LUNES":
            case "JUEVES":
            case "MARTES":
            case "MIERCOLES":
            case "VIERNES":
                printMessage(diaLaboral);
                break;
            case "SABADO":
            case "DOMINGO":
                printMessage(diaNoLaboral);
                break;
            default:
                printMessage("Dia invalido");
        }
    }
}
