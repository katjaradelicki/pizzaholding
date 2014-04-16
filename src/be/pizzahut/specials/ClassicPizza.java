package be.pizzahut.specials;
import be.pizza.core.Pizza;
import be.pizza.core.Grootte;
public class ClassicPizza implements Pizza{
    private Grootte grootte;
    public ClassicPizza(Grootte grootte){
        this.grootte=grootte;
    }
    public String getBeschrijving(){
        return "Pizza van traditioneel dun deeg dat licht en krokant is en overgoten met een heerlijke tomatensaus";
    }
    public double getPrijs(){
        return 4.1*grootte.getVerhouding();
    }
    public Grootte getGrootte(){
        return grootte;
    }
}