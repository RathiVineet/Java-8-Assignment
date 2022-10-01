interface A{
    default void print(){
        System.out.println("A");
    }
}
interface B{
    default  void print(){
        System.out.println("B");
    }
}
public class Ans5 implements A,B{
    public void print(){
        System.out.println("Multiple Inheritance");
    }

    public static void main(String[] args) {
        Ans5 obj = new Ans5();
        obj.print();
    }

}