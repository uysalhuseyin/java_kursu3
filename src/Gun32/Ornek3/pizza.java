package Gun32.Ornek3;

public class pizza {

    pizzasize size;

    public pizza(double price, pizzasize size) {

        this.size = size;
    }

    @Override
    public String toString() {
        return "pizza{" +
                "size=" + size +
                '}';
    }
}
