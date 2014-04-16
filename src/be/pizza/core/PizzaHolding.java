package be.pizza.core;
public abstract class PizzaHolding{
    public abstract Soort[] getSoorten();
    public abstract Bodem[] getBodems();
    public abstract Grootte[] getGroottes();
    public abstract Pizza orderPizza(Bodem bodem, Soort soort, Grootte grootte);
}
