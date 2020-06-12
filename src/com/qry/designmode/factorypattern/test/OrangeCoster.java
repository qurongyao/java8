package com.qry.designmode.factorypattern.test;

/**
 * @ClassName OrangeCoster
 * @Package com.qry.designmode.factorypattern.test
 * @Description
 * @Author qurongyao
 * @Date 2020/6/11 19:46
 * @Version 1.0
 */
public class OrangeCoster implements Coster {
    @Override
    public void sellFruits() {
        System.out.println("卖橘子");
    }
}
