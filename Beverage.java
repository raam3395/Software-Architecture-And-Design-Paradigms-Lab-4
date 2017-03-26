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
public abstract class Beverage {
    String description = "Unknown Beverage";
    String size = "Unknown size";
    
    public String getDescription(){
        return description;
    }
    
    public abstract double cost();
    
    public String getSize(){
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
}
