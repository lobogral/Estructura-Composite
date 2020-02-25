package Estructuras.Arbol;

class EArbol implements Estructura {

    private Estructura ramaIzq;
    private Estructura ramaDer;
    private final int numero;

    public EArbol(Estructura ramaIzq, Estructura ramaDer, int numero){
        this.ramaIzq = ramaIzq;
        this.ramaDer = ramaDer;
        this.numero = numero;
    }

    @Override
    public String imprimir(String tipo) {
        switch (tipo) {
            case "preorden":
                return numero + ", " + ramaIzq.imprimir(tipo) + ", " + ramaDer.imprimir(tipo);
            case "inorden":
                return ramaIzq.imprimir(tipo) + ", " + numero + ", " + ramaDer.imprimir(tipo);
            default:
                return ramaIzq.imprimir(tipo) + ", " + ramaDer.imprimir(tipo) + ", " + numero;
        }
    }

    @Override
    public Estructura insertar(int numero) {
        if (numero > this.numero){
            ramaDer = ramaDer.insertar(numero);
        } else if (numero < this.numero){
            ramaIzq = ramaIzq.insertar(numero);
        }
        return this;
    }

}