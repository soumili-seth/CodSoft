import java.util.Scanner;

public class Task4{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter:");
        System.out.println("1. USD to Rupee ");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee ");
        System.out.println("4. Rupee to Euro");
        System.out.println("Enter your choice(1,2,3 or 4)");

        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter the amount in USD: ");
            double USD = sc.nextDouble();
            double Rupee = usdToRupee(USD);
            System.out.println("Converted amount in Rupee : " + Rupee);
        }

        else if (choice == 2) {
            System.out.println("Enter the amount in Rupee: ");
            double Rupee = sc.nextDouble();
            double USD = RupeeToUsd(Rupee);
            System.out.println("Converted amount in USD : " + USD);
        }

        else if (choice == 3) {
            System.out.println("Enter the amount in Euro: ");
            double Euro = sc.nextDouble();
            double Rupee = EuroToRupee(Euro);
            System.out.println("Converted amount in rupee : " + Rupee);
        }

        else if (choice == 4) {
            System.out.println("Enter the amount in Rupee: ");
            double Rupee = sc.nextDouble();
            double Euro = RupeeToEuro(Rupee);
            System.out.println("Converted amount in Euro : " + Euro);
        }

        else{
            System.out.println(" Invalid Choice ");
        }

        sc.close();
    }


    public static double usdToRupee(double USD){
        return USD * 83.47;
    }

    public static double RupeeToUsd(double Rupee){
        return Rupee * 0.0119804;
    }

    public static double EuroToRupee(double Euro){
        return Euro * 89.10;
    }

    public static double RupeeToEuro(double Rupee){
        return Rupee * 0.0113;

    }

}