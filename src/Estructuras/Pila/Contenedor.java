package Estructuras.Pila;

public class Contenedor {

    private Estructura estructura;

    public Contenedor(){
        estructura = new EVacio();
    }

    public void imprimir(){
        System.out.println("[" + estructura.imprimir() + "]");
    }

    public void insertar(int numero){
        estructura = estructura.insertar(numero);
    }
    
    public void eliminar() {
        estructura = estructura.eliminar();
    }
}