package Estructuras;

class Hoja implements Estructura {

    private int numero;

    @Override
    public void imprimir() {
        System.out.println(numero);
    }

    @Override
    public void insertar(int numero) {
        this.numero = numero;
    }

    int getNumero() {
        return numero;
    }

}