package org.sofka.ejercicio17;

public class Lavadora extends Electrodomestico {


    /**
     * Carga por defecto
     */
    private static final Integer CARGA_POR_DEFECTO =5;

    /**
     * Carga de la lavadora
     */
    private Integer carga;

    /**
     * Contructor por defecto
     */
    public Lavadora(){
        this(PRECIO_BASE_POR_DEFECTO, PESO_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO, CARGA_POR_DEFECTO);
    }

    /**
     * Constructor con 2 parametros
     * @param precio - Precio base de la lavadora
     * @param peso       - Peso de la lavadora
     */
    public Lavadora(Double precio, Double peso){
        this(precio, peso, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO, CARGA_POR_DEFECTO);
    }

    /**
     * Constructor con 5 parametros
     * @param precio          - Precio base
     * @param peso                - Peso
     * @param consumoEnergetico   - Consumo energetico lavadora
     * @param color               - Color lavadora
     * @param carga               - Carga lavadora
     */
    public Lavadora(Double precio, Double peso, char consumoEnergetico, String color, Integer carga){
        super(precio,peso, consumoEnergetico,color);
        this.carga=carga;
    }


    /**
     * Devuelve la carga de la lavadora
     * @return - carga de la lavadora
     */
    public Integer getCarga() {
        return carga;
    }

    /**
     * Precio final de la lavadora
     * @return precio final de la lavadora
     */
    public Double precioFinal(){

        Double precioTotal=super.precioFinal();

        if (carga>30){
            precioTotal+=50;
        }

        return precioTotal;
    }

}
