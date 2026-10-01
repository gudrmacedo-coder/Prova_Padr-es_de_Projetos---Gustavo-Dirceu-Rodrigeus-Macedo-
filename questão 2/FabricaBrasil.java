public class FabricaBrasil implements FabricaAssinatura {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new NFSe();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoPix;
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLgpd();
    }
}
