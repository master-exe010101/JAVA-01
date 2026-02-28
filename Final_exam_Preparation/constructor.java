class Student{
    int Roll;
    String Name;
    float Mark;
    public Student(){
        Roll = 123451;
        Name = "Ahmad";
        Mark = 4.00f;
        System.out.println("Roll is " + Roll);
        System.out.println("Name is " + Name);
        System.out.println("Mark is " + Mark);

    }
}
public class constructor{
    public static void main(String[] args){
        Student obj = new Student();

    }
}