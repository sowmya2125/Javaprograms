import java.util.*;
class Converter {
    public void convert() {
        System.out.println("Base Converter.");
    }
}
class CurrencyConverter extends Converter {
    double dollar_inr = 83.5;
   
    @Override
    public void convert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Currency Converter");
        System.out.println("1.Dollar to INR");
        System.out.println("2.INR to Dollar");
        System.out.print("Select option: ");
        int choice = sc.nextInt();
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(amount + " USD = " + (amount * dollar_inr) + " INR");
                break;
             case 2:
                System.out.println(amount + " INR = " + (amount / dollar_inr) + " USD");
                break;
                      default:
                System.out.println("Invalid choice.");
        }
    }
}

class DistanceConverter extends Converter {
    @Override
    public void convert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Distance Converter");
        System.out.println("1.Meters to Kilometers");
        System.out.println("2.kilometers to meters");
        System.out.print("Select option: ");
        int choice = sc.nextInt();
        System.out.println("enter distance: ");
        double distance = sc.nextDouble();
        switch (choice) {
            case 1:
                System.out.println(distance + " meters = " + (distance / 1000) + " kilometers");
                break;
            case 2:
                System.out.println(distance + " kilometers = " + (distance * 1000) + " meters");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

class TimeConverter extends Converter {
    @Override
    public void convert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Time Converter");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Minutes to Hours");
        System.out.print("Select option: ");
        int choice = sc.nextInt();
        System.out.print("Enter the time: ");
        double time = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(time + " hours = " + (time * 60) + " minutes");
                break;
             case 2:
                System.out.println(time + " minutes = " + (time / 60) + " hours");
                break;
             default:
                System.out.println("Invalid choice.");
        }
    }
}

public class ConverterEx {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Converter Application");
        System.out.println("Select Converter Type:");
        System.out.println("1. Currency Converter");
        System.out.println("2. Distance Converter");
        System.out.println("3. Time Converter");
        System.out.print("Enter your choice: ");
        int converterType = sc.nextInt();

        Converter converter = null;

        switch (converterType) {
            case 1:
                converter = new CurrencyConverter();
                break;
            case 2:
                converter = new DistanceConverter();
                break;
            case 3:
                converter = new TimeConverter();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (converter != null) {
            converter.convert();
        }

        sc.close();
    }
}
