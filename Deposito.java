public class Deposito {
    private int codigo;
    private String nome;
    private String cidade;
    private String endereco;
    private double capacidadeMaxima;

    public Deposito(int codigo, String nome, String cidade, String endereco, double capacidadeMaxima) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    @Override
    public String toString() {
        return 
            "Deposito: " +
            "Codigo" + codigo +
            "\nNome" + nome +
            "\nCidade" + cidade +
            "\nEndereco" + endereco +
            "\nCapacidadeMaxima" + capacidadeMaxima;
    }
}
