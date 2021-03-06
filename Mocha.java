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
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    
    @Override
    public double cost() {
        String size=beverage.getSize();
        
        if(size.equals("Tall")){
            return 0.2 + beverage.cost();
        }
        else if(size.equals("Grande")){
            return 0.25 + beverage.cost();
        }
        else{
            return 0.3 + beverage.cost();
        }
    }
}
