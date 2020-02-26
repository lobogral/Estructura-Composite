package Estructuras.Cola;

class EVacio implements Estructura {

    @Override
    public Estructura insertar(int numero) {
        System.out.println("" + numero);
        return new EHoja(numero);
    }

    @Override
    public Estructura eliminar() {
        System.out.println("[]");
        return this;
    }

}