

public class Composite {

    public static void main(String[] args) {
        Estructura lista = new Lista(new Hoja(5),
                           new Lista(new Hoja(4),
                           new Hoja(3)));
        
        lista.imprimir();
    }

}