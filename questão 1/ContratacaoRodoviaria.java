public class ContratacaoRodoviaria extends Contratacao {

    @Override
    protected Frete criarFrete() {
        return new FreteRodoviario;
    }
}
