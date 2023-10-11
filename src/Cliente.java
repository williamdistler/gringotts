import java.sql.SQLOutput;
import java.time.LocalDate;

public class Cliente extends Conta {

    public Cliente(Double saldo, String email, String endereco, int tipoConta, int numero, String nome, String senha) {
        this.setSaldo(saldo);
        this.setEmail(email);
        this.setEndereco(endereco);
        this.setTipoConta(tipoConta);
        this.setNumero(numero);
        this.setNome(nome);
        this.setSenha(senha);
    }

    public void adicionarClienteNaLista(Cliente cliente) {
        Banco.clientes.add(cliente);
    }
    private void depositarDinheiroNaConta(int conta, Double valor) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Valor a ser inserido na conta: R$" + valor);
        for (Cliente cliente : Banco.clientes) {
            if (cliente.getNumero() == conta) {
                cliente.setSaldo(cliente.getSaldo() + valor);
                System.out.println("Saldo atual: " + cliente.getSaldo());
            }
        }
    }

    void verSaldoNaConta(int conta) {
        System.out.println("--------------------------------------------------------------");
        for (Cliente cliente : Banco.clientes) {
            if (cliente.getNumero() == conta) {
                System.out.println("Saldo: " + cliente.getSaldo());
            }
        }
    }

    public void sacarDinheiroDaConta(int conta, Double valor) {
        System.out.println("--------------------------------------------------------------");
        for (Cliente cliente : Banco.clientes) {
            if (cliente.getNumero() == conta) {
                if (cliente.getSaldo() > valor) {
                    System.out.println("Saldo: " + cliente.getSaldo());
                    cliente.setSaldo(cliente.getSaldo() - valor);
                    System.out.println("R$" + valor + " resgatado com sucesso;");
                    System.out.println("Saldo: " + cliente.getSaldo());
                } else {
                    System.out.println("Saldo: " + cliente.getSaldo());
                    System.out.println("Saldo insuficiente para realizar saque.");
                }
            }
        }
    }

    public void editarEmail(int conta, String email) {
        System.out.println("--------------------------------------------------------------");
        for (Cliente cliente : Banco.clientes) {
            if (cliente.getNumero() == conta) {
                System.out.println("Antigo email: " + cliente.getEmail());
                cliente.setEmail(email);
                System.out.println("Novo email: " + cliente.getEmail());
            }
        }
    }

    public void editarEndereco(int conta, String endereco) {
        System.out.println("--------------------------------------------------------------");
        for (Cliente cliente : Banco.clientes) {
            if (cliente.getNumero() == conta) {
                System.out.println("Antigo endereco: " + cliente.getEndereco());
                cliente.setEndereco(endereco);
                System.out.println("Novo endereco: " + cliente.getEndereco());
            }
        }
    }

    private void renderSaldo() {
        System.out.println("--------------------------------------------------------------");
        LocalDate hoje = LocalDate.now();

        for (Conta conta : Banco.clientes) {
            if (hoje.getDayOfMonth() == 1) {
                if (conta.getTipoConta() == 1) {
                    System.out.println("Rendimento de 0.01%");
                    conta.setSaldo(conta.getSaldo() + (conta.getSaldo() * (0.01/100)));
                } else if (conta.getTipoConta() == 2 ) {
                    System.out.println("Rendimento de 0.04%");
                    conta.setSaldo(conta.getSaldo() + (conta.getSaldo() * (0.04/100)));
                }
                System.out.println("Saldo atualizado com rendimento.");
            }
        }

    }

}
