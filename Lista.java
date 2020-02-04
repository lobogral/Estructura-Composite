

public class Lista implements Estructura{

    private final Estructura estructura;
    private final Hoja hoja;

    public Lista(Hoja hoja, Estructura estructura){
        this.estructura = estructura;
        this.hoja = hoja;
    }

    @Override
    public void imprimir() {
        hoja.imprimir();
        estructura.imprimir();
    }

}