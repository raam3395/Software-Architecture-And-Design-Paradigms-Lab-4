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
public class Grande extends CondimentDecorator {
    Beverage beverage;
    
    public Grande(Beverage beverage) {
        this.beverage = beverage;
        beverage.setSize("Grande");
    }
    
    @Override
    public String getDescription() {
        return beverage.getSize() + " " + beverage.getDescription();
    }
    
    @Override
    public double cost(){
        return beverage.cost();
    }
}
