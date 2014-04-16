package be.pizzahut.specials;
import be.pizza.core.Pizza;
import be.pizza.core.Grootte;
public class QuattroPizza implements Pizza{
    private Grootte grootte;
    public QuattroPizza(Grootte grootte){
        this.grootte=grootte;
    }
    public String getBeschrijving(){
        return "Pizza van een krokante deeg die gebakken wordt in een vierkantige pan en overgoten met een heerlijke tomatensaus";
    }
    public double getPrijs(){
        return 4.5*grootte.getVerhouding();
    }
    public Grootte getGrootte(){
        return grootte;
    }
}