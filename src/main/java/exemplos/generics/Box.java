package exemplos.generics;

public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello World!");
        System.out.println("String Box: " + stringBox.getContent());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer Box: " + integerBox.getContent());
    }
}
