/*
1. Não será permitido o uso de IA na realização da avaliação, sob pena de zeramento da nota.
Códigos com taxa de similaridade acima de 85% serão considerados cópias e a nota será zerada.
*/
public class Main {

    public static void main(String[] args) {
        Assinatura brasil = new Assinatura("Empresa Alfa Ltda", 1000.00, new FabricaBrasil());
        Assinatura mexico = new Assinatura("Empresa Beta S.A. de C.V.", 1000.00, new FabricaMexico());

        brasil.ativar();
        mexico.ativar();
    }
}
