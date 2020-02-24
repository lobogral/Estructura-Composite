package Estructuras.Arbol;

class EVacio implements Estructura {

    @Override
    public String imprimir() {
        return "";
    }

    @Override
    public Estructura insertar(int numero) {
        return new EHoja(numero);
    }

}