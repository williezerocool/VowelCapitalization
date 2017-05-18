/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelcapitalization;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class VowelCapitalization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("open which file: ");
        String input = keyboard.next();
        
        Scanner file = new Scanner(new File(input));
       
        
       while(file.hasNext()){
           
            String a = file.nextLine();
            
            for(int i=0; i<a.length(); i++){
               
                char b = a.charAt(i);
                String vowel = Character.toString(b);

                if("a".equals(vowel) || "e".equals(vowel) || "i".equals(vowel) || "o".equals(vowel) || "u".equals(vowel)) {
                
                    System.out.print(vowel.toUpperCase());
                }else{
                
                    System.out.print(vowel);
                }
                  
           
            }
       }
        
        
        
        
        
   
    
    }
    
    
}
