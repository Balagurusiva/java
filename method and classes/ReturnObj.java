class Test{
    int a;
    
    Test(int i){
        this.a = i;
    }

    int getA(){
        return a;
    }

    Test increByTen(){
         Test temp = new Test(a+10);
         return temp;
    } 
}

public class ReturnObj {

    public static void main(String args[]){
        Test obj1 = new Test(3);
        System.out.println(obj1.getA());

        Test obj2 = obj1.increByTen();
        obj2.a = 10;
        
        System.out.println(obj2.getA());
        }
}
 
    

