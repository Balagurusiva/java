import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regax1{
    public static void main(String args[]){
        String s = "thupparku thuppaya thuppaki thupparku thuppaya  thuvum mazhai";
        Pattern p = Pattern.compile("thuppa");//pattern use the the private constructor so we cannot create the new object for it and we use the mothed in it strightly
        Matcher m = p.matcher(s);//it match the compiled patter given by us with the given string

        int count =0;
        while(m.find()){
            count++;
            System.out.println(m.group() + "start at " + m.start() +"ends at " + m.end());
        }
        System.out.println(count);
    }
}
// ^ used to find the given regax is at start of the input string
// $ used to find the given regax is at end of the input string
// | used check the two letter at same time