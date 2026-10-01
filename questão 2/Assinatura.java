
public class Assinatura {

    private final String cliente;
    private final double valor;
    private final ComprovanteFiscal comprovante;
    private final ProcessadorPagamento pagamento;
    private final TermoPrivacidade termo;

    public Assinatura(String cliente, double valor, FabricaAssinatura fabrica) {
        this.cliente = cliente;
        this.valor = valor;
        this.comprovante = fabrica.criarComprovanteFiscal();
        this.pagamento = fabrica.criarProcessadorPagamento();
        this.termo = fabrica.criarTermoPrivacidade();
    }

    public void ativar() {
        System.out.println("===== Assinatura ativada =====");
        System.out.println("Cliente.......: " + cliente);
        System.out.println("Comprovante...: " + comprovante.emitir(valor));
        System.out.println("Pagamento.....: " + pagamento.processar(valor));
        System.out.println("Privacidade...: " + termo.getDescricao());
        System.out.println();
    }
}
