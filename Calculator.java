import java.util.*;
class Calculator{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
       
        try{
            System.out.println("Enter a and b values");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Enter operator:");
            String op;
            op = sc.next().charAt(0);
            switch(op){
                case "+": {
                    System.out.println("Result="+(a+b));
                    break;
                }
                case "-": {
                    System.out.println("Result= "+(a-b));
                    break;
                }
                case "*": {
                    System.out.println("Result= "+(a*b));
                    break;
                }
                case "/": {
                    System.out.println("Result= "+(a/b));
                    break;
                }
                default:
                   System.out.println("invalid operator");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("denominator cannot be zero in division");
        }
}
}
