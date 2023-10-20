package seminar2.cw1;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "Володька";
        Market market = new Market();
        market.acceptToMarket(h1);
        market.takeInQueue(h1);

        Food pr1 = new Food("Молоко высшего качества", 78, 1);
        Food pr2 = new Food("Печенье овсяное", 43, 2);
        Food pr3 = new Food("Шоколад молочный", 90, 1);
        h1.addToCard(pr1);
        h1.addToCard(pr2);
        h1.addToCard(pr3);
        h1.removeFromCard(pr1);

        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(h1);
        market.update();
    }
}
