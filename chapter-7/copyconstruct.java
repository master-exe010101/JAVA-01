class Student {
    int roll;
    float gpa;
    String name;


    public Student(int r, float g, String n) {
        roll = r;
        gpa = g;
        name = n;
    }

    public Student(Student s) {
        this.roll = s.roll;
        this.gpa = s.gpa;
        this.name = s.name;
    }


    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", GPA: " + gpa);
    }
}

public class copyconstruct {
    public static void main(String[] args) {

        Student s1 = new Student(1234, 3.34f, "Shraus");
        System.out.println(s1);
        s1.display();

        Student s2 = new Student(s1); 
        
        s2.display();
        System.out.println("both are same ");
    }
}