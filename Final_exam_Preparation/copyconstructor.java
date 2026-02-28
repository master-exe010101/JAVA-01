class Student{
    int Roll;
Student(int R){
    Roll = R;

}

Student(Student s){
    Roll = s.Roll;

}
void Display(){
    System.out.println("Roll is: " + Roll);
}
}
public class copyconstructor{
    public static void main(String [] args){
        Student s1 = new Student(857447);
        s1.Display();
        Student s2 = new Student(s1);
        s2.Display();
        System.out.println("Both are same");

    }
}




