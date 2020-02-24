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
        return new EComposite(new EHoja(numero), this.numero);
    }

    @Override
    public Estructura eliminar() {
        return new EVacio();
    }

}
