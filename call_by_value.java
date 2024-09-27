public class call_by_value {
    String name;
    void change(int i){
        i=20;
    }

    void change(call_by_value r2){
        r2.name = "Mehedi";
    }
    public static void main(String[] args) {
        int x = 10;//primitive data
        call_by_value ob = new call_by_value();
        System.out.println("Before call:"+x);
        ob.change(x);
        System.out.println("After call:"+x);

        call_by_value r1 = new call_by_value();//callByReference
        r1.name="Anis";
        System.out.println("before call:"+r1.name);
        r1.change(r1);
        System.out.println("After call:"+r1.name);
    }
}
