class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}

class Person{
    int age;
    public void setAge(int i) throws AgeException{
        if(i < 18){
            throw new AgeException("enter age above 18");
        }

        this.age = i;
    }
}

public class OwnExcp{
    public static void main(String args[]){
        Person p1 = new Person();
        Person p2 = new Person();

        try{
           p1.setAge(10);
           p2.setAge(20);
        }catch(AgeException e){
           System.out.println(e.getMessage());
        }
        
    }
 
}