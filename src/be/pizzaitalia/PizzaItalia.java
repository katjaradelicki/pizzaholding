package be.pizzaitalia;

import be.pizzaitalia.specials.PizzaSoort;
import be.pizzaitalia.specials.PizzaBodem;
import be.pizzaitalia.specials.PizzaItaliaGrootte;
import be.pizza.core.PizzaHolding;
import be.pizza.core.Pizza;
import be.pizza.core.Bodem;
import be.pizza.core.Soort;
import be.pizza.core.Grootte;
import be.pizzaitalia.recept.*;

public class PizzaItalia extends PizzaHolding {
    private static PizzaItalia object;
    private PizzaItalia() {
    }

    public static synchronized PizzaHolding getInstance() {
        if (object == null) {
            object = new PizzaItalia();
        }
        return object;
    }

    public Soort[] getSoorten() {
        return PizzaSoort.values();
    }

    public Bodem[] getBodems() {
        return PizzaBodem.values();
    }

    public be.pizza.core.Grootte[] getGroottes() {
        return PizzaItaliaGrootte.values();
    }

    public Pizza orderPizza(Bodem bodem, Soort soort, Grootte grootte) {
        Pizza pizza = null;
        if (!(soort instanceof be.pizzaitalia.specials.PizzaSoort) ||
                !(bodem instanceof be.pizzaitalia.specials.PizzaBodem) ||
                !(grootte instanceof be.pizzaitalia.specials.PizzaItaliaGrootte)) {
            throw new IllegalArgumentException("all types of the parameter must match the type of class " + this.getClass().getName());
        }
        PizzaSoort ps = (PizzaSoort) soort;
        PizzaItaliaGrootte pg = (PizzaItaliaGrootte) grootte;
        PizzaBodem pb = (PizzaBodem) bodem;
        Pizza pizzabodem = PizzaBodemFabriek.getInstance().getBodem(pb, pg);
        switch (ps) {
            case MARGHERITA:
                pizza = Margherita.getInstance().beleg(pizzabodem);
                break;
            case PARMA:
                pizza = Parma.getInstance().beleg(pizzabodem);
                break;
            case PEPPERONI:
                pizza = be.pizzaitalia.recept.Pepperoni.getInstance().beleg(pizzabodem);
                break;
            default:
                    throw new IllegalStateException("PizzaItalia: PizzaBodem pb contains a value that is not a memberber of the enumeration");
        }
        return pizza;
    }
}
