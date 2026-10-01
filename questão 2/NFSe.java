public class NFSe implements ComprovanteFiscal {

    private static final double ISS = 0.05;

    @Override
    public String emitir(double valor) {
        double imposto = valor * ISS;
        return String.format("NFS-e (Brasil) - valor R$ %.2f, ISS de 5%%: R$ %.2f", valor, imposto);
    }
}
