import java.util.Random;

public class MagicBox<T> {

    private int size;
    private T[] items;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
        this.size = size;
    }

    public boolean add(T item) {
        for (int i = 0; i < size; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        int randomInt = random.nextInt(size);
        for (T item : items) {
            if (item != null) {
                continue;
            } else {
                throw new RuntimeException("Коробка не полна");
            }
        }
        return items[randomInt];
    }
}
