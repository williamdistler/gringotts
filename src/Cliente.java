import java.sql.SQLOutput;
import java.time.LocalDate;

public class Cliente {

    public Conta conta;

    public Cliente(Conta conta) {
        this.conta = conta;
        Banco.clientes.put(conta.numero, this);
    }

    private void depositarDinheiroNaConta(Double valor) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Valor a ser inserido na conta: R$" + valor);
        conta.saldo = conta.saldo + valor;
        System.out.println("Saldo atual: " + conta.saldo);

    }

    void verSaldoNaConta() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Saldo: " + conta.saldo);
    }

    public void sacarDinheiroDaConta(Double valor) {
        System.out.println("--------------------------------------------------------------");
        if(conta.saldo < valor) {
            System.out.println("Saldo: " + conta.saldo);
            System.out.println("Saldo insuficiente para realizar saque.");
            return;
        }
        System.out.println("Saldo: " + conta.saldo);
        conta.saldo = conta.saldo - valor;
        System.out.println("R$" + valor + " resgatado com sucesso;");
        System.out.println("Saldo: " + conta.saldo);
    }

    public void editarEmail(String email) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Antigo email: " + conta.email);
        conta.email = email;
        System.out.println("Novo email: " + conta.email);
    }

    /*
    * TODO: Corrigir isso aqui!
     */
    public void editarEndereco(int conta, String endereco) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Antigo endereco: " + cliente.getEndereco());
        conta.endereco = endereco;
        System.out.println("Novo endereco: " + cliente.getEndereco());
    }

    private void renderSaldo() {
        System.out.println("--------------------------------------------------------------");
        LocalDate hoje = LocalDate.now();

                if (conta.getTipoConta() == 1) {
                    System.out.println("Rendimento de 0.01%");
                    conta.setSaldo(conta.getSaldo() + (conta.getSaldo() * (0.01/100)));
                } else if (conta.getTipoConta() == 2 ) {
                    System.out.println("Rendimento de 0.04%");
                    conta.setSaldo(conta.getSaldo() + (conta.getSaldo() * (0.04/100)));
                }
                System.out.println("Saldo atualizado com rendimento.");


}
