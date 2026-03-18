public class Dados {

    private String nome;
    private String endereco;
    private String bairro;
    private int numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Dados(String nome, String endereco, String bairro, int numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.numero = numero;


    }
}
