package org.example;


public class Bicicleta implements ITransporte {
    /**
     * Devuelve el coste del envio en bicicleta según el Código Postal.
     * @param CP Código Postal del lugar del envío.
     * @return costeB que es el coste del envío.
     */


    public Float costeTotal(Integer CP) {
        Float costeB;
        if (CP > 20000&&CP<54000) {
            costeB = 5000f;
        } else {
            costeB = 500f;
        }
        return costeB;
    }
    /**
     * Devuelve el tipo de enbalaje según las características del paquete.
     * @param x,y,z,peso Características del envío.
     * @return opcionB que es el número del tipo del embalaje.
     */
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        Integer opcionB= null;
        ;
        if (x > 50 && y > 50 && z > 50 && peso > 50) {
            opcionB = 2;


        } else if(x > 25&&x<50&&y>25&&y<50&&z>25&&z<50&&peso>25&&peso<50){
            opcionB = 1;

        }
        else if(x>0&&x<25&&y>0&&y<25&&z>0&&z<25&&peso>0&&peso<25){
            opcionB = 0;

        }
        return opcionB;
    }
}

