package ModificadoresAcceso.paquete1;

public class Atributo_Metodos {
    ////Por defecto  ej: int valorUno
    /// Solo se pueden acceder a estos atributos si se esta en el mismo paquete
    /// Public metodos y atributos public int valorUno
    public int valorUno;
    public int valorDos;
    public String valorTres;
    ////

    public void metodoPublico(){
        System.out.println("Desde metodo publico");
    }

    // Private solo se pueden acceder por getter y setter

    private int valorPrivado;
    private void metodoPrivado(){
        System.out.println("Desde metodo privado");
    }

    public int get_valorPrivado(){
        return valorPrivado;
    }

    public void set_valorPrivado(int valorPrivado){
        this.valorPrivado = valorPrivado;
    }

    // Protected
    protected String valorProtected;




}
