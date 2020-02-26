package Estructuras.Cola;

class EHoja implements Estructura {

    final int numero;

    public EHoja(int numero){
        this.numero = numero;
    }
    
    @Override
    public String imprimir() {
        return "" + numero;
    }

    @Override
    public Estructura insertar(int numero) {
        ELista actual = new ELista(this.numero);
        ELista siguiente = new ELista(numero);
        actual.setELista(siguiente);
        siguiente.setELista(actual);
        return siguiente;
    }

    @Override
    public Estructura eliminar() {
        return new EVacio();
    }

}
