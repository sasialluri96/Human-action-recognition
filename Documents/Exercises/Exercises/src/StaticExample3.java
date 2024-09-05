public class StaticExample3 {
    static int count =0;
    int value;
    public StaticExample3(int value){
        this.value = value;
    }
    public void increment(){
        value++;

    }
    public void decrement(){
        value--;
    }
    public int getValue() {
        return value;
    }
    public static void main(String[] args) {
        StaticExample3 s = new StaticExample3 (85);
        s.increment();
        System.out.println("After increment" + s.getValue());
        s.decrement();
        System.out.println("After Decrement" + s.getValue());

        
    }


    
}
