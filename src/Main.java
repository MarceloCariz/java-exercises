import Encapsulamiento.LlFunciones;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        //* Encapsulamiento
        Scanner entrada = new Scanner(System.in);
        System.out.println("La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa color");
        int tipoDeRopa = entrada.nextInt();


        System.out.println("Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();

        LlFunciones estado = new LlFunciones(kilos , tipoDeRopa);
        // Alterar con setter
        estado.setTipoDeRopa(3);
        System.out.println("El tipo de ropa es"+ estado.getTipoDeRopa());
        estado.CicloFinalizado();
    }
}