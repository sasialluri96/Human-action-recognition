public class StaticExample1{
    String name;
    static int taxrate = 50;
    int price;
    public StaticExample1(String name,int price){
        this.name=name;
        this.price = price;
    }
    public int gettaxrate(){
        return price*taxrate/100;

    }
    public static void main(String[] args) {
        StaticExample1 p = new StaticExample1("iphone",10000);
        System.out.println(p.gettaxrate());
    }
}



