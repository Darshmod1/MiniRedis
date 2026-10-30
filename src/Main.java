import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (true){
            System.out.print("> ");
            userInput = scanner.nextLine().trim();
            if(userInput.equals("EXIT")){
                break;
            }
            System.out.println("You typed " + userInput);
        }
    }

}