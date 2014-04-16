package be.pizzaitalia;
import be.pizzaitalia.specials.Originale;
import be.pizzaitalia.specials.PizzaBodem;
import be.pizzaitalia.specials.PizzaItaliaGrootte;
import be.pizza.core.Pizza;
public class PizzaBodemFabriek{
    private static PizzaBodemFabriek object;
    public static synchronized PizzaBodemFabriek getInstance(){
        if(object==null){
            object=new PizzaBodemFabriek();
        }
        return object;
    }
    private PizzaBodemFabriek(){
    }
    public Pizza getBodem(PizzaBodem bodem, PizzaItaliaGrootte grootte){
        Pizza pizza=null;
        switch (bodem){
            case ORIGINALE:
                pizza=new Originale(grootte);
                break;
        }
        return pizza;
    }
}