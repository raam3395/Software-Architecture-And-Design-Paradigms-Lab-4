/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab4;

/**
 *
 * @author Raam
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Tall(beverage);
        beverage = new SteamedMilk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        
        Beverage minum = new DarkRoast();
        minum = new Grande(minum);
        minum = new Mocha(minum);
        minum = new Mocha(minum);
        minum = new Whip(minum);
        System.out.println(minum.getDescription() + " $" + minum.cost());
        
        Beverage drink = new HouseBlend();
        drink = new Venti(drink);
        drink = new Soy(drink);
        drink = new Mocha(drink);
        drink = new Whip(drink);
        System.out.println(drink.getDescription() + " $" + drink.cost());
    }
    
}
