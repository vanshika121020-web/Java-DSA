import java.util.Scanner;
public class CheckCharacter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a character :");

        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch))
            System.out.println("It is is an Alphabet");
        else if (Character.isDigit(ch))
            System.out.println("It is a Digit");
        else
            System.out.println("It is a special character");    
    }

}