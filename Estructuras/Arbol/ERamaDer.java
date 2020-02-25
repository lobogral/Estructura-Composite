package Estructuras.Arbol;

class ERamaDer implements Estructura {

    private Estructura estructura;
    private final int numero;

    public ERamaDer(int numero, Estructura estructura){
        this.estructura = estructura;
        this.numero = numero;
    }

    @Override
    public String imprimir(String tipo) {
        if ("postorden".equals(tipo)){
            return estructura.imprimir(tipo) + ", " + numero;
        } else {
            return numero + ", " + estructura.imprimir(tipo);
        }
    }

    @Override
    public Estructura insertar(int numero) {
        if (numero < this.numero){
            return new EArbol(new EHoja(numero), estructura, this.numero);
        } else if (numero > this.numero){
            estructura = estructura.insertar(numero);
        } 
        return this;
    }

}