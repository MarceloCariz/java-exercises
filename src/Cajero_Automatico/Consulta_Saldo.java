package Cajero_Automatico;

public class Consulta_Saldo extends ClasePadre{
    @Override
    public void Transacciones(){
        System.out.println("-----------------------------------");
        System.out.println("Tu saldo actual es: "+ getSaldo());
        System.out.println("-----------------------------------");
    }
}
