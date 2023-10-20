package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды), сделать интерфейсом
 * ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат
 */
public class Main {
    public static void main(String[] args) {
        Vend1 vm = new Vend1();
        List<BottleWater> bottles = new ArrayList<>(Arrays.asList(new BottleWater("pepsi", 42),
                new BottleWater("chocolate", 67), new BottleWater("cola", 42), new BottleWater("cola", 70)));
        vm.initProduct(bottles);
        System.out.println(vm.getProduct("cola", 80));

        VendHot vmHot = new VendHot();
        List<HotDrink> drinks = new ArrayList<>(Arrays.asList(
                new HotDrink("cappuccino", 55, 80, 200),new HotDrink("americano ", 43, 90, 100),
                new HotDrink("americano ", 68, 80, 200), new HotDrink("cocoa", 47,85, 200),
                new HotDrink("cocoa", 65,80, 300), new HotDrink("moquiato", 63,83, 250)));
        vmHot.initProduct(drinks);
        System.out.println(vmHot.getProduct("americano ", 80, 200));
    }
}
