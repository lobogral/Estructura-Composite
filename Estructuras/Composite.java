package Estructuras;

class Composite implements Lista{

    private Lista lista;
    private final Hoja hoja;

    public Composite(Lista lista, Hoja hoja){
        this.lista = lista;
        this.hoja = hoja;
    }

    @Override
    public void imprimir() {
        System.out.println("Composite");
        hoja.imprimir();
        lista.imprimir();
    }

    void insertar(int numero) {
        if ("Hoja".equals(lista.getClass().getSimpleName())){
            lista = new Composite(new Hoja(numero), (Hoja) lista);
        } else {
            Composite listaTemporal = (Composite) lista;
            listaTemporal.insertar(numero);
        }
    }
    

}