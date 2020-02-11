import Estructuras.Contenedor;

public class Principal {

    public static void main(String[] args) {
        
        Contenedor lista = new Contenedor();
        for(int i=0; i<8; i++){
            lista.imprimir();
            lista.insertar(i+1);
            System.out.println("------");
        }
    }
}