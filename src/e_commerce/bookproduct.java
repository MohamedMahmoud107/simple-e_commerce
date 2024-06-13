
package e_commerce;

public class bookproduct extends product {
    
    private String author;
    private String publisher;

    public bookproduct(String author, String publisher, int productid, String name, float price) {
        super(productid, name, price);
        this.author = author;
        this.publisher = publisher;
    }
    @Override
  public  float getPrice() {
      return price ;
  }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
}
