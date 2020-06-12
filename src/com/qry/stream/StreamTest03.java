package com.qry.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;



/**
 * @ClassName StreamTest03
 * @Package com.qry.stream
 * @Description
 * @Author qurongyao
 * @Date 2020/6/11 13:18
 * @Version 1.0
 */
public class StreamTest03 {
    public static void main(String[] args) {
        List<String > list = Arrays.asList("1", "2", "3", "4", "5", "6", "7","8","9");
     //   Map<String, Integer> collect = list.stream().map(e -> new Integer(e)).filter(i -> i % 2 == 1).distinct().collect(Collectors.toMap(e -> e+"0", e -> e));
       /* collect.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String integer, Integer integer2) {
                System.out.println("key="+integer+"  value="+integer2);
            }
        });*/
       // collect.forEach((k,v)-> System.out.println(k+"   "+v));
        Integer reduce = list.stream().map(item -> new Integer(item)).distinct().reduce(0, (x, y) -> {
            return x + y;
        });
       // System.out.println(reduce);
        //System.out.println(9%2);
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(integers));
    }

    private static void print(String k, Integer v) {
        System.out.println("key="+k+"  value="+v);
    }

    public static Integer sum(Integer[] numbers){
        int length = numbers.length;
        Integer number = numbers[length - 1];
        if(length%2==0){
            return length/2*number+number/2;
        }else{
            return (length/2+1)*number;
        }
    }

}
