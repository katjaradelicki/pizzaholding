package be.pizza.beleg;
import be.pizza.core.Pizza;
public class Mozarella extends AbstractPizzaBeleg{
    public Mozarella(Pizza pizza){
        super(pizza);
    }
  @Override
    public String getBeschrijving(){
        return super.getBeschrijving()+", mozarella";
    }
  @Override
    public double getPrijs(){
        return super.getPrijs()+1.3*super.getGrootte().getVerhouding();
    }
}