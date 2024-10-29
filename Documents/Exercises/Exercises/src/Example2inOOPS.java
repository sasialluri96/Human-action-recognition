class Student {
    private String name;
    int admno;
    String course;
    double feePaid;
    double java_fee = 12000;
    double python_fee = 10000;

    public Student(String name, int admno, String course, double feePaid) {
        this.name = name;
        this.admno = admno;
        this.course = course;
        this.feePaid = feePaid;
    }

    public void payment(double amount) {
        if (amount > 0) {
            feePaid += amount;
        } else {
            System.out.println("Invalid Payment amount");
        }
    }

    public double getTotalFee() {
        if (course.equals("Java")) {
            return java_fee;
        } else if (course.equals("Python")) {
            return python_fee;
        } else {
            return 0;
        }
    }

    public double getDue() {
        return getTotalFee() - feePaid;
    }

    public double getFeePaid() {
        return feePaid;
    }

    public String getCourseName() {
        return course;
    }
}

public class Example2inOOPS {
    public static void main(String[] args) {
        Student s = new Student("Sasi", 4309, "Java", 1200);
        Student s1 = new Student("Gani", 4504, "Python", 200);
        
        System.out.println("Student s:");
        System.out.println("Due Amount: $" + s.getDue());
        System.out.println("Course Name: " + s.getCourseName());
        System.out.println("Fee Paid: $" + s.getFeePaid());
        System.out.println("Total Fee: $" + s.getTotalFee());
        
        System.out.println();

        System.out.println("Student s1:");
        System.out.println("Due Amount: $" + s1.getDue());
        System.out.println("Course Name: " + s1.getCourseName());
        System.out.println("Fee Paid: $" + s1.getFeePaid());
        System.out.println("Total Fee: $" + s1.getTotalFee());
    }
}
