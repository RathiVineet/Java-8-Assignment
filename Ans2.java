@FunctionalInterface
interface Calculation{
    int calc(int a,int b);
}

class MethodRef{
    int add(int a,int b){
        return a+b;
    }

    int subtract(int a,int b){
        return a-b;
    }
    public  static int multiplication(int a,int b){
        return a*b;
    }
}
public class Ans2 {
    public static void main(String[] args) {


        MethodRef obj = new MethodRef();

        Calculation instanceRefAdd = obj::add;
        Calculation instanceRefSub = obj::subtract;
        Calculation staticRefMul = MethodRef::multiplication;

        System.out.println("Sum of 2 + 3 = " + instanceRefAdd.calc(2,3));
        System.out.println("Subtraction of 3 - 2 = " + instanceRefSub.calc(3,2));
        System.out.println("Multiplication of 3 * 2 = " + staticRefMul.calc(3,2));



    }
}