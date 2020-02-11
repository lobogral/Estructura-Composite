package Estructuras;

class EstadoHoja implements Estado {

    private final Contenedor estado;
    private final int numero;

    public EstadoHoja(Contenedor estado, int numero){
        this.estado = estado;
        this.numero = numero;
    }

    @Override
    public void imprimir() {
        System.out.println("Hoja");
        System.out.println(numero);
    }

    @Override
    public void insertar(int numero) {
        estado.setEstado(new Composite(new ListaHoja(numero), 
                                       new ListaHoja(this.numero)));
    }

}
