package exemplos.consumersfunctions;

import java.math.BigDecimal;
import java.util.function.Function;

public class AppUsandoFunction {
    public static final Function<ProdutoDTO, ProdutoDTO> verificarDisponibilidade = produto -> {
        BigDecimal precoLimite = new BigDecimal("2500.00");
        if (produto.getPreco().compareTo(precoLimite) < 0) {
            produto.setDisponivel(Boolean.FALSE);
        } else {
            produto.setDisponivel(Boolean.TRUE);
        }
        return produto;
    };

    public static final Function<String, User> criaUserPelaString = text -> {
        String[] parts = text.split(",");
        String name = parts[0].trim();
        int age = Integer.parseInt(parts[1].trim());
        String email = parts[2].trim();
        return new User(name, age, email);
    };

    public static void main(String[] args) {
        ProdutoDTO produto = new ProdutoDTO("Notebook", new BigDecimal("2000.00"));
        ProdutoDTO resultado = verificarDisponibilidade.apply(produto);
        System.out.println("Produto: " + resultado.getNome() + ", Disponível: " + resultado.isDisponivel());

        String input = "John Doe, 30, john.doe@example.com";
        User user = criaUserPelaString.apply(input);
        System.out.println("User: " + user);
    }
}
