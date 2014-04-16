package be.pizzahut.specials;
import be.pizza.core.Pizza;
import be.pizza.core.Grootte;
public class CheezyCrustPizza implements Pizza{
    private Grootte grootte;
    public CheezyCrustPizza(Grootte grootte){
        this.grootte=grootte;
    }
    public String getBeschrijving(){
        return "Pizza van dun deeg waarvan de kost gevuld is met heerlijke kaas en overgoten met een heerlijke tomatensaus";
    }
    public double getPrijs(){
        return 5.5*grootte.getVerhouding();
    }
    public Grootte getGrootte(){
        return grootte;
    }
}