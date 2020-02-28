package Pruebas;

import Estructuras.Pila.Contenedor;

public class PruebaPila {

    public static void main(String[] args) {

        int[] numInsertar = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        
        Contenedor pila = new Contenedor();
        pila.imprimir();
        
        for(int i=0; i<numInsertar.length; i++){
            pila.insertar(numInsertar[i]);
            pila.imprimir();
        }
        
        for(int i=0; i<numInsertar.length + 1; i++){
            pila.eliminar();
            pila.imprimir();
        }
        
        pila.insertar(33);
        pila.imprimir();
        pila.insertar(44);
        pila.imprimir();
        pila.eliminar();
        pila.imprimir();
        pila.eliminar();
        pila.imprimir();
        
    }
}