package Estructuras;

class EHoja implements Estructura {

    private final int numero;

    public EHoja(int numero){
        this.numero = numero;
    }

    @Override
    public void imprimir() {
        System.out.println("Hoja");
        System.out.println(numero);
    }

    @Override
    public Estructura insertar(int numero) {
        return new EComposite(new EHoja(numero), new EHoja(this.numero));
    }

}
