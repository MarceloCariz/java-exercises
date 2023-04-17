package Hilos;

// Segunda manera de hacer , no hay una diferencia como tal
public class Proceso2 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++){
            System.out.println("Proceso 2");
        }
    }
}
