public class FabricaMexico implements FabricaAssinatura {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new CFDI();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoSpei();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLfpdppp();
    }
}
