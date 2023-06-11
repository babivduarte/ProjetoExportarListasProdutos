package exportList;

import entities.Produto;

import java.util.List;

public interface ExportadorListaProduto {
    public String abrirTabela();
    public String fecharTabela();
    public String abrirLinha();
    public String fecharLinha();
    public String abrirLinhaTitulos();
    public String fecharLinhaTitulos();
    public String abrirColuna(String valor);
    public String fecharColuna();
    public String exportar(List<Produto> listaProdutos);
    static ExportadorListaProduto newInstance(){
        return new ExportadorListaProdutoHtml();
    }
    static ExportadorListaProduto newInstance(String extensaoArquivoExportacao){
        if (extensaoArquivoExportacao.endsWith("html"))
            return new ExportadorListaProdutoHtml();
        if (extensaoArquivoExportacao.endsWith("md"))
            return new ExportadorListaProdutoMarkdown();
        if (extensaoArquivoExportacao.endsWith("csv"))
            return new ExportadorListaProdutoCSV();
        throw new UnsupportedOperationException("Formato não suportado! Insira um arquivo HTML, MD ou CSV.");
    }

}
