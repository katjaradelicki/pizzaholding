package be.pizzaitalia.recept;
import be.pizza.beleg.Ham;
import be.pizza.beleg.Mozarella;
import be.pizza.core.Pizza;
public class Parma{
    private static Parma object;
    public static synchronized Parma getInstance(){
        if(object==null){
            object=new Parma();
        }
        return object;
    }
    private Parma(){
    }
    public Pizza beleg(Pizza pizza){
        return new Ham(new Mozarella(new Mozarella(pizza)));
    }
}