public class PagamentoSpei implements ProcessadorPagamento {

    @Override
    public String processar(double valor) {
        return String.format("Pagamento via SPEI (México) - $ %.2f", valor);
    }
}
