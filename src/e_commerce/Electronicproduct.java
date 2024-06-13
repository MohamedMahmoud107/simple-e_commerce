
package e_commerce;

public class Electronicproduct extends product{
    private String brand;
    private int warrantyPeriod;

    public Electronicproduct(String brand, int warrantyPeriod, int productid, String name, float price) {
        super(productid, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
    @Override
     public  float getPrice() {
        return price ; 
     }
   public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    
    
}
