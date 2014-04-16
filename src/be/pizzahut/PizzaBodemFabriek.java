package be.pizzahut;
import be.pizzahut.specials.PizzaHutGrootte;
import be.pizzahut.specials.PizzaBodem;
import be.pizzahut.specials.CheezyCrustPizza;
import be.pizzahut.specials.PanPizza;
import be.pizza.core.Pizza;
import be.pizzahut.specials.QuattroPizza;
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
    public Pizza getBodem(PizzaBodem bodem, PizzaHutGrootte grootte){
        Pizza pizza=null;
        switch (bodem){
            case CHEEZYCRUST:
                pizza=new CheezyCrustPizza(grootte);
                break;
            case CLASSIC:
                pizza=new CheezyCrustPizza(grootte);
                break;
            case PAN:
                pizza=new PanPizza(grootte);
                break;
            case QUATTRO:
                pizza=new QuattroPizza(grootte);
                break;
        }
        return pizza;
    }
}