public class Main {
    public static void main(String[] args) {
        Contribuinte pessoaFisica = new PessoaFisica("Nath", 20000.0, TipoPessoa.PF, "111.111.111-11");
        pessoaFisica.calculaImposto();

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Ana", 2000.0, TipoPessoa.PJ, "22.222.222/2222-22");
        pessoaJuridica.calculaImposto();

        Contribuinte generico = new Contribuinte("pedro", 7000.0, TipoPessoa.PF);
        generico.calculaImposto();

        alterarRenda(2000.0, pessoaFisica);
        alterarRenda(6000.0, pessoaJuridica);

        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);
    }

    public static void alterarRenda(Double incremento, Contribuinte contribuinte){
        Double aumentoRenda = contribuinte.getRenda() + incremento;
        contribuinte.setRenda(aumentoRenda);
        System.out.println("A nova renda do(a) " + contribuinte.getNome() + " é de: " + contribuinte.getRenda());
        contribuinte.calculaImposto();
    }
}