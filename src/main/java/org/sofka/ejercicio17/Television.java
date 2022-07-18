package org.sofka.ejercicio17;

public class Television extends Electrodomestico{

    private static final  Integer RESOLUCION_POR_DEFECTO =20;

     /**
     * Resolucion del televisor
     */
    private Integer resolucion;

    /**
     * Indica si tiene o no sintonizadorTDT
     */
    private Boolean sintonizadorTDT;

    /**
     * Constructor por defecto
     */
    public Television(){
        this(PRECIO_BASE_POR_DEFECTO, PRECIO_BASE_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO, RESOLUCION_POR_DEFECTO, false);
    }

    /**
     * Constructor con 2 parametros
     * @param precio               - precio televisor
     * @param peso                 - Peso televisor
     */
    public Television(Double precio, Double peso){
        this(precio, peso, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO, RESOLUCION_POR_DEFECTO, false);
    }

    /**
     * Contructor con 6 parametros
     * @param precio                 - precio televisor
     * @param peso                   - Peso televisor
     * @param consumoEnergetico      - consumo energetico
     * @param color                  - color televisor
     * @param resolucion             - Resolucion televeisor
     * @param sintonizadorTDT        - Sincronizador tdt
     */
    public Television(Double precio, Double peso, Character consumoEnergetico, String color, Integer resolucion, Boolean sintonizadorTDT){
        super(precio, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }

    /**
     * Precio final de la television
     * @return precio final de la television
     */
    public Double precioFinal(){

        Double total=super.precioFinal();

        if (resolucion>40){
            total+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            total+=50;
        }

        return total;
    }

}
