package Estructuras.Pila;

class EComposite implements Estructura {

    private final Estructura lista;
    private final EHoja hoja;

    public EComposite(Estructura lista, EHoja hoja){
        this.lista = lista;
        this.hoja = hoja;
    }

    @Override
    public String imprimir() {
        return hoja.imprimir() + ", " + lista.imprimir();
    }

    @Override
    public Estructura insertar(int numero) {
        return new EComposite(this, new EHoja(numero));
    }

    @Override
    public Estructura eliminar() {
        return lista;
    }

}