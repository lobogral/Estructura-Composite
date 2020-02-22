package Estructuras.Cola;

class EComposite implements Estructura {

    private Estructura estructura;
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
        estructura = new EComposite(new EHoja(numero), (EHoja) estructura);
        return estructura;
    }

    @Override
    public Estructura eliminar() {
        return estructura;
    }

}