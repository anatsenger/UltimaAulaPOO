public class PessoaJuridica extends Contribuinte{
    private String CNPJ;

    public PessoaJuridica(String nome, Double renda, TipoPessoa tipoPessoa, String CNPJ) {
        super(nome, renda, tipoPessoa);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public double calculaImposto() {
        double imposto = getRenda()*0.25;
        System.out.println("A pessoa Juridica " + getNome() + " ira pagar " + imposto);
        return imposto;
    }

    @Override
    public String toString() {
        return "PessoaJuridica: " + super.toString() +
                ", CNPJ='" + CNPJ + '\'';
    }
}
