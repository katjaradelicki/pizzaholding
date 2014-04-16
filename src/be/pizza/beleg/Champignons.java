package be.pizza.beleg;
import be.pizza.core.Pizza;
public class Champignons extends AbstractPizzaBeleg{
    public Champignons(Pizza pizza){
        super(pizza);
    }
  @Override
    public String getBeschrijving(){
        return super.getBeschrijving()+", Parijse champignons";
    }
  @Override
    public double getPrijs(){
        return super.getPrijs()+1.0*super.getGrootte().getVerhouding();
    }
}