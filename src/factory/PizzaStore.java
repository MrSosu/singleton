package factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.tagliaPizza();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
