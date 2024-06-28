package exemplos.generics;

import java.util.HashSet;
import java.util.Set;

public class SetGenericoExemplo {
    public static void main(String[] args) {
        Set<Pessoa> personSet = new HashSet<>();
        personSet.add(new Pessoa("Alice", 30));
        personSet.add(new Pessoa("Bob", 25));
        personSet.add(new Pessoa("Alice", 30)); // Duplicado, não será adicionado

        for (Pessoa person : personSet) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
