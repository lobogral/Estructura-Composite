package Estructuras;

public class Contenedor {

    private Estado estado;

    public Contenedor(){
        estado = new EstadoVacio(this);
    }

    void setEstado(Estado estado){
        this.estado = estado;
    }

    public void imprimir(){
        estado.imprimir();
    }

    public void insertar(int numero){
        estado.insertar(numero);
    }
}