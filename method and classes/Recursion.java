class Fact{

    int fact(int j){
        int result;
        if(j == 1)
          return 1;
        else
           result = fact(j-1) * j;
        return result;
    }
}

public class Recursion {
    public static void main(String args[]){
        Fact factorial = new Fact();
        System.out.println(factorial.fact(5));
    }
    
}
