public class PessoaFisica extends Contribuinte{
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public PessoaFisica(String nome, Double renda, TipoPessoa tipoPessoa, String CPF) {
        super(nome, renda, tipoPessoa);
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica: " + super.toString() +
                ", CPF='" + CPF + '\'';
    }

    @Override
    public double calculaImposto() {
        double imposto = getRenda()*0.15;
        System.out.println("A pessoa Fisica " + getNome() + " ira pagar " + imposto);
        return imposto;
    }
}
