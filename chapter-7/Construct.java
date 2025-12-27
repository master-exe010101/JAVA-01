class Student{
    int Roll;
    float GPA;
    String Name;
    public Student() {
        Roll = 1234;
        GPA = 3.34f ;
        Name = "Shraus";
        System.out.println ("Roll is : " + Roll);
        System.out.println ("Name is " + Name);
        System.out.println ("GPA is " +  GPA);
        
    }

}

public class Construct{

    public static void main (String[]args){
        Student s = new Student();

    }
    
}
