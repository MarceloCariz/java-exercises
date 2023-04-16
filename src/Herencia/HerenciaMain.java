package Herencia;

import java.util.Scanner;

public class HerenciaMain {
    public static void main(String[] args) {
        ClaseHija_Suma suma = new ClaseHija_Suma();
        ClaseHija_Resta resta = new ClaseHija_Resta();

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Selecciona una opcion 1.Suma /  2.Resta");

        int opcion = scanner.nextInt();
        System.out.println(opcion);
        switch (opcion){
            case 1 :
                suma.PedirDatos();
                suma.Sumar();
                suma.MostrarResultado();
                return;
            case 2 :
                resta.PedirDatos();
                resta.Restar();
                resta.MostrarResultado();
                return;
            default:
                System.out.println("Opcion no valida");
                break;
        }


    }
}
