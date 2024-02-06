package unit10;

import java.math.BigDecimal;
import java.util.Optional;

public class MealRecipe {
    private double dough;
    private int sauce;
    private Optional<BigDecimal> PizzaOpt;
    // Optional takes wrapper classes or classes eg <Person>
    public double getDough() {
        return dough;
    }

    public void setDough(double dough) {
        this.dough = dough;
    }

    public int getSauce() {
        return sauce;
    }

    public void setSauce(int sauce) {
        this.sauce = sauce;
    }

    public Optional<BigDecimal> getPizzaOpt() {
        return PizzaOpt;
    }
    // Optional.ofNullable(pizzaOpt) we are not trying to get null thats why we set it optional ????
    public void setPizzaOpt(BigDecimal price) {
        this.PizzaOpt = Optional.of(price);
    }

// we make one extra method to show the value of PizzaOpt if we dont want the Optional.empty to be shown
    @Override
    public String toString() {
        return "MealRecipe{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", Pizza='" + getPrice() + '\'' +
                '}';
    }
    private String getPrice(){
        String newpizza= PizzaOpt.map(price->"money "+ price).orElse("free Choice");
        return newpizza;
    }
}
