import java.util.*;
public class Lottery {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int[] lottery = new int [5];
        for(int i=0; i< lottery.length; i++){
            lottery[i] = rand.nextInt(9);
        }

        int[] user = new int [5];
        
        for(int j=0; j< lottery.length; j++){
            System.out.println("Enter lottery digits (0-9): ");
            user[j] = input.nextInt();
            while(user[j] < 0 || user[j]> 9){
                System.out.println("Invalid digit. Enter lottery digits (0-9): ");
                user[j] = input.nextInt();
            }
        }
        System.out.print("Lottery Numbers: ");
        for(int k = 0; k< lottery.length; k++){
            System.out.print(lottery[k]+ " ");    
        }
        System.out.println();

        System.out.print("Your Numbers: ");
        for(int k = 0; k< lottery.length; k++){
            System.out.print(user[k]+ " ");
        }
        System.out.println();   

        int match = 0;
        System.out.print("Matching Digits: ");
        for(int k = 0; k< lottery.length; k++){
            if (user[k]==lottery[k])
                match += 1;
        }
        System.out.println(match);
        if (lottery==user)
                System.out.println("Congratulations! You are the grand-prize winner!");
        else
                System.out.println("You did not win");
        input.close();
    }
}
