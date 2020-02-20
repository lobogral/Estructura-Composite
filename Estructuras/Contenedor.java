package Estructuras;

public class Contenedor {

    private Estructura estructura;

    public Contenedor(){
        estructura = new EVacio();
    }

    public void imprimir(){
        estructura.imprimir();
    }

    public void insertar(int numero){
        estructura = estructura.insertar(numero);
    }
}