import java.util.Scanner;
public class Gerente extends Conta {

    public void adicionarNovoCliente(Double saldo, String email, String endereco, int tipoConta, int numero, String nome,
                                     String senha) {
        System.out.println("----------------------------------------------");
        Cliente cliente = new Cliente(saldo, email, endereco, tipoConta, numero, nome, senha);
        Banco.clientes.add(cliente);
        System.out.println("Cliente: " + nome + ". Adicionado com sucesso.");
    }

    public void exibirDadosDeUmCliente(Integer conta) {
        System.out.println("----------------------------------------------");
        Cliente cliente = Banco.clientes.get(conta);


                System.out.println("Conta: " + cliente.getNumero());
                System.out.println("Senha: " + cliente.getSenha());
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Endereco: " + cliente.getEndereco());
                System.out.println("Email: " + cliente.getEmail());
                if (cliente.getTipoConta() == 1) {
                    System.out.println("Tipo da Conta: Gold");
                } else if (cliente.getTipoConta() == 2) {
                    System.out.println("Tipo da Conta: Black");
                } else if (cliente.getTipoConta() == 3) {
                    System.out.println("Tipo da Conta: Standard");
                }
    }

    public void removerCliente(int conta) {
        System.out.println("----------------------------------------------");
        for (Cliente cliente : Banco.clientes) {
            if (cliente.getNumero() == conta) {
                System.out.println("Cliente: " + cliente.getNome());
                Banco.clientes.remove(cliente);
                System.out.println("Removido com sucesso.");
            }
        }

    }

    public void listarClientes() {
        System.out.println("----------------------------------------------");
        for (Cliente cliente : Banco.clientes) {
            System.out.println("Conta: " + cliente.getNumero() + ", Nome: " + cliente.getNome());
        }
    }

    public void editarCliente(int conta, double saldo, String email, String endereco, int tipoConta) {
        System.out.println("----------------------------------------------");
        for (Cliente cliente : Banco.clientes) {
            if (cliente.getNumero() == conta) {
                System.out.println("Cliente: " + cliente.getNome());
                cliente.setSaldo(saldo);
                cliente.setEmail(email);
                cliente.setEndereco(endereco);
                cliente.setTipoConta(tipoConta);
                System.out.println("Editado com sucesso.");
            }
        }
    }

    public void visualizarRendaCliente(int conta) {
        System.out.println("----------------------------------------------");
        for (Cliente cliente : Banco.clientes) {
            if (cliente.getNumero() == conta) {
                if (cliente.getTipoConta() == 1) {
                    System.out.println("Rendimento: 0,01%");
                } else if (cliente.getTipoConta() == 2) {
                    System.out.println("Rendimento: 0,04%");
                } else if (cliente.getTipoConta() == 3) {
                    System.out.println("Rendimento: 0,00%");
                }
            }
        }
    }
}
