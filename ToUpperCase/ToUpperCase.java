import java.util.Scanner;
public class ToUpperCase {
    public static void main(String args[]){
        int asciival = 0;
        //a variable to store ascii values
        Scanner screen = new Scanner(System.in);
        //a scanner to get user input
        String theWord = screen.nextLine();
        //getting the word to convert
        String outputWord = "";
        //the string that will store the output word
        char subLetter = 'a';
        //a char variable to store every letter of the word
        for(int i = 0; i < theWord.length(); i++){
            subLetter = theWord.charAt(i);
            asciival = subLetter;
            //converting the letters to its ascii values
            /*
            if(asciival >= 65 && asciival <= 90 || asciival >= 97 && asciival <= 122 == false){
                System.out.println("invalid input");
                break;
            }
            */
            //to check if the string is a letter
            if(asciival >= 97 && asciival <= 122 == true){
                outputWord += (char) (asciival - 32);
                //if lower case -32 to get the upper case zone
            } else{
                outputWord += subLetter;
            }
        }
        System.out.println(outputWord);
        //print statement
    }
}