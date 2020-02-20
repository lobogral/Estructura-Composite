package Estructuras;

class EVacio implements Estructura {

    @Override
    public void imprimir() {
        System.out.println("Vacio");
        System.out.println("No hay elementos");
    }

    @Override
    public Estructura insertar(int numero) {
        return new EHoja(numero);
    }

}