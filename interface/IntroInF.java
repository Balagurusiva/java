interface CallBack{
    void callBack(int param);    // interface is outline of classes with method without body 
    //void toCrateABstractClass(int param);  // specify what to do but not how to do
}

class Client implements CallBack{    // the method used from interface must be public
    public void callBack(int p){     //this class use the interface method
        System.out.println("callback called with "+p);
    }
}

//class Anotherclient implements CallBack{   //this error due to unimplementation of one method from the interface add abstract to remove it 
 class Anotherclient implements CallBack{ 
    public void callBack(int p){      //this class also use the interface in th different way
        System.out.println("callback from another client");
        System.out.println("p squre" + p*p);
    }

    void priAC(int p){                //this is a private method of another client which is not accessable by interface 
        System.out.println("private method in another client");
    }
}


public class IntroInF {

    public static void main(String args[]){
        //here the interface reference variable assigned with the class obj that use the interface
        CallBack c = new Client();
        c.callBack(20);

        Anotherclient c1 = new Anotherclient();
        c1.callBack(30);
        c1.priAC(10);           //this private method cannot accessed by the interfac so it 
                                  //use the same class to create a object
    }
    
}
