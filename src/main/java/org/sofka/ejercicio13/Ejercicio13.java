package org.sofka.ejercicio13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.sofka.utilities.PrintLogger.printMessage;

public class Ejercicio13 {
    /**
     * 13.	Realizar un algoritmo que permita consulta la fecha y hora actual en el formato
     * (AAAA/MM/DD) (HH:MM:SS)
     *
     * */

    public static void ejercicio() {


        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        printMessage("Current date in format (AAAA/MM/DD) (HH:MM:SS) "+ dateFormat.format(now));



    }
}
