package exemplos.consumersfunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        // Criando uma lista de produtos DTO
        List<ProdutoDTO> produtos = Arrays.asList(
                new ProdutoDTO("Celular", "Eletrônicos"),
                new ProdutoDTO("TV", "Eletrônicos"),
                new ProdutoDTO("Notebook", "Eletrônicos"),
                new ProdutoDTO("Camisa", "Moda"),
                new ProdutoDTO("Calça", "Moda")
        );

        // Criando um Consumer para filtrar e "salvar" os produtos
        Consumer<String> salvarProdutos = categoria -> {
            List<ProdutoDTO> produtosFiltrados = produtos.stream()
                    .filter(produto -> produto.getCategoria().equals(categoria))
                    .toList();

            // Simulando a "salva" dos produtos filtrados
            System.out.println("Produtos da categoria " + categoria + ":");
            produtosFiltrados.forEach(System.out::println);
            System.out.println("Salvando os produtos da categoria " + categoria + "...");
            System.out.println();
        };

        // Utilizando o Consumer para filtrar e "salvar" produtos por categoria
        salvarProdutos.accept("Eletrônicos");
        salvarProdutos.accept("Moda");
    }
}
