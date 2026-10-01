public class CFDI implements ComprovanteFiscal {

    private static final double IVA = 0.16;

    @Override
    public String emitir(double valor) {
        double imposto = valor * IVA;
        return String.format("CFDI (México) - valor $ %.2f, IVA de 16%%: $ %.2f", valor, imposto);
    }
}
