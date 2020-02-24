package Estructuras.Arbol;

class ERamaDer implements Estructura {

    private final Estructura estructura;
    private final int numero;

    public ERamaDer(int numero, Estructura estructura){
        this.estructura = estructura;
        this.numero = numero;
    }

    @Override
    public String imprimir() {
        return numero + ", " + estructura.imprimir();
    }

    @Override
    public Estructura insertar(int numero) {
        if (numero < this.numero){
            return new EArbol(new EHoja(numero), estructura, this.numero);
        } else if (numero > this.numero){
            estructura.insertar(numero);
        } 
        return this;
    }

}