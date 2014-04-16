package be.pizzaitalia.specials;
public enum PizzaSoort implements be.pizza.core.Soort{
    MARGHERITA("Margherita"), PEPPERONI("Pepperoni"), PARMA("Parma");
    private String naam;
    private PizzaSoort(String naam){
        this.naam=naam;
    }
    public String toString(){
        return naam;
    }
}