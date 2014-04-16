package be.pizza.beleg;
import be.pizza.core.Pizza;
public class ZwarteOlijven extends AbstractPizzaBeleg{
    public ZwarteOlijven(Pizza pizza){
        super(pizza);
    }
  @Override
    public String getBeschrijving(){
        return super.getBeschrijving()+", zwarte olijven";
    }
  @Override
    public double getPrijs(){
        return super.getPrijs()+1.1*super.getGrootte().getVerhouding();
    }
}