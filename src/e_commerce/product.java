package e_commerce;

public abstract class product {
    private int productid;
    private String name;
    protected float price;

    public product(int productid, String name, float price) {
        this.productid = productid;
        this.name = name;
        this.price = price;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = Math.abs(productid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract float getPrice() ;
    

    public void setPrice(float price) {
        this.price = Math.abs(price) ;
    }
    
    
    
}
