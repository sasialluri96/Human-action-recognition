class InsufficientQuantityException extends Exception {
    public InsufficientQuantityException(String message){
        super(message);
    }
}
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message){
        super(message);
    }
}
class Product{
    int price;
    String name;
    int quantity;
    Product(int price,String name,int quantity){
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }
    public void sale(int sell)throws InsufficientQuantityException {
        if(quantity>sell){
            throw new InsufficientQuantityException("Insufficient stock");
        }
        sell-= quantity;
    }
    public void purchase(int purchased) throws InvalidQuantityException{
        if(quantity<=0){
            throw new InvalidQuantityException("Invalid Stock");
        }
        purchased+=quantity;
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        Product product = new Product(15000,"karthee",04);
        try {
            product.sale(50);
                System.err.println("50 units sold sucessfully");            
        } 
        catch (InsufficientQuantityException e) {
            System.out.println(e.getMessage());
        }
        try {
            product.purchase(-10);
            System.out.println("10 units purchased sucessfully");
        } 
        catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
    }
}



    
    

