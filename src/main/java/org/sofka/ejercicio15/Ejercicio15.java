package org.sofka.ejercicio15;

/*Hacer un programa que muestre el siguiente menú de opciones
        ****** GESTION CINEMATOGRÁFICA ********
        1-NUEVO ACTOR
        2-BUSCAR ACTOR
        3-ELIMINAR ACTOR
        4-MODIFICAR ACTOR
        5-VER TODOS LOS ACTORES
        6- VER PELICULAS DE LOS ACTORES
        7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
        8-SALIR

        EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS 
        * CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO 
        * ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
        PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.*/

import org.sofka.utilities.GetInput;
import org.sofka.utilities.PrintLogger;

public class Ejercicio15 {
    
    private static void optios (){

        PrintLogger.printMessage(" ****** GESTION CINEMATOGRÁFICA ********\n" +
                "        1-NUEVO ACTOR\n" +
                "        2-BUSCAR ACTOR\n" +
                "        3-ELIMINAR ACTOR\n" +
                "        4-MODIFICAR ACTOR\n" +
                "        5-VER TODOS LOS ACTORES\n" +
                "        6- VER PELICULAS DE LOS ACTORES\n" +
                "        7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "        8-SALIR");
    }

    public static void optionMenu(){
        Integer input;
        do {
            optios();
            input = GetInput.getInteger();
            if (input<1||input>8) {
                PrintLogger.printMessage("[****** OPCION INCORRECTA ********]");
            }
        }while (input!=8);
    }
}
