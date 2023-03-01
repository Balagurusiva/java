class DataBase implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("database updating");
            try {Thread.sleep(2000);} catch (InterruptedException e) {}
        }      
    }
}

class Book implements Runnable{
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println(i);
            try{Thread.sleep(1000);}catch(InterruptedException e){}
        }
    }
}

public class ImplementThread{
    public static void main(String args[]){
        Runnable  db1 = new DataBase();
        Book b1 = new Book();

        Thread t1 = new Thread(db1);
        Thread t2 = new Thread(b1);

        t1.start();
        t2.start();

    }
}