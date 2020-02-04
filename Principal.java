import Estructuras.Lista;

public class Principal {

    public static void main(String[] args) {
        Lista lista = new Lista();
        for(int i=0; i<8; i++){
            lista.insertar(i);
            System.out.println("------");
            lista.imprimir();
        }
    }

}