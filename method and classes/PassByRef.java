
    class Person{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        int getAge(){
            return this.age;
        }

        int setAge(int age){
            return this.age = age;
        }

        public int addAge(Person p) {
         return   p.setAge(p.getAge() +1);
        }
    }

public class PassByRef {
    public static void main(String args[]){
        Person p1 = new Person("bala", 20);
        Person p2 = new Person("ram", 30);
        System.out.println("age before the call:" +p1.getAge());
        System.out.println("age afte call:" + p2.addAge(p2));
    }

    
 
}
