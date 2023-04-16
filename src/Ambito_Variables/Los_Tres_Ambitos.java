package Ambito_Variables;

public class Los_Tres_Ambitos {

    /// Los_Tres_Ambitos.variableEstatica;
    static int variableEstatica; // se puede acceder en otras clases sin hacer un objeto

    int variableGlobal; // no se inicializa , dentro de la clase

    void miMetodo(int parametro){
        // Solo se usan dentro del mismo metodo
        int variableLocal = 0; // se debe inicializar o hay error
    }
}
