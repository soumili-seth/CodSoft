import java.util.Scanner;

public class Task1 {
    public static void main ( String [] args )
{
    int max = 100;
    int min= 1;

    int num = (int) (Math.random()*(max-min+1)+min);

    Scanner sc = new Scanner(System.in);
    
    sc.close();
    int choice;

    int i,k=4;

    for(i=0; i<k;i++)
    {
        System.out.println("Enter your guess number between "+max+" and "+min+":");
        choice = sc.nextInt();   

        if(choice==num){
            System.out.println(
                "Congratulations!"
                + " You guessed the number.");
                if (i==0){
                    System.out.println("Your score is 100");
                }

                if (i==1){
                    System.out.println("Your score is 75");
                }

                if (i==2){
                    System.out.println("Your score is 50");
                }

                if (i==3){
                    System.out.println("Your score is 25");
                }
          break;
             
        }

        else if( choice>num  &&  i!= (k-1) ){

            System.out.println(
                    "The guess number is higher"
                    + " than generated number");

            }
        else if(choice<num  &&  i!= (k-1)){
            System.out.println(
                    "The guess number is "
                    + "less than generated number");
                    
        }

         }

         if(i==k){

            System.out.println("You have exhausted "+k+" trials.");
            System.out.println("You score is 0");
            System.out.println("Random integer value is : "+num+"");
        }

       
    
} 

    
}
