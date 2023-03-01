class Multiple{
    synchronized void printTable(int n){
        for(int i =1; i<=5;i++){
            System.out.println(n*i);
            try{Thread.sleep(1000);}catch(InterruptedException e){}
        }
    }
}

public class Sync {
    public static void main(String args[]){
        Multiple m1 = new Multiple();
        Thread t1 = new Thread(){
            public void run(){
                m1.printTable(5);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                m1.printTable(10);
            }
        };

        t1.start();
        t2.start();

    }
    
}
