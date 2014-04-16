package be.pizzahut;
import be.pizzahut.specials.PizzaSoort;
import be.pizzahut.specials.PizzaHutGrootte;
import be.pizzahut.specials.PizzaBodem;
import be.pizza.core.PizzaHolding;
import be.pizza.core.Pizza;
import be.pizza.core.Bodem;
import be.pizza.core.Soort;
import be.pizza.core.Grootte;
import be.pizzahut.recept.*;
public class PizzaHut extends PizzaHolding{
    private static PizzaHut object;
    private PizzaHut(){
    }
    public static synchronized PizzaHolding getInstance(){
        if(object==null){
            object=new PizzaHut();
        }
        return object;
    }
    public Soort[] getSoorten(){
        return PizzaSoort.values();
    }
    public Bodem[] getBodems(){
        return PizzaBodem.values();
    }
    public be.pizza.core.Grootte[] getGroottes(){
        return PizzaHutGrootte.values();
    }
    public Pizza orderPizza(Bodem bodem, Soort soort, Grootte grootte){
        Pizza pizza=null;
        if(!(soort instanceof be.pizzahut.specials.PizzaSoort)||
          !(bodem instanceof be.pizzahut.specials.PizzaBodem)||
          !(grootte instanceof be.pizzahut.specials.PizzaHutGrootte)){
            throw new IllegalArgumentException("all types of the parameter must match the type of class"+this.getClass().getName());
        }
        PizzaSoort ps=(PizzaSoort) soort;
        PizzaHutGrootte pg=(PizzaHutGrootte) grootte;
        PizzaBodem pb=(PizzaBodem) bodem;
        Pizza pizzabodem=PizzaBodemFabriek.getInstance().getBodem(pb, pg);
        switch (ps){
            case MARGHERITA:
                pizza=Margherita.getInstance().beleg(pizzabodem);
                break;
            case CHEESAM:
                pizza=Cheesam.getInstance().beleg(pizzabodem);
                break;
            case PEPPERONILOVERS:
                pizza=PepperoniLovers.getInstance().beleg(pizzabodem);
                break;
            default:
                throw new IllegalStateException("Pizzahut: PizzaBodem pb contains a value that is not a memberber of the enumeration");
        }
        return pizza;
    }
}
