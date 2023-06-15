package factory;

public class PizzaSottoCasa extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "margherita":
                pizza = new PizzaMargherita();
                break;
            default: throw new IllegalArgumentException("WTF");
        }
        return pizza;
    }
}
