package Encapsulamiento;

public class LlFunciones {

    private int kilos = 0,  llenadoCompleto = 0,  tipoDeRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;


    /// Constructor que recibe variables  Llfunciones(kilos, tipodeRopa);
    public LlFunciones(int kilos, int tipoDeRopa){
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }

    private void Llenado(){
        if(kilos > 12){
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
            return;
        }
        llenadoCompleto = 1;
        System.out.println("Llenando...");
        System.out.println("LLenado completo.");
    }
    private void Lavado(){
        Llenado();
        if(llenadoCompleto == 0){
            System.out.println("Aun no esta llenado");
            return;
        };

        switch (tipoDeRopa){
            case 1 :
                System.out.println("Ropa blanca / lavado suave");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
                return;
            case  2 :
                System.out.println("Ropa color / lavado suave");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
                return;
            default:
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de color / Lavado intenso");
                lavadoCompleto = 1;
        }
    }

    private void Secado(){
        Lavado();
        if(lavadoCompleto == 0) {
            System.out.println("Aun no se termina de lavar");
            return;
        }

        System.out.println("Secando ...");
        secadoCompleto = 1;
    }

    public void CicloFinalizado(){
        Secado();
        if(secadoCompleto == 0) return;
        System.out.println("Tu ropa esta lista");
    }

    //Setter y Getter, consultar o modificar variables/atributos

    public int getTipoDeRopa(){
        return tipoDeRopa;
    }

    public void setTipoDeRopa(int tipoDeRopa){
        this.tipoDeRopa = tipoDeRopa;
    }




}
