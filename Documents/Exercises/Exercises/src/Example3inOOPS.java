class Counter{
    int counter;
    public Counter(int counter){
        this.counter = counter;

    }
    public void increment() {
        counter++;
    }
    public void decrement() {
        counter--;
    }
    public int getValue() {
        return counter;

    }
}
public class Example3inOOPS {
    public static void main(String[] args) {
        Counter c = new Counter(23);
        c.increment();
        System.out.println("After increment" + c.getValue());
        c.increment();
        System.out.println("After increment again" + c.getValue());
        c.decrement();
        System.out.println("After decrement" + c.getValue());
        System.out.println("After decrement again" + c.getValue());




    }
}




