package java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {
    public static void main(String[] args) {
        Consumer<Integer>consumer=(a) -> {
            a *=10;
            System.out.println(a);
        };
        consumer.accept(8);
//        -------------
        Predicate<Integer>predicate=(x) ->x==10;
        System.out.println(predicate.test(10));
//        -----------------------

        Function<Integer,Integer>function=(x) ->x* 5;
        System.out.println(function.apply(5));

        Supplier<String>supplier =() ->"BCD";
        System.out.println(supplier.get());
    }
}
