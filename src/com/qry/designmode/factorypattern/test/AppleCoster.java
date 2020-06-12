package com.qry.designmode.factorypattern.test;

/**
 * @ClassName AppleCoster
 * @Package com.qry.designmode.factorypattern.test
 * @Description
 * @Author qurongyao
 * @Date 2020/6/11 19:34
 * @Version 1.0
 */
public class AppleCoster implements Coster {
    @Override
    public void sellFruits() {
        System.out.println("买苹果");
    }
}
