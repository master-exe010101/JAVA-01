class Student{
    int Roll;
    String Name;
     

}
class Result extends Student{
    float Mark;
    void GEtData(){
        Roll = 34;
        Name = "Muzahid";
        Mark = 3.77f;


    }
    void Display(){
        System.out.println("Roll is " + Roll);
        System.out.println("Name is " + Name);
        System.out.println("Mark is " + Mark);

    }
}



public class Inheritance {
    public static void main(String[] args) {
        Result R = new Result();
        R.GEtData();
        R.Display();
    }
}   




