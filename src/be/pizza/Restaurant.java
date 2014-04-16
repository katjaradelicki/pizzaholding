/*
 * Restaurant.java
 *
 * Created on 16 februari 2006, 12:10
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package be.pizza;
import be.pizza.core.PizzaHolding;
import be.pizza.core.Pizza;
import be.pizza.core.Grootte;
import be.pizza.core.Bodem;
import be.pizza.core.Soort;
import be.pizzahut.PizzaHut;
import be.pizzaitalia.PizzaItalia;
import org.apache.commons.math3.util.Precision;
public class Restaurant{
    public Restaurant(){
    }
    public static void main(String[] args){
        //PizzaHolding pzh=PizzaHut.getInstance();
        PizzaHolding pzh=PizzaItalia.getInstance();
        Soort[] soorten=pzh.getSoorten();
        Grootte[] groottes=pzh.getGroottes();
        Bodem[] bodems=pzh.getBodems();
        Pizza p=pzh.orderPizza(bodems[0], soorten[0], groottes[0]);
        System.out.println(p.getBeschrijving());
        System.out.println(p.getPrijs());
        System.out.println(p.getGrootte());
        pzh=PizzaHut.getInstance();
        soorten=pzh.getSoorten();
        groottes=pzh.getGroottes();
        bodems=pzh.getBodems();
        p=pzh.orderPizza(bodems[0], soorten[0], groottes[0]);
        System.out.println(p.getBeschrijving());
        System.out.println(Precision.round(p.getPrijs(),2));
        System.out.println(p.getGrootte());
    }
}
