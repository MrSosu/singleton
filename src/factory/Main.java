package factory;

public class Main {

    public static void main(String[] args) {
        AlicePizza alicePizza = new AlicePizza();
        Pizza pizza1 = alicePizza.orderPizza("margherita");
        Pizza pizza2 = alicePizza.orderPizza("boscaiola");
    }
}
