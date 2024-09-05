class Doctors {
    String Residentdoctors;
    String Consultantdoctors;
    int salary;
    int visit;
    int ratepervisit;
    public Doctors( String Residentdoctors,String Consultantdoctors,int salary,int visit,int ratepervisit) {
        this.Residentdoctors =Residentdoctors;
        this.Consultantdoctors=Consultantdoctors;
        this.salary=salary;
        this.visit=visit;
        this.ratepervisit=ratepervisit;
    }
    public void print() {
        System.out.println("residentDoctors:" + Residentdoctors);
        System.out.println("consultantDoctors:" + Consultantdoctors);
        System.out.println("Salary" + salary);
        System.out.println("RatePerVisit" +ratepervisit);
    }
    public int getPay(){
        return salary;

    }
    public void setPay(int salary){
        this.salary=salary;
    }
    public int getratepervisit(){
        return visit*ratepervisit;
    }
}
public class Example1inInheritence{
    public static void main(String[] args) {
        Doctors doc = new Doctors("Dr.Ramanadhan","Dr.Sunitha",200000,10,500);
        System.out.println(doc.getPay());
        System.out.println(doc.getratepervisit());
    }



}
