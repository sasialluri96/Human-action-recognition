public class StaticExample2{
    String name;
    int id;
    static int course_fee = 5000;
    public StaticExample2(String name,int id) {
        this.name = name;
        this.id =id;
    }
    public void print(){
        System.out.println("Name of the student " + name);
        System.out.println("student id " + id);
    }
    public static void main(String[] args) {
        StaticExample2 s =new StaticExample2("Sangeeth",4309); 
        s.print();
    }  
}


    

