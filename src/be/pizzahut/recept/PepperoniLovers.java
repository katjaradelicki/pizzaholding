package be.pizzahut.recept;
import be.pizza.beleg.Mozarella;
import be.pizza.beleg.Pepperoni;
import be.pizza.core.Pizza;
public class PepperoniLovers{
    private static PepperoniLovers object;
    public static PepperoniLovers getInstance(){
        if(object==null){
            object=new PepperoniLovers();
        }
        return object;
    }
    private PepperoniLovers(){
    }
    public Pizza beleg(Pizza pizza){
        return new Pepperoni(new Mozarella(pizza));
    }
}