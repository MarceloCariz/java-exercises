package Polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre{
    // Sobreescribir un metodo, ya que existe en otra clase
    @Override
    public void Operaciones(){
        resultado = valor1 + valor2;
    }
}
