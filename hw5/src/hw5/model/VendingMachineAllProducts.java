package hw5.model;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineAllProducts<T extends Product> implements VendingMachine {
    private List<T> product;
    private final List<T> resultFind = new ArrayList<>();


    @Override
    public void initProduct(List list) {
        this.product = list;
    }

    public String getProduct(String name) {
        for (T el : product) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено!";
    }

    public String getProduct(float price) {
        resultFind.clear();
        for (T el : product) {
            if (el.getPrice() <= price) resultFind.add(el);
        }
        return resultFind.isEmpty() ? "Не найдено!" : resultFind.toString();
    }

    public String getProduct(int temp) {
        resultFind.clear();
        for (T el : product) {
            if (el instanceof HotDrinks && ((HotDrinks) el).getTemp() <= temp) resultFind.add(el);
        }

        return resultFind.isEmpty() ? "Не найдено!" : resultFind.toString();
    }
}
