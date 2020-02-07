package Estructuras;

class Hoja implements Lista {

    private final int numero;
    
    public Hoja(int numero){
        this.numero = numero;
    }

    @Override
    public void imprimir() {
        System.out.println("Hoja");
        System.out.println(numero);
    }

}