package be.pizzahut.recept;
import be.pizza.beleg.Ham;
import be.pizza.beleg.Mozarella;
import be.pizza.core.Pizza;
public class Cheesam{
    private static Cheesam object;
    public static synchronized Cheesam getInstance(){
        if(object==null){
            object=new Cheesam();
        }
        return object;
    }
    private Cheesam(){
    }
    public Pizza beleg(Pizza pizza){
        return new Ham(new Mozarella(new Mozarella(pizza)));
    }
}
