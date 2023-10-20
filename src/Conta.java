public class Conta {
    public Double saldo;
    public String email;
    public String endereco;
    //Gold = 1; Black = 2; Standard = 3; Gerente = 4;
    public TipoConta tipoConta;
    public int numero;
    public String nome;
    public String senha;

    public Conta(Double saldo, String email, String endereco, TipoConta tipoConta, int numero, String nome, String senha) {
        this.saldo = saldo;
        this.email = email;
        this.endereco = endereco;
        this.tipoConta = tipoConta;
        this.numero = numero;
        this.nome = nome;
        this.senha = senha;
    }
}
