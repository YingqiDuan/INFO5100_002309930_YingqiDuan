package FactoryMethodPattern;

public class Appetizer implements MenuItem{
    private String name;
    private double price;

    public Appetizer(String name, double price) {
        this.name=name;
        this.price=price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("FactoryMethodPattern.Appetizer: " + name + " -$" + price);
    }
}