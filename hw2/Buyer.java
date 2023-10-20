package seminar2.cw1;

import java.util.List;

public abstract class Buyer implements BuyerBehaviour{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected List<Food> card;
    protected abstract String getName();
    abstract void addToCard(Food food);
    abstract void removeFromCard(Food food);
}
