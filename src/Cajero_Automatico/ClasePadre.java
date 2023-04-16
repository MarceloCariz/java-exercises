package Cajero_Automatico;


import java.util.Scanner;

public abstract class ClasePadre {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones(){
        int bandera = 0;
        int seleccion = 0;

        do{
            System.out.println("Por favor seleccione una opcion:");
            System.out.println("    1. Consulta de saldo");
            System.out.println("    2. Retiro de efectivo");
            System.out.println("    3. Deposito de efectivo");
            System.out.println("    4. Salir");
            seleccion = entrada.nextInt();

            switch (seleccion) {
                case 1:
                    ClasePadre consulta = new Consulta_Saldo();
                    consulta.Transacciones();
                    break;
                case 2:
                    ClasePadre retiro  = new Retiro();
                    retiro.Transacciones();
                    break;
                case 3:
                    ClasePadre deposito = new Deposito();
                    deposito.Transacciones();
                    break;
                case 4:
                    System.out.println("------------------------");
                    System.out.println("Sesion cerrada");
                    break;
                default:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Opcion no disponible, vuelva a intentar por favor");
                    System.out.println("--------------------------------------------------------");
            }
        }while(seleccion != 4);
    }

    //Metodo para solicitar cantidad de retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    }

    //Metodo para solicitar deposito
    public void Deposito(){
        deposito = entrada.nextInt();
    }

    //Metodo abstracto
    public abstract void Transacciones();

    // MEtodos setter y getter
    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

}
