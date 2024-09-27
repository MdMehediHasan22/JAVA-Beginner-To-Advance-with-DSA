
class Student{
    String name;
    int id;
    static String school ="LU";
    static int x=10;

    Student(String n,int i){
       name = n;
       id=i;
    }
    void displayInformation(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("School:"+school);
        System.out.println(" "+x);//non-static method can access static method/members
    }
    static void display2(){
        System.out.println(" "+x);//static methos access only static method/members
        System.out.println("I am a Student");
    }
   
}

public class oop {
    public static void main(String[] args) {
        
        Student s1 = new Student("Anisul",101);
        Student s2 = new Student("Mehedi",102);
        s1.displayInformation();
        s2.displayInformation();
        System.out.println(Student.school); //static variable er khetre object use korar lagena..class er sth somporkojukto
        Student.display2(); 
    }
}
