

import java.util.Scanner;
import java.util.Random;



public class stonepaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("(0) For Rock,  (1) For Paper,  (2) For Scissors: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(computerInput==0){
            System.out.println("Computer Input (0) -- Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer input (1) -- Paper");
        }
        else {
            System.out.println("Computer input (2) -- Scissors");
        }

        if (userInput==computerInput){
            System.out.println("Match is Draw");
        }
        else if (userInput==0&&computerInput==2 || userInput==1&&computerInput==0||userInput==2&&computerInput==1){
            System.out.println("You Won!!!!!!");
        }
        else{
            System.out.println("You Lose--Better luck Next Time!!!");
        }
    }
    
}

    

