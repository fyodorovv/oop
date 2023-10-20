package hw5.model;

public abstract class Product {
    private String name;
    private float price;


    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\"" + name + "\" стоит: " + price + " у.е. ";
    }
}
