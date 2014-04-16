package be.pizzahut.specials;
import be.pizza.core.Pizza;
import be.pizza.core.Grootte;
public class PanPizza implements Pizza{
    private Grootte grootte;
    public PanPizza(Grootte grootte){
        this.grootte=grootte;
    }
    public String getBeschrijving(){
        return "Pizza van deeg dat goudbruin gebakken wordt in een pan en overgoten met een heerlijke tomatensaus";
    }
    public double getPrijs(){
        return 4.3*grootte.getVerhouding();
    }
    public Grootte getGrootte(){
        return grootte;
    }
}