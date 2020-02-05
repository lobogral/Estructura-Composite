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
            {
                lista = new Hoja(numero);
                break;
            }
            case "Hoja":
            {
                Hoja hojaTemporal = (Hoja) lista;
                int numeroTemporal = hojaTemporal.getNumero();
                Composite listaTemporal = new Composite(numeroTemporal, numero);
                lista = listaTemporal;
                break;
            }
            case "Composite":
            {
                Composite listaTemporal = (Composite) lista;
                listaTemporal.insertar(numero);
                break;
            }
        }
    }
}