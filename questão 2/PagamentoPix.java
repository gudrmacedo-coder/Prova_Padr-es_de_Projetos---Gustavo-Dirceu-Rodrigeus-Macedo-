public class PagamentoPix implements ProcessadorPagamento {

    @Override
    public String processar(double valor) {
        return String.format("Pagamento via Pix (Brasil) - R$ %.2f", valor
    }
}
