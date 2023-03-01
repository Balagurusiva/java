class ParentClient{
    public interface CallBack{
        void callBack(int param);
    }
}

class Client implements ParentClient.CallBack{
    public void callBack(int p){
        System.out.println("callback from client " +p);
    }
}

public class NestedInF {
    public static void main(String args[]){
        ParentClient.CallBack c1 = new Client();
        c1.callBack(20);

    }
}
