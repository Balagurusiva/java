abstract class Figure{
    int dim1;
    int dim2;

    public Figure(int a, int b){
        this.dim1 = a;
        this.dim2 = b;
    }

    abstract int area(); //abstract method without no use in superclass but overrided in subclass
}

   
    class Triangle extends Figure{
        Triangle(int a, int b){
            super(a, b);
        }

        @Override
        int area(){
            System.out.println("area of the triange is: ");
            return dim1 * dim2;
        }
    }

    class Rectangle extends Figure{
        Rectangle(int a, int b){
            super(a, b);
        }

        @Override
        int area(){
            System.out.println("area of the rectangle is: ");
            return dim1 * dim2;
        }
    }


public class Abstract {
public static void main(String args[]){
    Triangle tri1 = new Triangle(10, 20);
    Rectangle rec1 = new Rectangle(30,50);

    Figure f ;

    f = tri1;
    System.out.println("area is:" +f.area());

    f = rec1;
    System.out.println("area is:" +f.area());
}
    
}

