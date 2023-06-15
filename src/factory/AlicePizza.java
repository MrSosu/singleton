package factory;

public class AlicePizza extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "margherita":
                pizza = new PizzaMargherita();
                break;
            case "boscaiola" :
                pizza = new PizzaBoscaiola();
                break;
            default: throw new IllegalArgumentException("WTF");
        }
        return pizza;
    }
}
