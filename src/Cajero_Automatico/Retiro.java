package Cajero_Automatico;

public class Retiro extends ClasePadre{
    @Override
    public void Transacciones(){
        System.out.print("Cuanto deseas retirar: ");
        Retiro();
        if(retiro > getSaldo()){
            System.out.println("-----------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("-----------------------");
            return;
        }

        transacciones = getSaldo();
        setSaldo(transacciones - retiro);
        System.out.println("----------------------------");
        System.out.println("Retiraste : "+ retiro);
        System.out.println("Tu actual es: " + getSaldo());
        System.out.println("----------------------------");

    }
}
