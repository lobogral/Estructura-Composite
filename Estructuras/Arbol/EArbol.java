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
    public String imprimir() {
        return ramaIzq.imprimir() + ", " 
             + numero + ", " 
             + ramaDer.imprimir();
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