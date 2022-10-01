@FunctionalInterface
interface Greater{
    boolean greater(int a,int b);
}

@FunctionalInterface
interface Increment{
    int increment(int a);
}

@FunctionalInterface
interface Concat{
    String concat(String a,String b);
}

@FunctionalInterface
interface Uppercase{
    String upper(String s);
}
public class Ans1 {
    public static void main(String[] args) {

        Greater great= (a,b) -> {
            if (a> b){return  true;}
            return  false;
        };

        System.out.println("Is first no greater then second : " + great.greater(5,2));

        Increment inc = (a)-> a+1;
        System.out.println("Before increment : "+ 5 +", After Increment : "+ inc.increment(5));

        Concat cat = (a,b)-> a+b;
        System.out.println("Concating  String : " + cat.concat("Hello","World"));

        Uppercase upr = (s)->s.toUpperCase();
        System.out.println("Uppercase String : " + upr.upper("Rathi"));

    }
}