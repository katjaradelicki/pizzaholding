package be.pizzahut.specials;
public enum PizzaHutGrootte implements be.pizza.core.Grootte{
    SMALL(0.6, "Small"), MEDIUM(1, "Medium"), LARGE(1.5, "Large"), EXTRA_LARGE(2, "Extra Large");
    private double verhouding;
    private String naam;
    private PizzaHutGrootte(double verhouding, String naam){
        this.verhouding=verhouding;
        this.naam=naam;
    }
    public double getVerhouding(){
        return verhouding;
    }
  @Override
    public String toString(){
        return naam;
    }
}