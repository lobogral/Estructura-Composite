import Estructuras.Cola.Contenedor;

public class Principal {

    public static void main(String[] args) {

        int[] numInsertar = {12, 7, 21, 4, 9, 16, 25, 2, 8, 11, 19};
        
        Contenedor lista = new Contenedor();
        lista.imprimir();
        
        for(int i=0; i<numInsertar.length; i++){
            lista.insertar(numInsertar[i]);
            lista.imprimir();
        }
        
        
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