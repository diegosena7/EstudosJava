package exemplos.generics;

public interface InterfaceGenerica<K, V> {
    K getKey();
    V getValue();
}

class EncontraChaveValor<K, V> implements InterfaceGenerica<K, V> {
    private K key;
    private V value;

    public EncontraChaveValor(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        InterfaceGenerica<String, Integer> pairOne = new EncontraChaveValor<>("One", 1);
        InterfaceGenerica<String, Integer> pairTwo = new EncontraChaveValor<>("Two", 2);
        System.out.println("KeyOne: " + pairOne.getKey() + ", ValueOne: " + pairOne.getValue());
        System.out.println("KeyTwo: " + pairTwo.getKey() + ", ValueTwo: " + pairTwo.getValue());
    }
}
