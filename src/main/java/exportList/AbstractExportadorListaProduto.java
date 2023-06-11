package exportList;

import entities.Produto;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto{

    public static List<String> TITULOS_COLUNAS = List.of("Descrição","Valor","Qtde estoque");
    //organizar aqui a estrutura do arquivo que será gerado
    public String exportar(List<Produto> listaProdutos){
        var builder = new StringBuilder();

        builder.append(abrirTabela());
        //cabeçalho
        builder.append(abrirLinha());
        for (String tituloColuna : TITULOS_COLUNAS) {
            builder.append(abrirLinhaTitulos());
            builder.append(tituloColuna);
            builder.append(fecharLinhaTitulos());
        }
        builder.append(fecharLinha());
        //corpo da tabela
        for ( Produto produto: listaProdutos ) {
            builder.append(abrirLinha());

            builder.append(abrirColuna("descricao"));
            builder.append(produto.getDescricao());
            builder.append(fecharColuna());

            builder.append(abrirColuna("valor"));
            builder.append(produto.getValor());
            builder.append(fecharColuna());

            builder.append(abrirColuna("qtde"));
            builder.append(produto.getQtdeEstoque());
            builder.append(fecharColuna());

            builder.append(fecharLinha());
        }

        builder.append(fecharTabela());
        return builder.toString();
    }
}
