import java.util.*;
abstract class Bank{
    double getBalance();
}
class bankA extends Bank{
    double balance = 100;
    double getBalance(){
        return balance;
    }
}
class bankB extends Bank{
    double balance = 150;
    double getBalance(){
        return balance;
    }
    
}
class bankC extends Bank{
    double balance = 200;
    double getBalance(){
        return balance;
    }
}
class AbstractBankEx{
    public static void main(String args[]){
        bankA a = new bankA();
        System.out.println("Balance in bank A = $"+a.getBalance());
        bankB b = new bankB();
        System.out.println("Balance in bank B = $"+b.getBalance());
        bankC c = new bankC();
        System.out.println("Balance in bank C = $"+c.getBalance());
    }
}
