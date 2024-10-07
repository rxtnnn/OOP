/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rextine
 */
public class InsuredPackage extends Package {
    public float insureCost;
    
    
    
    public InsuredPackage(int weight, char shipMethod) {
        super(weight, shipMethod);
        calculateInsureCost();
    }
     public void calculateInsureCost(){
        if (super.shipCost <= 45.00) {
            insureCost = 110.25F;
        } else if (super.shipCost <= 135.00) {
            insureCost = 177.75F;
        } else {
            insureCost = 249.75F;
        }
    }
    @Override
    public String toString(){
        return ("Insurance Cost: Php" +insureCost+  "\n" +"Total Shipping Cost: Php" +(super.shipCost + insureCost) +"\n");
    }
    
}
