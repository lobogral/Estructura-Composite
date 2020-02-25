package Estructuras.Arbol;

class ERamaIzq implements Estructura {

    private Estructura estructura;
    private final int numero;

    public ERamaIzq(int numero, Estructura estructura){
        this.estructura = estructura;
        this.numero = numero;
    }

    @Override
    public String imprimir(String tipo) {
        if("preorden".equals(tipo)){
            return numero + ", " + estructura.imprimir(tipo);
        } else {
            return estructura.imprimir(tipo) + ", " + numero;
        }
    }

    @Override
    public Estructura insertar(int numero) {
        if (numero > this.numero){
            return new EArbol(estructura, new EHoja(numero), this.numero);
        } else if (numero < this.numero){
            estructura = estructura.insertar(numero);
        }
        return this;
    }

}