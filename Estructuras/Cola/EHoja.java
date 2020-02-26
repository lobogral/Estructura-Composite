package Estructuras.Cola;

class EHoja implements Estructura {

    final int numero;

    public EHoja(int numero){
        this.numero = numero;
    }

    @Override
    public Estructura insertar(int numero) {
        System.out.println("" + numero);
        ELista actual = new ELista(this.numero);
        ELista siguiente = new ELista(numero);
        actual.setELista(siguiente);
        siguiente.setELista(actual);
        return siguiente;
    }

    @Override
    public Estructura eliminar() {
        System.out.println("" + numero);
        System.out.println("<<<<<");
        return new EVacio();
    }

}
