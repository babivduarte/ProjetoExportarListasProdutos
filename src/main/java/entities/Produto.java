package entities;

public class Produto {
    private String descricao;
    private Double valor;
    private Integer qtdeEstoque;

    public Produto(String descricao, Double valor, Integer qtdeEstoque) {
        this.descricao = descricao;
        this.valor = valor;
        this.qtdeEstoque = qtdeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(Integer qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", qtdeEstoque=" + qtdeEstoque +
                '}';
    }
}
