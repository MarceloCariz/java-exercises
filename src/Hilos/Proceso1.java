package Hilos;

public class Proceso1 extends Thread {
    /// Run viene de la clase run
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++){
            System.out.println("Proceso 1");
        }
    }
}
