class Interest{
    int amount;
    int intrestrate;
    public Interest(int amount,int interestrate) {
        this.amount = amount;
        this.intrestrate = interestrate;
    }
    public int getRate() { 
        return amount;

    }
    public void setRate(int interestrate){
        this.intrestrate=interestrate;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    public int getInterest() {
        return amount*intrestrate;
    }

}
public class Example4inOOPS {
    public static void main(String[] args) {
        Interest in = new Interest(100000, 10);
        System.out.println(in.getInterest());
        System.out.println(in.getRate());
        in.setRate(15);
        System.out.println(in.getAmount());
    }
}