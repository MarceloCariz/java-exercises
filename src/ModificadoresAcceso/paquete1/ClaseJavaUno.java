package ModificadoresAcceso.paquete1;

public class ClaseJavaUno {
    public static void main(String[] args) {
        Atributo_Metodos mensajero = new Atributo_Metodos();
        System.out.println(mensajero.valorDos);
        // Private
        mensajero.set_valorPrivado(10);
        System.out.println(mensajero.get_valorPrivado());
        // Protected
        System.out.println("Atributo protected " + mensajero.valorProtected);
    }
}
