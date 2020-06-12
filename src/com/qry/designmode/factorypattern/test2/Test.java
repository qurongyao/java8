package com.qry.designmode.factorypattern.test2;

/**
 * @ClassName Test
 * @Package com.qry.designmode.factorypattern.test2
 * @Description
 * @Author qurongyao
 * @Date 2020/6/12 10:03
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new AppleFactory();
        factory.factory().product();
    }
}
