package Estructuras.Cola;

public class Contenedor {

    private Estructura estructura;
    private Estructura insercion;

    public Contenedor(){
        EVacio eVacio = new EVacio();
        estructura = eVacio;
        insercion = eVacio;
    }

    public void imprimir(){
        System.out.println("[" + estructura.imprimir() + "]");
    }

    public void insertar(int numero){
        insercion = insercion.insertar(numero);
        if(!"EComposite".equals(estructura.getClass().getSimpleName())){
            estructura = insercion;
        }
    }
    
    public void eliminar() {
        estructura = estructura.eliminar();
        if(!"EComposite".equals(estructura.getClass().getSimpleName())){
            insercion = estructura;
        }
    }
}