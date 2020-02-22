import Estructuras.Cola.Contenedor;

public class Principal {

    public static void main(String[] args) {
        
        int num = 6;
        
        Contenedor lista = new Contenedor();
        lista.imprimir();
        
        for(int i=0; i<num; i++){
            lista.insertar(i+1);
            lista.imprimir();
        }
        
        for(int i=0; i<num + 1; i++){
            lista.eliminar();
            lista.imprimir();
        }
        
        lista.insertar(33);
        lista.imprimir();
        lista.eliminar();
        lista.imprimir();

    }
}