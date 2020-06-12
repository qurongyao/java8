package com.qry.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest01
 * @Package com.qry.stream
 * @Description 构造流的几种常见方法
 * @Author qurongyao
 * @Date 2020/6/8 9:59
 * @Version 1.0
 */
public class StreamTest01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");
        String[] strArray = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(strArray);
        List<String> strings = Arrays.asList("a","b","c");
        Stream<String> stream2 = strings.stream();
        /*
        * 需要注意的是，对于基本数值型，目前有三种对应的包装类型Stream:
        * IntStream,LongStream,DoubleStream.当然我们也可以用Stream<Integer>,Stream<Double>,Stream<Long>,但是boxing和unboxing会很耗时，
        * 所以特别为这三种基本数值类型提供了队形的Stream
        * */
        //流转换为其它数据结构
        //1.Array
        String[] strArray1 = stream.toArray(String[]::new);
        //Collection
        List<String> list1 = stream.collect(Collectors.toList());
        Collection<String> collect = stream.collect(Collectors.toCollection(ArrayList::new));
        Stack<String> stack = stream.collect(Collectors.toCollection(Stack::new));
        //3.String
        String string = stream.collect(Collectors.joining()).toString();
    }
}
