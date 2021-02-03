package Estructuras.Arbol;

public class Contenedor {

    private Estructura estructura;

    public Contenedor(){
        estructura = new EVacio();
    }

    public void imprimir(String tipo){
        System.out.println("[" + estructura.imprimir(tipo) + "]");
    }

    public void insertar(int numero){
        estructura = estructura.insertar(numero);
    }

}