package exemplos.consumersfunctions;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class AppUsandoAndThen {
    public static void main(String[] args) {
        // Criando um Consumer para imprimir os detalhes do ProdutoDTO
        Consumer<ProdutoDTO> imprimirDetalhes = produto -> {
            System.out.println("Nome do produto: " + produto.getNome());
            System.out.println("Preço do produto: " + produto.getPreco());
        };

        // Criando um Consumer para validar se o preço do ProdutoDTO é maior que 0
        Consumer<ProdutoDTO> validarPreco = produto -> {
            if (produto.getPreco().compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("Preço inválido para o produto: " + produto.getNome());
            }
        };

        Consumer<ProdutoDTO> atualizarDisponibilidade = produto -> {
            //0 se o preço do produto for igual a 2500.00.
            if (produto.getPreco().compareTo(new BigDecimal("2500.00")) < 0) {
                produto.setDisponivel(Boolean.FALSE);
                System.out.println("Disponibilidade do produto atualizada para: " + produto.isDisponivel());
            }else {
                produto.setDisponivel(Boolean.TRUE);
                System.out.println("Disponibilidade do produto atualizada para: " + produto.isDisponivel());
            }
        };

        // Usando o método andThen para encadear os Consumers
        Consumer<ProdutoDTO> imprimirEValidar = imprimirDetalhes
                .andThen(validarPreco)
                .andThen(atualizarDisponibilidade);

        ProdutoDTO produto = new ProdutoDTO("Notebook", new BigDecimal("1500.00"));
//        ProdutoDTO produto = new ProdutoDTO("Notebook", new BigDecimal(0));

        // Aplicando o Consumer
        imprimirEValidar.accept(produto);
    }
}