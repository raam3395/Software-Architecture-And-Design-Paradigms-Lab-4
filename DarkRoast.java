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
public class DarkRoast extends Beverage {
    
    public DarkRoast() {
        description = "Dark Roast";
    }
    
    @Override
    public double cost() {
        return 0.99;
    }
}
