package Hilos.ConParametros;

public class Proceso extends Thread{

    int limit;

    public  Proceso (String NombreHilo){
        super(NombreHilo);
    }

    @Override
    public void run(){
        for (int i = 0; i <= limit; i++){
            System.out.println(i + this.getName());
        }
        System.out.println("------------------");
    }

    public void ValorLimit(int valor){
        this.limit = valor;
    }
}
