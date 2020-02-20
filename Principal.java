import Estructuras.Pila.Contenedor;

public class Principal {

    public static void main(String[] args) {
        
        int num = 10;
        
        Contenedor lista = new Contenedor();
        for(int i=0; i<num; i++){
            lista.imprimir();
            lista.insertar(i+1);
        }
        
        for(int i=0; i<num; i++){
            lista.imprimir();
            lista.eliminar();
        }
        
        lista.imprimir();

    }
}