public class ContratacaoAerea extends Contratacao {

    @Override
    protected Frete criarFrete() {
        return new FreteAereo();
    }
}
