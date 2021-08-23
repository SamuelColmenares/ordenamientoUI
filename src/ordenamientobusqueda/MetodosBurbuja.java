/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientobusqueda;

import java.util.List;

/**
 * Clase para manejo de funciones de ordenamiento burbuja.
 *
 * @author Samu-Pc
 */
public class MetodosBurbuja {

    /**
     * Ordena arreglo con metodo burbuja simple.
     *
     * @param arreglo Arreglo a ordenar.
     * @return String con valores del arreglo.
     */
    public String burbujaSimple(Integer[] arreglo) {
        int i = 0, j = 0, temporal = 0, iteraciones = 0;
        String result = "";

        for (i = 0; i < arreglo.length; i++) {

            for (j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    result += arregloToString(arreglo) + "<br>";
                }

                iteraciones++;
            }
        }

        result += "Cantidad iteraciones método simple: <strong>" + iteraciones + "</strong>";
        return result;
    }

    /**
     * Ordena arreglo con metodo burbuja mejorada.
     *
     * @param arreglo Arreglo a ordenar.
     * @return String con valores del arreglo.
     */
    public String burbujaMejorada(Integer[] arreglo) {
        int i = 0, j = 0, temporal = 0, iteraciones = 0;
        String result = "";

        for (i = 1; i < arreglo.length; i++) {

            for (j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    result += arregloToString(arreglo) + "<br>";
                }

                iteraciones++;
            }
        }

        result += "Cantidad iteraciones método mejorado: <strong>" + iteraciones + "</strong>";
        return result;
    }

    /**
     * Ordena arreglo con metodo burbuja optimizada.
     *
     * @param arreglo Arreglo a ordenar.
     * @return String con valores del arreglo.
     */
    public String burbujaOptimizada(Integer[] arreglo) {
        int i = 0, j = 0, temporal = 0, iteraciones = 0;
        String result = "";

        for (i = 0; i < arreglo.length; i++) {

            for (j = 0; j < i; j++) {

                if (arreglo[i] < arreglo[j]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = temporal;
                    result += arregloToString(arreglo) + "<br>";
                }

                iteraciones++;
            }
        }

        result += "Cantidad iteraciones método optimizada: <strong>" + iteraciones + "</strong>";
        return result;
    }

    /**
     * Ordena arreglo con metodo burbuja optimizada con Flag.
     *
     * @param arreglo Arreglo a ordenar.
     * @return String con valores del arreglo.
     */
    public String burbujaFlag(Integer arreglo[]) {
        int tam = arreglo.length, iteraciones = 0;
        String result = "";

        for (int i = 0; i < tam - 1; i++) {
            boolean flag = true;

            for (int j = 0; j < tam - i - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    result += arregloToString(arreglo) + "<br>";

                    flag = false;
                }

                iteraciones++;
            }

            if (flag) {
                break;
            }
        }

        result += "Cantidad iteraciones método Flag: <strong>" + iteraciones + "</strong>";
        return result;
    }

    /**
     * Imprime arreglo en consola.
     *
     * @param arreglo Arreglo a ordenar.
     */
    private String arregloToString(Integer[] arreglo) {
        String result = "";
        for (int i = 0; i < arreglo.length; i++) {
            result += "[" + arreglo[i] + "] ";
        }

        return result;
    }

    /**
     * Retorna arreglo en string.
     *
     * @param arreglo Arreglo a ordenar.
     * @return String con valores del arreglo.
     */
    public static String arregloToString(List<Integer> arreglo) {
        String result = "";
        for (int elem : arreglo) {
            result += "[" + elem + "] ";
        }

        return result;
    }
}
