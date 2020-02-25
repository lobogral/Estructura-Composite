package Estructuras.Arbol;

class EVacio implements Estructura {

    @Override
    public String imprimir(String tipo) {
        return "";
    }

    @Override
    public Estructura insertar(int numero) {
        return new EHoja(numero);
    }

}