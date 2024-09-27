abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("you are creating a new animal");
    }
    public void eats(){
        System.out.println("Animal eats");
    }

}

class Horse extends Animal{

    Horse(){
       System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Animal am;
        am=new Horse();
        am.walk();
        am = new Chicken();
        am.walk();
        
        horse.walk();
        horse.eats();
    }
}
