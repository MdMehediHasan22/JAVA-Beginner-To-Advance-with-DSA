
class Account{
     public String name;
     protected String email;
     private String password;

     public String getPassword(){
        return this.password;
     }
     public void setPassword(String Pass){
        this.password=Pass;
     }
}
public class Bank{
public static void main(String[] args) {
    Account account1 = new Account();
    account1.email="mdmehedi3799@gmail.com";
    account1.name="Mehedi";
    account1.setPassword("abcd");
    System.out.println(account1.getPassword());

     
}
}
