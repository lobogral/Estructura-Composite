package Estructuras;

class EstadoVacio implements Estado {

    private final Contenedor estado;
    
    public EstadoVacio(Contenedor estado){
        this.estado = estado;
    }

    @Override
    public void imprimir() {
        System.out.println("Vacio");
        System.out.println("No hay elementos");
    }

    @Override
    public void insertar(int numero) {
        estado.setEstado(new EstadoHoja(estado, numero));
    }

}