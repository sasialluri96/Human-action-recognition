class Product {
    String name;
    double price;
    int qoh;
    public Product(String name,int price,int qoh){
        this.name = name;
        this.price = price;
        this.qoh = qoh;
    }
    public double getNetPrice(){
        return price*qoh;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void sale(int quantity){
        if(quantity <= qoh) {
            qoh = qoh-quantity;
            System.out.println(quantity+" "+ name+ "sold");

        }
        else {
            System.out.println("insufficient Stock");
        }
    }
    public void purchase(int quantity){
        if(quantity>0) {
            qoh = qoh+quantity;
            System.out.println(quantity+" "+ name+ "Purchase");

        }
        else {
            System.out.println("invalid");
        }
    }
        

}
public class Example1{
    public static void main(String[] args) {
        Product p = new Product("iphone", 100000,1);
        System.out.println(p.getNetPrice());
        p.sale(2);
        p.purchase(4);
        p.setPrice(120000);
        
    }
}




