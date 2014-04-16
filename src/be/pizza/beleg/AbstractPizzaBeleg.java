/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pizza.beleg;

import be.pizza.core.Grootte;
import be.pizza.core.Pizza;

/**
 *
 * @author frank.roelants
 */
public abstract class AbstractPizzaBeleg implements Pizza{
  private Pizza pizza;
    public AbstractPizzaBeleg(Pizza pizza){
        this.pizza=pizza;
    }

  public String getBeschrijving() {
    return pizza.getBeschrijving();
  }

  public double getPrijs() {
    return pizza.getPrijs();
  }

  public Grootte getGrootte() {
    return pizza.getGrootte();
  }
}
