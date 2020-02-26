package Estructuras.Cola;

class ELista implements Estructura {

    private ELista lista;
    private final int numero;

    public ELista(ELista lista, int hoja){
        this.lista = lista;
        this.numero = hoja;
    }
    
    public ELista(int hoja){
        this.numero = hoja;
    }

    public void setELista(ELista lista){
        this.lista = lista;
    }
    
    @Override
    public Estructura insertar(int numero) {
        System.out.println("" + numero);
        lista = new ELista(lista, numero);            
        return lista;
    }

    @Override
    public Estructura eliminar() {
        System.out.println("" + lista.numero);
        System.out.println("----");
        if(lista.lista == this){
            return new EHoja(numero);
        } else {
            lista = lista.lista;
            return this;
        }
    }

}