package class14;

public class Account {
    String accountNumber="123456";
    double balance=-350;
    String userName="user123";
     private String password="Pass123";//if we put private we cant accesses
    //password in tester just in same class
    void printInfo(){
        System.out.println(accountNumber);
    }
}
