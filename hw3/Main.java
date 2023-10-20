package seminar3.cw1;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Добавить Comparable и/или Comparator к приложению, написанному на семинаре(Файлы прикреплены под уроком)
 */
public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(Arrays.asList(new Cat("barsik"),
                new Cat("murzik"),
                new Cat("kesha"),
                new Cat("boris")));

        System.out.println("Использование итератора:");
        Iterator<Cat> iter = cats.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("Сортировка через компаратор:");
        cats.getCatList().sort(new NameComparator());
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
}
