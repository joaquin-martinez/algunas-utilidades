package desarrollogalas;

import asignargalas.Gala;

import utilidades.NumAleatorio;

public class OrdenAleatorio {


    public int[] ordenGala(int numActuaciones) {


        int[] secuenciaActuaciones = new int[numActuaciones];

        for (int i = 0; i < numActuaciones;) {
            secuenciaActuaciones[i] = ++i;
        }


        for (int j = 0; j < numActuaciones; j++) {
            int i;
            int k;
            i = NumAleatorio.numAleatorio(j, numActuaciones - 1);
            k = secuenciaActuaciones[j];
            secuenciaActuaciones[j] = secuenciaActuaciones[i];
            secuenciaActuaciones[i] = k;

        }

        System.out.println("\r\n Se  establece aleatoriamente, el siguiente orden de actuacion: \r\n");

        for (int j = 0; j < numActuaciones; j++)
            System.out.print(secuenciaActuaciones[j] + "      ");
        //       i = NumAleatorio.numAleatorio(1, numActuaciones);


        System.out.println("\r\n");


        return secuenciaActuaciones;
    }


}
