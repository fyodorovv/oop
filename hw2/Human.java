package seminar2.cw1;

public class Human extends Buyer{
    @Override
    public void addToCard(Food food) {
        card.add(food);
    }

    @Override
    public void removeFromCard(Food food) {
        card.add(food);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
