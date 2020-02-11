package Estructuras;

class Composite implements Estado, Lista{

    private Lista lista;
    private final ListaHoja hoja;

    public Composite(Lista lista, ListaHoja hoja){
        this.lista = lista;
        this.hoja = hoja;
    }

    @Override
    public void imprimir() {
        System.out.println("Composite");
        hoja.imprimir();
        lista.imprimir();
    }

    @Override
    public void insertar(int numero) {
        if ("ListaHoja".equals(lista.getClass().getSimpleName())){
            lista = new Composite(new ListaHoja(numero), 
                                      (ListaHoja) lista);
        } else {
            Composite listaComposite = (Composite) lista;
            listaComposite.insertar(numero);
        }
    }

}