package be.pizza.beleg;
import be.pizza.core.Pizza;
public class Ham extends AbstractPizzaBeleg{
    public Ham(Pizza pizza){
        super(pizza);
    }
  @Override
    public String getBeschrijving(){
        return super.getBeschrijving()+", ontvette ham";
    }
  @Override
    public double getPrijs(){
        return super.getPrijs()+1.2*super.getGrootte().getVerhouding();
    }
}