package ModificadoresAcceso.paquete2;
import ModificadoresAcceso.paquete1.Atributo_Metodos;


public class ClaseJavaDos extends Atributo_Metodos {
    public static void main(String[] args) {
        Atributo_Metodos mensajero = new Atributo_Metodos();
        mensajero.metodoPublico();

        // private
        mensajero.set_valorPrivado(2);
        System.out.println(mensajero.get_valorPrivado());

        // Protected solo con herencia



    }
}
