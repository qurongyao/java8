package com.qry.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest02
 * @Package com.qry.stream
 * @Description
 * @Author qurongyao
 * @Date 2020/6/8 10:48
 * @Version 1.0
 */
public class StreamTest02 {
    public static void main(String[] args) {
        //转化大写,
        Stream<String> stream = Stream.of("hello", "world");
       /*
        Stream<String> stringStream = stream.map(String::toUpperCase);
        List<String> collect = stringStream.collect(Collectors.toList());
        collect.forEach(System.out::println);*/
        //平方数
        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list2 = asList.stream().map(n -> n * n).collect(Collectors.toList());
       // list2.forEach(System.out::println);
        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        Stream<Integer> integerStream = listStream.flatMap(list -> list.stream());
       // integerStream.forEach(System.out::println);
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);
        Integer[] integers = stream1.filter(item -> item % 2 == 0).toArray(Integer[]::new);

        Stream<Integer> integerStream1 = Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 7, 8, 8, 9);
        integerStream1.filter(i->i%2==0).distinct().skip(2).forEach(System.out::println);
        /*List<Integer> collect1 = stream.map(String::length).collect(Collectors.toList());
        collect1.forEach(System.out::println);*/
        Stream<String[]> stream2 = stream.map(s -> s.split(""));
        List<String> list = stream2.flatMap(Arrays::stream).collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
