import Estructuras.Cola.Contenedor;

public class Principal {

    public static void main(String[] args) {

        int[] numInsertar = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        
        Contenedor lista = new Contenedor();
        lista.imprimir();
        
        for(int i=0; i<numInsertar.length; i++){
            lista.insertar(numInsertar[i]);
            lista.imprimir();
        }
        
        //lista.imprimir("preorden");
        //lista.imprimir("inorden");
        //lista.imprimir("postorden");
        
        
        for(int i=0; i<numInsertar.length + 1; i++){
            lista.eliminar();
            lista.imprimir();
        }
        
        lista.insertar(33);
        lista.imprimir();
        lista.insertar(44);
        lista.imprimir();
        lista.eliminar();
        lista.imprimir();
        lista.eliminar();
        lista.imprimir();
        
    }
}