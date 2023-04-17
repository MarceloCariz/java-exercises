package Hilos;

public class ClasePrincipal {
    public static void main(String[] args) {
        /// No se usan hilos
//        for (int i = 0; i <= 5; i++){
//            System.out.println("Proceso 1");
//        }
//        System.out.println("---------------------------------------");
//        for (int i = 0; i <= 5; i++){
//            System.out.println("Proceso 2");
//        }
        Proceso1 hilo1 = new Proceso1();

        /// Con implements
        Thread hilo2 = new Thread(new Proceso2());

        // Metodo para arrancar los hilos, se ejecutan de manera simultanea, depende del procesador
        /// Cada resultado es diferente
        hilo1.start();
        hilo2.start();
    }
}
