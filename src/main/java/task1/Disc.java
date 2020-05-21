package task1;

public class Disc extends Product{

    private int capacity;

    public Disc() {
        super();
    }

    public Disc(String productName, double price, int quantity, int capacity) {
        super(productName, price, quantity);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
