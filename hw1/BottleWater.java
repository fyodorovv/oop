package hw;

public class BottleWater extends Product {
    private String name;
    private int price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public BottleWater(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BottleWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
