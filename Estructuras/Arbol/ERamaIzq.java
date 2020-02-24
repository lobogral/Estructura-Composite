package Estructuras.Arbol;

class ERamaIzq implements Estructura {

    private final Estructura estructura;
    private final int numero;

    public ERamaIzq(int numero, Estructura estructura){
        this.estructura = estructura;
        this.numero = numero;
    }

    @Override
    public String imprimir() {
        return estructura.imprimir() + ", " + numero;
    }

    @Override
    public Estructura insertar(int numero) {
        if (numero > this.numero){
            return new EArbol(estructura, new EHoja(numero), this.numero);
        } else if (numero < this.numero){
            estructura.insertar(numero);
        }
        return this;
    }

}