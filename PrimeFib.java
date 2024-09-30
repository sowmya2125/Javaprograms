import java.util.*;
class PrimeFib{
    static boolean prime(int num){
        if(num==1)
            return false;
        for(int i=2;i<num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    static boolean fibonacci(int num){
        int a=0;int b=1;int c;
        for(int i=0;i<num;i++){
            c = a+b;
            if(c==num){
                return true;
            }
            a=b;b=c;
        }
        return false;
    }
    public static void main(String args[]){
        int n;Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which number you want the numbers which are both prime and fibonnaci: ");
        n=sc.nextInt();
        System.out.print("Numbers which are both prime and fiboacci: ");
        for(int i=1;i<=n;i++){
        if(prime(i)&&fibonacci(i)){
            System.out.print(i+" ");
        }
    }  
    }
}
