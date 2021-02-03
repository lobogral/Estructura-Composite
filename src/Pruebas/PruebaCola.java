package Pruebas;

import Estructuras.Cola.Contenedor;

public class PruebaCola {

    public static void main(String[] args) {

        int[] numInsertar = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        
        Contenedor cola = new Contenedor();
        cola.imprimir();
        
        for(int i=0; i<numInsertar.length; i++){
            cola.insertar(numInsertar[i]);
            cola.imprimir();
        }        
        
        for(int i=0; i<numInsertar.length + 1; i++){
            cola.eliminar();
            cola.imprimir();
        }
        
        cola.insertar(33);
        cola.imprimir();
        cola.insertar(44);
        cola.imprimir();
        cola.eliminar();
        cola.imprimir();
        cola.eliminar();
        cola.imprimir();
        
    }
}