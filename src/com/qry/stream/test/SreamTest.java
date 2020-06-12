package com.qry.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName SreamTest
 * @Package com.qry.stream.test
 * @Description
 * @Author qurongyao
 * @Date 2020/6/12 11:07
 * @Version 1.0
 */
public class SreamTest {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "张三", 18),
                new User(3, "李四", 18),
                new User(5, "王五", 43),
                new User(2, "赵柳", 18),
                new User(9, "小三", 13),
                new User(17, "曲荣耀", 12),
                new User(10, "小七", 18),
                new User(8, "小巴", 7),
                new User(7, "小舞", 9),
                new User(13, "张三", 26)
        );
//        groupBy(users);
        stord(users);
    }
    /**
     * @Description: 分组
     * @Param
     * @return
     */
    public static void groupBy(List<User> list){
        Map<Integer, List<User>> collect = list.stream().collect(Collectors.groupingBy(item->item.getAge()));
        List<User> users = collect.get(18);
        users.forEach(System.out::println);
    }
    /**
     * @Description: 排序
     * @Param
     * @return
     */
    public static void stord(List<User> list){
        List<User> collect = list.stream().sorted((a,b)->a.getAge().compareTo(b.getAge())).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

}
