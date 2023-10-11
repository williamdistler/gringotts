public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gerente gerente = new Gerente();
        Cliente cliente = new Cliente(1000.00, "fulano@gmail.com", "estrada de itapecerica, 5859", 2, 2, "Yuri", "12345");
        cliente.adicionarClienteNaLista(cliente);
        gerente.adicionarNovoCliente(10000.00, "fulano.ciclano@gmail.com", "estrada de itapecerica, 5859", 1, 1, "William", "12345");
        cliente.verSaldoNaConta(2);
        cliente.sacarDinheiroDaConta(1, 5000.00);
        cliente.editarEmail(1, "william.distler@outlook.com");
        cliente.editarEndereco(2, "Tatuape, 669");
        gerente.exibirDadosDeUmCliente(2);
        gerente.removerCliente(2);
        gerente.listarClientes();
        gerente.editarCliente(1, 1000000, "will.distler@icloud.com", "tubarao, 5859", 3);
        gerente.visualizarRendaCliente(1);
    }
}