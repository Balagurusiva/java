class Stck{
    int[] stack;
    int tos;

    Stck(int n){
        this.stack = new int[n];
        this.tos = -1;
    }

    void push(int item){
        if(tos == stack.length-1){
            int temp[] = new int[stack.length * 2];
            for(int i =0; i<stack.length;i++)temp[i] = stack[i];
            stack = temp;
            stack[++tos] = item;

        }else{
            stack[++tos] = item;
        }
    }

     int pop(){
        if(tos < 0){
            System.out.println("stack is underflow");
            return 0;
        }else{
            return stack[tos--];
        }
    }

    void getItem(){
        for(int i=0; i<=tos;i++){
            System.out.print(stack[i]+" ");
        }
    }
}

public class Stack {
    public static void main(String args[]){
        Stck s1 = new Stck(10);
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(4);
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(4);
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(4);
        
        System.out.println("before pop :");
        s1.getItem();
        System.out.println("after pop:");
        s1.pop();
        s1.getItem();
    }
    
}
