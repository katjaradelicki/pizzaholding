package be.pizzaitalia.specials;
public enum PizzaItaliaGrootte implements be.pizza.core.Grootte{
    MEDIO(0.6, "Medio"), PENTOLA(1, "Pentola"), GRANDE(1.3, "Grande");
    private double verhouding;
    private String naam;
    private PizzaItaliaGrootte(double verhouding, String naam){
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