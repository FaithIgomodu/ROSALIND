
//Import Hasmap and Map for DNA complement table. Scanner object for user input. 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseComplement {
    //Main method - program begins here, does not return a value. 
    public static void main(String[] args){
        String reversedComp = "";

        //Created Map to store DNA base pair and their complements 
        Map<Character, Character> complements = new HashMap<>();
        //Added base pairs and their complements to map  
        complements.put('A', 'T');
        complements.put('C', 'G');
        complements.put('T', 'A');
        complements.put('G', 'C');

        //Created scanner object for user input 
        Scanner inPut = new Scanner(System.in);
        //Prompt for user to enter sequence 
        System.out.println("Enter DNA Sequence To Compute Its Complement");
        //Store user input in variable userInput 
        String userInput = inPut.nextLine();
        //Display user input for confirmation 
        System.out.println("The DNA sequence is:"+ " \n"+ userInput + " \n");
        //Created string builder object to make complementary strand 
        StringBuilder compStrand = new StringBuilder();
        //Read each character in DNA sequence one base at a time 
        for(char c: userInput.toCharArray()){
            //Convert bases to uppercase to prevent errors 
            char upperC = Character.toUpperCase(c);
            //Replace each base in sequence with its complement from the MAP 
            //Keep original base (default) if base is not valid 
            char compLement = complements.getOrDefault(upperC, upperC);
            //Add complement to string 
            compStrand.append(compLement);

        }
        //complementary strand
         String complementary = compStrand.toString();
        //Determine reverse complement
        reversedComp = compStrand.reverse().toString();

        //Display original  DNA sequence and its complement strand 
        System.out.println( " \n"+ "The DNA sequence is and Its Complement:"+
                " \n"+ userInput + "\n" + complementary);
        //Display reverse complement
        System.out.println("Reverse Complement is:" + " "+ reversedComp);




    }
}
