public class ContratacaoMaritima extends Contratacao {

    @Override
    protected Frete criarFrete() {
        return new FreteMaritimo();
    }
}
