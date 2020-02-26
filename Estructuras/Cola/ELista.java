package Estructuras.Cola;

class ELista implements Estructura {

    private ELista lista;
    private final int numero;
    private static int numElems = 2;
    
    public ELista(int hoja){
        this.numero = hoja;
    }

    public void setELista(ELista lista){
        this.lista = lista;
    }
    
    @Override
    public String imprimir() {
        return imprimir(numElems);
    }
    
    private String imprimir(int numElems){
        if(numElems > 1){
            return lista.numero + ", " + lista.imprimir(numElems - 1);
        } else {
            return "" + lista.numero;
        }
    }
    
    @Override
    public Estructura insertar(int numero) {
        numElems++;
        ELista nuevo = new ELista(numero);
        nuevo.setELista(lista);
        return lista = nuevo; 
    }

    @Override
    public Estructura eliminar() {
        numElems = (numElems == 2 ? numElems : numElems - 1);
        if(lista.lista == this){
            return new EHoja(numero);
        } else {
            lista = lista.lista;
            return this;
        }
    }

}