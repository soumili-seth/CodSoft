import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {

        Float m1,m2,m3,m4,m5,t;

        double p;

        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter your marks for all subjects:");

        System.out.println( "English:");
        m1 = sc.nextFloat();

        System.out.println( "Biology:");
        m2 = sc.nextFloat();

        System.out.println( "Mathemetics:");
        m3 = sc.nextFloat();

        System.out.println( "Physics:");
        m4 = sc.nextFloat();

        System.out.println( "Chemistry:");
        m5 = sc.nextFloat();

        sc.close();

        System.out.println("Your marks are " + m1 + "," +m2+","+m3+","+m4+","+m5+" " );

        t=(m1+m2+m3+m4+m5);

        System.out.println("Your total marks is: " + t + " " );

        p= (float) ((t / 500)* 100);

        System.out.println("Your average percentage is: " + p + " " );

        if(p>=80){

         System.out.println( "Your grade is O !!! Oustanding");

         }

         else if(p>=70 && p<80){
            System.out.println( "Your grade is E!! Excellent");
         }

         else if(p>=60 && p<70){
            
            System.out.println( "Your grade is A !! Average");
         }

         else if(p>=40 && p<60){
            
            System.out.println( "Your grade is B !! Below average");
         }

         else {
           
            System.out.println( "Your grade is F !! Failed");

         }



    }



}
