package org.example;

import entities.Produto;
import exportList.ExportadorListaProduto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Produto produto1 = new Produto("Geladeira",2800.00,5);
        Produto produto2 = new Produto("Fogão",800.00,50);
        List<Produto> produtos = List.of(produto1,produto2);

        var nomeArquivo = "tabela.html";
        var nomeArquivoMd = "tabela.md";
        var nomeArquivoCsv = "tabela.csv";
        var export = ExportadorListaProduto.newInstance(nomeArquivoCsv).exportar(produtos);
        //Files.writeString(Paths.get(nomeArquivo), export);

        System.out.println(export);
    }
}