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
        lista.imprimir();
        hoja.imprimir();
        System.out.println("Composite");
    }

    @Override
    public Estructura insertar(int numero) {
        return new EComposite(this, new EHoja(numero));
    }

}