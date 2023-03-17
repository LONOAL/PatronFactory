package org.example;

public class Barco implements ITransporte{
    /**
     * Devuelve el coste del envio en bicicleta según el Código Postal.
     * @param CP Código Postal del lugar del envío.
     * @return costeB que es el coste del envío.
     */

    @Override
    public Float costeTotal(Integer CP) {
        Float costeC;
        if (CP<20000){
            costeC = 20000f;
        }else {
            costeC = 2000f;
        }
        return costeC;
    }
    /**
     * Devuelve el tipo de enbalaje según las características del paquete.
     * @param x,y,z,peso Características del envío.
     * @return opcionC que es el número del tipo del embalaje.
     */

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        Integer opcionC=null;

        if (x > 200 && y > 200 && z > 200 && peso > 200) {
            opcionC = 2;

        } else if(x>100&&x<200&&y>100&&y<200&&z>100&&z<200&&peso>100&&peso<200) {
            opcionC = 1;

        } else if(x>50&&x<100&&y>50&&y<100&&z>50&&z<100&&peso>50&&peso<100){
            opcionC = 0;

        }

        return opcionC;
    }




}
