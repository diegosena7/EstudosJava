package exemplos.generics;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

public class GenericDTOMapper {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T mapToDTO(Map<String, Object> requestData, Class<T> dtoClass) {
        return objectMapper.convertValue(requestData, dtoClass);
    }
}