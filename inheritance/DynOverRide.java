class Figure{
    int dim1;
    int dim2;

    public Figure(int a, int b){
        this.dim1 = a;
        this.dim2 = b;
    }

    int area(){
        System.out.println("no figure is used");
        return 0;
    }
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

        void volume(){
            System.out.println("work agala");
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


public class DynOverRide {
public static void main(String args[]){
    Figure fig = new Figure(0, 0);
    Triangle tri1 = new Triangle(10, 20);
    Rectangle rec1 = new Rectangle(30,50);

    Figure f ;
    f = fig;
    System.out.println("area is: " +f.area());

    f = tri1;
    System.out.println("area is:" +f.area());
    //System.out.println("volume is " +f.volume()); error even ref variable of super class assigned to sub classs obj it doesnt know the metho
    //private to sub class

    f = rec1;
    System.out.println("area is:" +f.area());
}
     
}
