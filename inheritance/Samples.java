class Vehicals{
    public Vehicals(String model, int year){
        this.model = model;
        this.year = year;
    }
 
    String model;
    int year;

    void getModel(){
        System.out.println(model);
    }

    void getYear(){
        System.out.println(year);
    }

    void detail(){
        System.out.println(model+" "+year);
    }
}

class Car extends Vehicals{
    String name;
    public Car(String name, String model, int year){
        super(model, year);
        this.name = name;
    }

    @Override // mthod overriding
    void detail(){           // method with same name in superclass
        super.detail();
        System.out.println(name);
    }
}



public class Samples {
       public static void main(String args[]){
        Vehicals v1 = new Vehicals("diseal",2020);
        Car car1 = new Car("hello", "petrol", 2020);
        v1.getModel();
        car1.detail();
        car1.getModel();
        car1.getYear();
    }

    
}
