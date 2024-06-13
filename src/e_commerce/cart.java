
package e_commerce;

public class cart {

    private int customerId;
    private int nProducts;
    private  product[] products;

    public cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new product[this.nProducts];
    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setNProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
   
    }

    public int getNProducts() {
        return this.nProducts;
    }

    public void addProduct(product product ) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void removeProduct(int productid) {
        for (int i = 0; i < products.length; i++) {
            if (products[i]!=null &&  products[i].getProductid()==productid) {
                products[i] = null;
                break;
            }
        }
    }

    public float calculatePrice() {
        float totalPrice = 0;
        for (product product : products) {
            if (product != null) 
                totalPrice += product.getPrice();
           
        }
        return totalPrice;
    }

    public boolean placeOrder() {
        
        boolean placeorder = true ; 
         return placeorder ;
     }

    } 




    

    

