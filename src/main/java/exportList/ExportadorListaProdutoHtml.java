package exportList;

public class    ExportadorListaProdutoHtml extends AbstractExportadorListaProduto{
    @Override
    public String abrirTabela() {
        return "<table>\n";
    }

    @Override
    public String fecharTabela() {
        return "</table>";
    }

    @Override
    public String abrirLinha() {
        return "<tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "<th>";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "</th>";
    }

    @Override
    public String abrirColuna(String valor) {
        return "<td>";
    }

    @Override
    public String fecharColuna() {
        return "</td>";
    }

}
