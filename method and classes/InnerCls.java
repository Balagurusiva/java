
    class OuterClass {
        private int outerX = 100;
        void print(){
            InnerClass inner = new InnerClass();
            System.out.println(inner.innerX);
        }
    
        class InnerClass {
            static int innerX = 200;
            public void printOuterX() {
                System.out.println("outerX = " + outerX);
            }
        }
    }
    
    public class InnerCls {
        public static void main(String[] args) {
            OuterClass outer = new OuterClass();
            OuterClass.InnerClass inner = outer.new InnerClass();
            inner.printOuterX();
            outer.print();
        }
    }