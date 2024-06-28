package exemplos.generics;

import java.util.ArrayList;
import java.util.List;

//As coleções da biblioteca padrão do Java são todas baseadas em Generics
public class ListGenericExemplo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");

        for (String item : stringList) {
            System.out.println(item);
        }
    }
}
