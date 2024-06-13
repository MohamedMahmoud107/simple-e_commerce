
package e_commerce;

public class clothingproduct extends product {
    private  String size ;
    private  String fabric;

    public clothingproduct(String size, String fabric, int productid, String name, float price) {
        super(productid, name, price);
        this.size = size;
        this.fabric = fabric;
    }
    
    
    @Override
    public  float getPrice(){
    return price ;
    
}
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
}
