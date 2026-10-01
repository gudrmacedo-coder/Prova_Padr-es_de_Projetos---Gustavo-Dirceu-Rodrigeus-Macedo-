/*
1. Não será permitido o uso de IA na realização da avaliação, sob pena de zeramento da nota.
Códigos com taxa de similaridade acima de 85% serão considerados cópias e a nota será zerada.
*/
public class Main {

    public static void main(String[] args) {
        
        Contratacao rodoviaria = new ContratacaoRodoviaria();
        Contratacao aerea = new ContratacaoAerea();
        Contratacao maritima = new ContratacaoMaritima();

        rodoviaria.contratar("Indústria Alfa Ltda", 100000.00);
        aerea.contratar("Comércio Beta S.A.", 50000.00);
        maritima.contratar("Exportadora Gama", 200000.00);
    }
}
