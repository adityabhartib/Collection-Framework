package java8features;

import com.bridgelabz.ComparatorSample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreanApi {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

//        Predicate<Integer>predicate=(x) -> x%2 ==0;
//        System.out.println(predicate);

        List<Integer>list2 =list.stream().filter(x ->x%2==0).collect(Collectors.toList());
        System.out.println(list2);

        List<Integer>list3=list.stream().map(x -> x*5).collect(Collectors.toList());
        System.out.println(list3);

        List<Integer> list4=list.stream().filter(x -> x%5==0).collect(Collectors.toList());
        System.out.println(list4);

        list.stream().filter(x -> x%2==0).map(x ->x*5).forEach(x -> System.out.println(x));

        System.out.println("Result => "+ list.stream().reduce(1,(x,y) -> x*y));

        Integer res =list.stream().filter(x -> x%2==0).map(y -> y *5).reduce(1,(z,w) -> z*w);
        System.out.println("Result => " +res);

        Comparator<Integer>comparator =new ComparatorSample<>();

        list.stream().sorted(comparator).forEach(x -> System.out.println(x));

    }
}
