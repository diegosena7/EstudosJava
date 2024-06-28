package exemplos.generics;

public class MetodoGenerico {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D", "E"};

        printArray(intArray); // Output: 1 2 3 4 5
        printArray(stringArray); // Output: A B C D E
    }
}
