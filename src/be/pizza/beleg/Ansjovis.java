package be.pizza.beleg;
import be.pizza.core.Pizza;
public class Ansjovis extends AbstractPizzaBeleg{
    public Ansjovis(Pizza pizza){
        super(pizza);
    }
  @Override
    public String getBeschrijving(){
        return super.getBeschrijving()+", zuiderse ansjovis";
    }
  @Override
    public double getPrijs(){
        return super.getPrijs()+1.0*super.getGrootte().getVerhouding();
    }
}