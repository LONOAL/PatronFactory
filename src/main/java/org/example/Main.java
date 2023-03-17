package org.example;

public class Main {
    static ITransporte transporte;
    public static void main(String[] args) {

        /**
         * Clase principal que crea los objetos y imprime las características de el envio.
         */

        //Camion
        transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.CAMION);
            System.out.println("Camion:"+"El coste del envio es de: "+transporte.costeTotal(54000));
                int tipoC= transporte.tipoEmbalaje(120f,120f,120f,120f);
                if(tipoC == 0)
                    System.out.println("Camión: "+tipoC+" --> "+ITransporte.Pale);
                else if(tipoC == 1)
                    System.out.println("Camión: "+tipoC+" --> "+ITransporte.CajaCarton);
                else
                    System.out.println("Camión: "+tipoC+" --> "+ITransporte.CajaMadera);
        //Bicicleta
        transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.BICICLETA);
            System.out.println("Bicileta:"+"El coste del envio es de: "+transporte.costeTotal(20000));
                int tipoB =transporte.tipoEmbalaje(24f,24f,24f,24f);
                if(tipoB == 0)
                   System.out.println("Bicicleta: "+tipoB+" --> "+ITransporte.Pale);
                else if(tipoB == 1)
                   System.out.println("Bicicleta: "+tipoB+" --> "+ITransporte.CajaCarton);
                else
                   System.out.println("Bicicleta: "+tipoB+" --> "+ITransporte.CajaMadera);

        // Barco
        transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.BARCO);
            System.out.println("Barco:"+"El coste del envio es de: "+transporte.costeTotal(18000));
                int tipoBa =transporte.tipoEmbalaje(220f,220f,220f,220f);
                if(tipoBa == 0)
                    System.out.println("Barco: "+tipoBa+"-->"+ITransporte.Pale);
                else if(tipoBa == 1)
                    System.out.println("Barco: "+tipoBa+"-->"+ITransporte.CajaCarton);
                else
                    System.out.println("Barco: "+tipoBa+"-->"+ITransporte.CajaMadera);
            }
        }

