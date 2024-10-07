/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rextine
 */
public class Package {
    public int weight;
    public char shipMethod;
    public float shipCost;
    
   
    
    public Package(int weight, char shipMethod) {
        this.weight = weight;
        this.shipMethod = shipMethod;
        calculateCost(weight, shipMethod);
    }
    
    public void calculateCost(int weight, char shipMethod){
        
        switch(shipMethod){
            case 'A':
                if (weight >= 1 && weight <= 8){
                    shipCost = 90.00F;
                }else if(weight >= 9 && weight <= 16){
                    shipCost = 135.00F;
                }else if(weight >= 17){
                    shipCost = 202.50F;
                }
                break;
            case 'T':
                if (weight >= 1 && weight <= 8){
                    shipCost = 67.50F;
                }else if(weight >= 9 && weight <= 16){
                    shipCost = 105.75F;
                }else if(weight >= 17){
                    shipCost = 146.25F;
                }
                break;
            case 'M':
                if (weight >= 1 && weight <= 8){
                    shipCost = 22.50F;
                }else if(weight >= 9 && weight <= 16){
                   shipCost = 67.50F;
                }else if(weight >= 17){
                    shipCost = 96.75F;
                }
                break;
        }
    }
     
    @Override
    public String toString(){
        return("Weight: " +weight+ "\n" +"Shipping Method: "+shipMethod+ "\n" + "Shipping Cost: Php" +shipCost);
    }
    
}
