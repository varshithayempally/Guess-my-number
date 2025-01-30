import java.util.Scanner;
public class Guessmynumber {
    public static void main(String[]args){
        int numbertoguess=(int)
        (Math.random()*100)+1;
        int userguess=0;
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100:");
        while(userguess !=numbertoguess){
            System.out.print("enter your guess:");
            userguess=Scanner.nextInt();
            if(userguess<numbertoguess){
                System.out.println("too low! try again.");
            }
            else if(userguess>numbertoguess){
                System.out.println("too high! try again.");
            }else{
                System.out.println("congratulations! you guessed the number.");
            }
        }
        Scanner.close();
    }
    
}
