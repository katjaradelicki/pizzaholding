package be.pizza.beleg;
import be.pizza.core.Pizza;
public class Kappers extends AbstractPizzaBeleg{
    public Kappers(Pizza pizza){
        super(pizza);
    }
  @Override
    public String getBeschrijving(){
        return super.getBeschrijving()+", kappers";
    }
  @Override
    public double getPrijs(){
        return super.getPrijs()+0.4*super.getGrootte().getVerhouding();
    }
}