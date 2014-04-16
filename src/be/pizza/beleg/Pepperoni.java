package be.pizza.beleg;
import be.pizza.core.Pizza;
public class Pepperoni extends AbstractPizzaBeleg{
    public Pepperoni(Pizza pizza){
        super(pizza);
    }
  @Override
    public String getBeschrijving(){
        return super.getBeschrijving()+", pepperoniworst";
    }
  @Override
    public double getPrijs(){
        return super.getPrijs()+1.2*super.getGrootte().getVerhouding();
    }
}