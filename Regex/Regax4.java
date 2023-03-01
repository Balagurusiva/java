
//qunatifier

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regax4 {
    public static void main(String args[]){
        String s = "aab baaa abec aab bba ccd aa ab aaab aab";
        Pattern p = Pattern.compile("a+");
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.println(m.group() +" start at "+ m.start());
        }
    }
    
}
/*
 * + atleast one 
 * * any number
 * ? atmost one
 * {number} number of occurence
 * {num1, num2}  number of occuren between num1 and num 2
 */
