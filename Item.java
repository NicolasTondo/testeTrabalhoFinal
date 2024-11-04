public class Item {
    private String codigo;
    private String descricao;
    private Categoria categoria;
    private Cliente cliente;
    private double volume;
    private double valorDeclarado;
    private Situacao situacao;

    public Item(String codigo, String descricao, Categoria categoria, Cliente cliente, double volume, double valorDeclarado, Situacao situacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.cliente = cliente;
        this.volume = volume;
        this.valorDeclarado = valorDeclarado;
        this.situacao = situacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getVolume() {
        return volume;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
}

