package Estructuras.Pila;

class EHoja implements Estructura {

    private final int numero;

    public EHoja(int numero){
        this.numero = numero;
    }

    @Override
    public String imprimir() {
        return "" + numero;
    }

    @Override
    public Estructura insertar(int numero) {
        return new EComposite(this, new EHoja(numero));
    }

    @Override
    public Estructura eliminar() {
        return new EVacio();
    }

}
