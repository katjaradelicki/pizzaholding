package be.pizzaitalia.recept;
import be.pizza.beleg.Mozarella;
import be.pizza.core.Pizza;
public class Pepperoni{
    private static Pepperoni object;
    public static Pepperoni getInstance(){
        if(object==null){
            object=new Pepperoni();
        }
        return object;
    }
    private Pepperoni(){
    }
    public Pizza beleg(Pizza pizza){
        return new be.pizza.beleg.Pepperoni(new Mozarella(pizza));
    }
}