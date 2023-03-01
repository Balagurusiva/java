/* some of methods are
 * getName getPriority isalive join run start sleep
 */

class MainThread{
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        //Thread t = new Thread(); to create a new thread 
        System.out.println( t.getName());
        t.setName("mymainthread");
        System.out.println( t.getName());
        
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}