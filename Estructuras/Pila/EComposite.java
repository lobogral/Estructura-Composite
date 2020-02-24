package Estructuras.Pila;

class EComposite implements Estructura {

    private final Estructura estructura;
    private final int numero;

    public EComposite(Estructura estructura, int hoja){
        this.estructura = estructura;
        this.numero = hoja;
    }

    @Override
    public String imprimir() {
        return numero + ", " + estructura.imprimir();
    }

    @Override
    public Estructura insertar(int numero) {
        return new EComposite(this, numero);
    }

    @Override
    public Estructura eliminar() {
        return estructura;
    }

}