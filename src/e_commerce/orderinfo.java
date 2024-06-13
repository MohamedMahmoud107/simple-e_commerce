
package e_commerce;

public class orderinfo {
   
    private int customerId;
    private int orderId;
    private product[] products;
    private float totalPrice;

    public orderinfo(int customerId, int orderId, product[] products, float totalPrice) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
    }



    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
        public void printorderinfo(){
        System.out.println("order id : "+orderId);
        System.out.println("customer id :"+customerId);
        System.out.println("products :");
            for(int i =0; i<products.length; i++){
                if(products[i]!=null){
                System.out.println(products[i].getName()+"  "+products[i].getPrice()+"  "+products[i].getProductid());
                }
            }
        System.out.println("total price ="+totalPrice+"$");

    }
}

    



    

