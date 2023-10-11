public class Conta {

    private Double saldo;
    private String email;
    private String endereco;
    //Gold = 1; Black = 2; Standard = 3; Gerente = 4;
    private int tipoConta;
    private int numero;
    private String nome;
    private String senha;

    public void setSaldo(Double valor) {
        this.saldo = valor;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getTipoConta() {
        return this.tipoConta;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
