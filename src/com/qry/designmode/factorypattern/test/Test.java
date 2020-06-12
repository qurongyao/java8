package com.qry.designmode.factorypattern.test;

/**
 * @ClassName Test
 * @Package com.qry.designmode.factorypattern.test
 * @Description
 * @Author qurongyao
 * @Date 2020/6/11 19:37
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        Coster consumer1 = new AppleCoster();
        consumer1.sellFruits();

        //创建苹果贩实例
        Consumer consumer = AppleCoster::new;
        //
        Coster coster = consumer.buyFruits();
        coster.sellFruits();


        Consumer consumer2 = OrangeCoster::new;
        Coster coster1 = consumer2.buyFruits();
        coster1.sellFruits();

        Coster consumer3 = OrangeCoster::new;
        consumer3.sellFruits();
        System.out.println(consumer2);
        System.out.println(consumer3);
    }
}
