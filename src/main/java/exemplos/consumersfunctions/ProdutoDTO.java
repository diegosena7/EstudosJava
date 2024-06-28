package exemplos.consumersfunctions;

import java.math.BigDecimal;

public class ProdutoDTO {
    private String nome;
    private String categoria;

    private BigDecimal preco;

    private boolean disponivel;

    public ProdutoDTO(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public ProdutoDTO(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public BigDecimal setPreco(BigDecimal preco) {
        return preco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ProdutoDTO{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
