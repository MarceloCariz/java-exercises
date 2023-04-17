package Excepciones;

import java.util.Scanner;

public class ClaseDivision {
    public static void main(String[] args) {


        int valor1, valor2, resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.println("Dame el segundo valor: ");
        valor2 = entrada.nextInt();



        try{
            resultado = valor1 / valor2;
            System.out.println("Division es igual a: " + resultado);
        }catch (Exception e){
            System.out.println("Hubo un error");
            System.out.println(e);
        }finally {
            System.out.println("Operacion concluida");
        }


    }
}
