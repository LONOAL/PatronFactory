package org.example;

public class Main {
    static ITransporte transporte;
    public static void main(String[] args) {

        /**
         * Clase principal que crea los objetos y imprime las características de el envio..
         */

        //Camion
        s
        transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.CAMION);
                System.out.println("Camion:"+"El coste del envio es de: "+transporte.costeTotal(54000));
                int tipoC= transporte.tipoEmbalaje(120f,120f,120f,120f);
                if(tipoC == 0)
                    System.out.println("Camión: "+tipoC+"-->"+ITransporte.Pale);
                else if(tipoC == 1)
                    System.out.println("Camión: "+tipoC+"-->"+ITransporte.CajaCarton);
                else
                    System.out.println("Camión: "+tipoC+"-->"+ITransporte.CajaMadera);
        //Bicicleta

        transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.BICICLETA);
            System.out.println("Bicileta:"+"El coste del envio es de: "+transporte.costeTotal(20000));
                int tipoB =transporte.tipoEmbalaje(24f,24f,24f,24f);
                if(tipoB == 0)
                   System.out.println("Bicicleta:"+tipoB+"-->"+ITransporte.Pale);
                else if(tipoB == 1)
                   System.out.println("Bicicleta: "+tipoB+"-->"+ITransporte.CajaCarton);
                else
                   System.out.println("Bicicleta: "+tipoB+"-->"+ITransporte.CajaMadera);
            }
        }

