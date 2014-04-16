package be.pizzahut.specials;
public enum PizzaSoort implements be.pizza.core.Soort{
    MARGHERITA("Margherita"), PEPPERONILOVERS("Pepperoni lovers"), CHEESAM("Cheesam");
    private String naam;
    private PizzaSoort(String naam){
        this.naam=naam;
    }
  @Override
    public String toString(){
        return naam;
    }
}