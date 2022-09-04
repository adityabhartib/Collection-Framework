package java8features;

@FunctionalInterface
interface IMathFunction{
    int calculator (int x,int y);
    default void defultmethod(){
        System.out.println("Defult Method");
    }
    static void staticMethod(int x, int y,String function , IMathFunction ref){
        System.out.println(function+ " of "+ x +" & " + y +" is =>"+ ref.calculator(x,y));
    }
}
class Sum implements IMathFunction{

    @Override
    public int calculator(int x, int y) {
        return x+y;
    }
}
class Multiply implements IMathFunction{
    @Override
    public int calculator(int x, int y) {
        return x*y;
    }
}
public class MainClass {
    public static void main(String[] args) {

        IMathFunction sum = Integer::sum;
//        IMathFunction sum = (a, b) -> a + b;
        IMathFunction multiply = (a,b) -> a*b;

        System.out.println(sum.calculator(4,7));
        System.out.println(multiply.calculator(7,4));

//        IMathFunction.staticMethod(4,7,"Sum", Integer::sum);
//        IMathFunction.staticMethod(4,8,"Product",(a,b)->a*b);

    }
}
