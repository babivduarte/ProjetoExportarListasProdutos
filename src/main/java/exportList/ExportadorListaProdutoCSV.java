package exportList;

public class ExportadorListaProdutoCSV extends AbstractExportadorListaProduto{
    @Override
    public String abrirTabela() {
        return "\n";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "";
    }

    @Override
    public String fecharLinhaTitulos() {
        return ",";
    }

    @Override
    public String abrirColuna(String valor) {
        return "";
    }

    @Override
    public String fecharColuna() {
        return ",";
    }

}
