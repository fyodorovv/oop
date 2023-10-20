package hw;

import java.util.ArrayList;
import java.util.List;
public class VendHot extends VendingMachine {
    List<HotDrink> hotDrinks = new ArrayList<>();
    void initProduct(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }
    @Override
    public String getProduct(String name) {
        for(HotDrink p: hotDrinks) {
            if(p.getName().equals(name)) return p.toString();
        }
        return "Not found";
    }
    public String getProduct(String name, int maxTemp , int volume) {
        List<HotDrink> hotDrinksList = new ArrayList<>();
        for(HotDrink p: hotDrinks) {
            if(p.getName().equals(name) && p.getTemperature() <= maxTemp && p.getVolume() == volume) hotDrinksList.add(p);
        }
        return hotDrinksList.toString();
    }
}
