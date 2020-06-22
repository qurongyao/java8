package com.qry.designmode.singletonpattern.test;

/**
 * @ClassName LHan
 * @Package com.qry.designmode.singletonpattern.test
 * @Description  懒汉式
 * @Author qurongyao
 * @Date 2020/6/22 9:28
 * @Version 1.0
 */
public class LHan {
    private static LHan instance;//懒汉式

    private LHan() {
    }
    /*
    *  懒汉式，顾名思义就是实例在用到的时候采取创建，
    *   “比较懒”，用的使用才去检查有没有实例，如果有则返回，没有则创建
    *  有线程安全和不安全两种写法，区别就是synchronized关键字
    * */
    public static LHan getInstance() {
        if(instance == null){
             instance = new LHan();
        }
        return instance;
    }
}
