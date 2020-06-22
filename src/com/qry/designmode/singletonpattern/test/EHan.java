package com.qry.designmode.singletonpattern.test;

/**
 * @ClassName EHan
 * @Package com.qry.designmode.singletonpattern.test
 * @Description 饿汉式
 * @Author qurongyao
 * @Date 2020/6/22 10:07
 * @Version 1.0
 */
public class EHan {
    private static EHan instance = new EHan();

    private EHan() {
    }
    /*
    *   饿汉式，从名字上也很好理解，就是“比较勤”，实例在初始化的时候就已经建好了，
    *   不管你有没有用到，都先建好了再说。好处是没有线程安全的问题，坏处是浪费内存空间
    * */
    public static EHan getInstance() {
        return instance;
    }

}
