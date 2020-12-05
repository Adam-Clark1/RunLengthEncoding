package runlengthencoding;

import java.util.ArrayList;
import java.util.Scanner;


public class RunLengthEncoding {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        ArrayList<Character> userinput = new ArrayList<>();
        
        System.out.println("Whats you input (numbers must be less then 10): e.g. 1a2b3c4d");
        String user = input.nextLine();
        
        for (int i = 0; i < user.length(); i++) {
            userinput.add(user.charAt(i));
            
        }
        
        for (int i = 0; i < userinput.size(); i++) {
            for (int j = 48; j < userinput.get(i); j++) {
                System.out.print(userinput.get(i+1));
            }
            i++;
            
        }
        
        
    }
    
}
