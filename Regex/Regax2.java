
// character class

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regax2 {
    public static void main(String args[]){
        String s = "asdjfvnbneifunef1239c7896!@#$%^&*()";
        Pattern p = Pattern.compile("[abc]");// only print a b and c
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.println(m.group() + " start at " + m.start());
        }
    }
    
}
//[a-z] print the charter only between a to z
//[A-Z] print the charcter only between A to Z
//[a-zA-z] print both a-z and A-Z
//[^a-zA-Z0-9] print expect the alphanumeric charcters like spcl symbols
