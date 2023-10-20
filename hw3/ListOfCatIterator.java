package seminar3.cw1;

import java.util.Iterator;
import java.util.List;

public class ListOfCatIterator implements Iterator<Cat> {
    private List<Cat> catListIteartor;
    private int counter;
    public ListOfCatIterator(List<Cat> catList){
        this.catListIteartor = catList;
        counter = 0;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public boolean hasNext() {
        return counter < catListIteartor.size();
    }

    @Override
    public Cat next() {
        return catListIteartor.get(counter++);
    }
}
