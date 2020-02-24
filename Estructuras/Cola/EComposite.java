package Estructuras.Cola;

class EComposite implements Estructura {

    private Estructura estructura;
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
        EHoja hojaTemp = (EHoja) estructura;
        return estructura = new EComposite(new EHoja(numero), hojaTemp.numero);
    }

    @Override
    public Estructura eliminar() {
        return estructura;
    }

}