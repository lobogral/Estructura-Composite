

public class Hoja implements Estructura{

    private final int numero;

    public Hoja(int numero){
        this.numero = numero;
    }

    @Override
    public void imprimir() {
        System.out.println(numero);
    }

}