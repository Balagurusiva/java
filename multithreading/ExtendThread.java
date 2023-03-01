
class DataBase1 extends Thread{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println("updataing database");
            try{Thread.sleep(2000);}catch(InterruptedException e){}
        }
    }
}

class Book1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i);
            try{Thread.sleep(1000);}catch(InterruptedException e){}
        }

    }
}

public class ExtendThread {
    public static void main(String args[]){
        DataBase1 db1 = new DataBase1();
        Book1 b1 = new Book1();



       db1.start();
       b1.start();

    
    }
}
