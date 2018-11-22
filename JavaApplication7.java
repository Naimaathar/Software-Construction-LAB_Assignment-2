/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author comsats
 */
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
    
