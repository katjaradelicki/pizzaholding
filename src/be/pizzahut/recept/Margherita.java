package be.pizzahut.recept;
import be.pizza.beleg.Mozarella;
import be.pizza.core.Pizza;
public class Margherita{
    private static Margherita object;
    public static synchronized Margherita getInstance(){
        if(object==null){
            object=new Margherita();
        }
        return object;
    }
    private Margherita(){
    }
    public Pizza beleg(Pizza pizza){
        return new Mozarella(pizza);
    }
}