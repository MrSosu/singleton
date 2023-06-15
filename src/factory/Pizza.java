package factory;

import java.util.List;

public abstract class Pizza {

    protected String nome;
    protected List<String> ingredients;
    protected double price;
    protected boolean isLactose;

    public Pizza(String nome, List<String> ingredients, double price, boolean isLactose) {
        this.nome = nome;
        this.ingredients = ingredients;
        this.price = price;
        this.isLactose = isLactose;
    }

    public void addIngrendient(String ingredient) {
        ingredients.add(ingredient);
    }

    public void tagliaPizza() {
        System.out.println("Pizza tagliata in 8 fette");
    }

}
