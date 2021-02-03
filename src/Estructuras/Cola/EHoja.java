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
        ELista nuevo = new ELista(numero);
        actual.setELista(nuevo);
        nuevo.setELista(actual);
        return nuevo;
    }

    @Override
    public Estructura eliminar() {
        return new EVacio();
    }

}
