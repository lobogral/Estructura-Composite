package Pruebas;

import Estructuras.Arbol.Contenedor;

public class PruebaArbol {

    public static void main(String[] args) {

        int[] numInsertar = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        
        Contenedor lista = new Contenedor();
        
        for(int i=0; i<numInsertar.length; i++){
            lista.insertar(numInsertar[i]);
        }
        
        lista.imprimir("preorden");
        lista.imprimir("inorden");
        lista.imprimir("postorden");
        
        /* Fuente 
        
        https://www.slideshare.net/JosAntonioSandovalAc
        /estructura-de-datos-estructuras-no-lineales-81014533
        
        */
    }
}