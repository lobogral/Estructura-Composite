package Estructuras;

class EComposite implements Estructura {

    private Estructura lista;
    private final EHoja hoja;

    public EComposite(Estructura lista, EHoja hoja){
        this.lista = lista;
        this.hoja = hoja;
    }

    @Override
    public void imprimir() {
        System.out.println("Composite");
        hoja.imprimir();
        lista.imprimir();
    }

    @Override
    public Estructura insertar(int numero) {
        lista = lista.insertar(numero);
        return this;
    }

}