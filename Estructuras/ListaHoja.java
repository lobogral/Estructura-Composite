package Estructuras;

class ListaHoja implements Lista {

    private int numero;

    public ListaHoja(int numero){
        this.numero = numero;
    }

    @Override
    public void imprimir() {
        System.out.println("Hoja");
        System.out.println(numero);
    }

}