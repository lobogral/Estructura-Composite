package Estructuras;

class Composite implements Lista{

    private Lista estructura;
    private final Hoja hoja;

    public Composite(int numeroTemporal, int numero){
        hoja = new Hoja(numeroTemporal);
        estructura = new Hoja(numero);
    }

    @Override
    public void imprimir() {
        System.out.println("Composite");
        hoja.imprimir();
        estructura.imprimir();
    }

    public void insertar(int numero){
        if ("Hoja".equals(estructura.getClass().getSimpleName())){
            Hoja hojaTemporal = (Hoja) estructura;
            int numeroTemporal = hojaTemporal.getNumero();
            estructura = new Composite(numeroTemporal, numero);
        } else {
            Composite listaTemporal = (Composite) estructura;
            listaTemporal.insertar(numero);
        }
    }

}