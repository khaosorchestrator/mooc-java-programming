
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myAccount = new Account("Lucas D. da S. de Almeida", 100.0);
        myAccount.deposit(20.0);
        
        System.out.println(myAccount.toString());
    }
}
