
public abstract class MobileUser {
    abstract void sendMessage();
    void callMethod(){
        System.out.println("Call Method");
    }


   static class Rahim extends MobileUser{
        void sendMessage(){
            System.out.println("Hi i am Rahim");
        }
    }

  static  class Karim extends MobileUser{
        void sendMessage(){
            System.out.println("Hi i am Karim");
        }
    }

    public static void main(String[] args) {
        MobileUser ms;
        ms = new Rahim();
        ms.callMethod();
        ms.sendMessage();
        ms=new Karim();
        ms.sendMessage();
    }
}
