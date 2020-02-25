package Estructuras.Arbol;

class EHoja implements Estructura {

    private final int numero;

    public EHoja(int numero){
        this.numero = numero;
    }

    @Override
    public String imprimir(String tipo) {
        return "" + numero;
    }

    @Override
    public Estructura insertar(int numero) {
        if (numero > this.numero){
            return new ERamaDer(this.numero, new EHoja(numero));
        } else if (numero < this.numero){
            return new ERamaIzq(this.numero, new EHoja(numero));
        } else {
            return this;
        }
    }

}
