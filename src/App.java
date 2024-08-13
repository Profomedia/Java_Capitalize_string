import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String word;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name or city: ");
        word = scanner.nextLine().trim();
        
        // run the check limit
        checkLimits(word);

        // close the scanner
        scanner.close();

        // print the capitalized out put
        System.out.println(cap(word));
    }

    static void checkLimits(String word){
        // get input from the user
        Scanner scanner = new Scanner(System.in);

        // check if input is empty
        while(word.isEmpty()){
            System.out.print("Input cannot be empty: ");
            word = scanner.nextLine().trim();
        }
        // check length
        while(word.length() < 3){
            System.out.print("Characters must be at least 3, try again: ");
            word = scanner.nextLine().trim();

            // this line checks if the word is both empty and less
            if(word.isEmpty()){
                System.out.print("Input cannot be empty and ");
            }
        }
        scanner.close();
    }

    // capitalize the string
    public static String cap(String s){
        // extract the first letter and convert to uppercase
        String firstLetter = s.substring(0, 1).toUpperCase();
        
        // slice the first character of the string
        String strNoHead = s.substring(1, s.length());

        return firstLetter+strNoHead;
    }
}
