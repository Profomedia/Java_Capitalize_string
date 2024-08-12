import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String word;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name or city: ");
        word = scanner.nextLine().trim();
        
        while(word.isBlank()){
            System.out.print("Input cannot be empty: ");
            word = scanner.nextLine().trim();
            
            while(word.length() < 3){
                System.out.print("Min length of char should be at least 3: ");
                word = scanner.nextLine().trim();
                continue;
            }
        }
        scanner.close();
        System.out.println(cap(word));
    }

    public static String cap(String s){
        // extract the first letter and convert to uppercase
        String firstLetter = s.substring(0, 1).toUpperCase();

        // slice the first character of the string
        String strNoHead = s.substring(1, s.length());

        return firstLetter+strNoHead;
    }
}
