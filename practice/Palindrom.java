import java.util.Scanner;

class PalindromChecker{

    boolean isPalindrom(String word){
        String reverse= "";
        for(int i = word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        return word.equalsIgnoreCase(reverse);
    }
}

public class Palindrom {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scanner.nextLine();

        PalindromChecker check = new PalindromChecker();

        if(check.isPalindrom(word)){
            System.out.println(word + " is a palindrom ");
        }else{
            System.out.println(word +" is not a palindrom");
        }

        scanner.close();
    }
    
}
