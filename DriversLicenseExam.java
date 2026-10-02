import java.util.Scanner;
public class DriversLicenseExam {
    public static void main (String[] args) {
        int correct = 0;
        int incorrect = 0;
        String answer;
        char letter;
        char[] c_answers = {'A', 'D', 'B', 'B', 'C', 'B', 'A', 'B', 'C', 'D', 'A', 'C', 'D', 'B', 'D', 'C', 'C', 'A', 'D', 'B'};
        char[] answers = new char[20];
        Scanner input = new Scanner(System.in);
        for(int i=0; i<20; i++){
            System.out.println("Enter Answer for Question "+ (i+1) +": ");
            answer = input.nextLine();
            answer = answer.toUpperCase();
            letter = answer.charAt(0);
            answers[i]= letter;
            while(answers[i] != 'A' && answers[i] != 'B' && answers[i] != 'C' && answers[i] != 'D'){
                System.out.println("Invalid Answer. Enter Answer for Question "+ (i+1) +": ");
                answer = input.nextLine();
                answer = answer.toUpperCase();
                letter = answer.charAt(0);
                answers[i]= letter;
            } 
            
        }
        
        for(int j=0; j<20; j++){
            if(answers[j]==c_answers[j])
                correct+=1;
            else
                incorrect +=1;
        }
        System.out.println("Correct Answers: "+ correct);
        System.out.println("Incorrect Answers: " + incorrect);
        if(correct >= 15)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
        System.out.print("Questions answered incorrectly: ");
        for(int k=0; k< c_answers.length; k++){
            if (answers[k]!=c_answers[k])
                System.out.print(k + " ");
        }
        input.close();
    }
}
