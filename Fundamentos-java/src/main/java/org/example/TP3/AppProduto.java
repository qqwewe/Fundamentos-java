package org.example.TP3;

public class AppProduto {
    public static void main(String[] args) {
//        Produto produto = new Produto();

        Produto produto = new Produto("Leite Integral 1L", 4.99, 50);

//        produto.nome = "Arroz Branco 5kg";
//        produto.preco = 22.90;
//        produto.quantidadeEmEstoque = 100;
//
//        produto.alterarPreco(19.50);
//        produto.alterarQuantidade(80);

//        produto.setNome("Feijão Carioca");
//        produto.setPreco(8.75);
//        produto.setQuantidadeEmEstoque(200);

        produto.exibirInformacoes();
    }
}
