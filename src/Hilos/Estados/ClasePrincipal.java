package Hilos.Estados;

public class ClasePrincipal {
    public static void main(String[] args) {
        // Esta nuevo - new
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();

        // Estado ejecutable - runnable
        hilo1.start();

        try{
            /// Estado dormido
            hilo1.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Error en el hilo1 " + e);
        }

        hilo2.start();
        hilo2.stop();
        try{
            hilo2.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Error en el hilo 2 " + e);
        }




    }
}
