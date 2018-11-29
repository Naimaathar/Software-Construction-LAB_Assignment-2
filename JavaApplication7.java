
package javaapplication7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaApplication7 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      System.out.println("enter statement");
 
      String statement=input.nextLine();
            Pattern p = Pattern.compile("^if(/d+/d>/d)/s+(/w=/d)/s+else( /w=/d )");
    Matcher m = p.matcher(statement);

        boolean b= m.matches();
        
                      System.out.println(b);}

      
    }
    
