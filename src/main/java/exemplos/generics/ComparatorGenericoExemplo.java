package exemplos.generics;

import java.util.*;

class Pessoa {
    private String name;
    private int age;

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return age == pessoa.age && Objects.equals(name, pessoa.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class AgeComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}

public class ComparatorGenericoExemplo {

    public static void main(String[] args) {
        List<Pessoa> personList = new ArrayList<>();
        personList.add(new Pessoa("Diego", 35));
        personList.add(new Pessoa("Nayara", 36));
        personList.add(new Pessoa("Ryan", 18));
        personList.add(new Pessoa("Ted", 10));

        Collections.sort(personList, new AgeComparator());

        for (Pessoa person : personList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
