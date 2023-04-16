package Herencia;

import java.util.Scanner;

public class clasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    // Este metodo pide los valores al usuario
    public void PedirDatos(){
        System.out.println("Dame el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.println("Dame el segundo valor");
        valor2 = entrada.nextInt();
    }

    public void MostrarResultado(){
        System.out.println("El resultado es: " + resultado);
    }
}
