package exemplos.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        //For sem uso de lambda
//        List<String> list = Arrays.asList("a", "b", "c");
//        List<String> result = new ArrayList<>();
//        for (String s : list) {
//            result.add(s.toUpperCase());
//        }

        //For com uso de lambda
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> result = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println("--------------------------------");

        List<String> listNew = Arrays.asList("a", "bb", "ccc", "dddd");
        List<String> resultNew = listNew.stream()
                .filter(s -> s.length() >= 2)
                .collect(Collectors.toList());
        System.out.println(resultNew);

        //Abaixo exemplos sem lambda e com o lambda
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        /*
        O Comparator<String> stringComparator = (s1, s2) -> s1.compareTo(s2); utiliza o método compareTo da classe
        String para comparar duas stringslexicograficamente.
         */
        Comparator<String> stringComparatorLambda = (s1, s2) -> s1.compareTo(s2);
        System.out.println(stringComparatorLambda.compare("apple", "banana")); // Output: -1 pois a string apple é menor que a string banana
        System.out.println(stringComparatorLambda.compare("apple", "apple"));  // Output: 0 pois ambas as strings possuem o mesmo tamamh
        System.out.println(stringComparatorLambda.compare("banana", "apple")); // Output: 1 pois a banana é maior que a string apple

        List<String> fruits = Arrays.asList("banana", "apple", "orange");
        fruits.sort(stringComparatorLambda);
        System.out.println("fruits: " + fruits);
    }
}
