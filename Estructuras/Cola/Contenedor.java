package Estructuras.Cola;

public class Contenedor {

    private Estructura primero;
    private Estructura ultimo;

    public Contenedor(){
        EVacio eVacio = new EVacio();
        primero = eVacio;
        ultimo = eVacio;
    }

    public void imprimir(){
        System.out.println("[" + primero.imprimir() + "]");
    }

    public void insertar(int numero){
        boolean temp = !"EComposite".equals(ultimo.getClass().getSimpleName());
        ultimo = ultimo.insertar(numero);
        if(temp){
            primero = ultimo;
        }
    }
    
    public void eliminar() {
        primero = primero.eliminar();
        boolean temp = !"EComposite".equals(primero.getClass().getSimpleName());
        if(temp){
            ultimo = primero;
        }
    }
    
}