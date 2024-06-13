
package e_commerce;

public class customer {
   private int customerid;
    private String namel;
    private String adress;

    public int getCustomerid() {
        return customerid;
    }

    public customer(int customerid, String namel, String adress) {
        this.customerid = customerid;
        this.namel = namel;
        this.adress = adress;
    }
     
    public void setCustomerid(int customerid) {
        this.customerid =Math.abs(customerid) ;
    }

    public String getNamel() {
        return namel;
    }

    public void setNamel(String namel) {
        this.namel = namel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    
}
