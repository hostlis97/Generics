public class Main {
    public static void main(String[] args) {
        MagicBox<String> text = new MagicBox<>(3);
        MagicBox<Integer> num = new MagicBox<>(2);

        num.add(1);
        num.add(10);
        System.out.println(num.pick());

        text.add("строка 1");
        text.add("Строка 2");
        text.add("Строка 3");
        System.out.println(text.pick());

    }
}
