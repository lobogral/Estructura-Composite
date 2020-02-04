package Estructuras;

public class Lista implements Estructura{

    private Estructura estructura;
    private Hoja hoja;

    @Override
    public void imprimir() {
        if (hoja != null) hoja.imprimir();
        if (estructura != null) estructura.imprimir();
    }

    @Override
    public void insertar(int numero){
        if(hoja == null){
            hoja = new Hoja();
            hoja.insertar(numero);
        } else if(estructura == null){
            estructura = new Hoja();
            estructura.insertar(numero);
        } else if ("Hoja".equals(estructura.getClass().getSimpleName())){
            Hoja hojaTemporal = (Hoja) estructura;
            int numeroTemporal = hojaTemporal.getNumero();
            estructura = new Lista();
            estructura.insertar(numeroTemporal);
            estructura.insertar(numero);
        } else {
            estructura.insertar(numero);
        }
    }

}