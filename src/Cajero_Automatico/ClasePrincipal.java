package Cajero_Automatico;

public class ClasePrincipal{
    public static void main(String[] args) {
        // No se puede instanciar una clase abstracta
        ClasePadre padre = new Consulta_Saldo();
        padre.setSaldo(600);
        padre.Operaciones();
    }
}
