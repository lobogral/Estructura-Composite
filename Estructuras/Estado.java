package Estructuras;

public class Estado {

    private Lista lista;

    public Estado(){
        lista = new Vacio();
    }

    public void imprimir(){
        lista.imprimir();
    }

    public void insertar(int numero){
        switch (lista.getClass().getSimpleName()) {
            case "Vacio":
                lista = new Hoja(numero);
                break;
            case "Hoja":
                lista = new Composite(new Hoja(numero), (Hoja) lista);
                break;
            case "Composite":
                Composite composite = (Composite) lista;
                composite.insertar(numero);
                break;
        }
    }
}