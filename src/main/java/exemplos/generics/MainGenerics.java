package exemplos.generics;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MainGenerics {
    public static void main(String[] args) {
        Map<String, Object> userData = new HashMap<>();
        userData.put("name", "John Doe");
        userData.put("email", "john.doe@example.com");

        UserDTO userDTO = GenericDTOMapper.mapToDTO(userData, UserDTO.class);
        System.out.println("UserDTO: " + userDTO.getName() + ", " + userDTO.getEmail());

        // Dados de exemplo para ProductDTO
        Map<String, Object> productData = new HashMap<>();
        productData.put("productName", "Laptop");
        productData.put("price", new BigDecimal("799.99"));

        ProductDTO productDTO = GenericDTOMapper.mapToDTO(productData, ProductDTO.class);
        System.out.println("ProductDTO: " + productDTO.getProductName() + ", " + productDTO.getPrice());
    }
}
