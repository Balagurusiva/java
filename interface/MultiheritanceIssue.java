// multiple inheritance issue in interface

interface Beta{
    default void print(){
        System.out.println("hello world");
    };
    void hello();
}

interface Alpha extends Beta{
    void print();
    void world();
}

class Myclass implements Beta{

    public void print(){
        System.out.println("from my class");
    }
    public void hello(){
       System.out.println("hello");
    }
    public void world(){
        System.out.println("world");
    }

}

public class MultiheritanceIssue{
    public static void main(String args[]){
        Myclass obj = new Myclass();
        obj.print();
    }
} 