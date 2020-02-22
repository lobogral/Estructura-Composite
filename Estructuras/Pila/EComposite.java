package Estructuras.Pila;

class EComposite implements Estructura {

    private final Estructura estructura;
    private final EHoja hoja;

    public EComposite(Estructura estructura, EHoja hoja){
        this.estructura = estructura;
        this.hoja = hoja;
    }

    @Override
    public String imprimir() {
        return hoja.imprimir() + ", " + estructura.imprimir();
    }

    @Override
    public Estructura insertar(int numero) {
        return new EComposite(this, new EHoja(numero));
    }

    @Override
    public Estructura eliminar() {
        return estructura;
    }

}