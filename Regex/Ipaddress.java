import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Ipaddress{
    public static void main(String args[]){
        String s = "1234.154.153.255";
        String A = "[0-2]{1}[0-9]{1}[0-5]{1}";
        String pattern = A+"\\."+A+"\\."+A+"\\."+A;
        Pattern p = Pattern.compile(pattern);//pattern use the the private constructor so we cannot create the new object for it and we use the mothed in it strightly
        Matcher m = p.matcher(s);//it match the compiled patter given by us with the given string

 
        if(m.find()){
            System.out.println(m.group() +  "true");
        }else{
            System.out.println(m.group()+"false");
        }
        
    }
}
