public class Person {
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    static class Teacher extends Person{
       private String qualification;

       public void setQualification(String Q){
        this.qualification=Q;
       }
       public String getQualification(){
        return qualification;
       }
    }
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("Nahin ul Sadad");
        t1.setAge(30);
        t1.setQualification("Assistant Profesor");

        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getQualification());
    }
}
