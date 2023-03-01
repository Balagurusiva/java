import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regax5 {
    public static void main(String args[]){
        String s1 = "java javacore corejava";

        //normal split will get the patter as argument
        String[] st1 = s1.split("\\s");

        for(String sta : st1){
            System.out.println(sta);
        }

        Pattern p = Pattern.compile("\\s");
         
        String[] st2 = p.split(s1);//regax split get the string as input 
        for(String sta1 : st2){
            System.out.println(sta1);
        }
    }
    
}
