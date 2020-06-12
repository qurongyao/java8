package com.qry.designmode.factorypattern.test2;

/**
 * @ClassName Orange
 * @Package com.qry.designmode.factorypattern.test2
 * @Description
 * @Author qurongyao
 * @Date 2020/6/12 10:01
 * @Version 1.0
 */
public class Orange extends Product {
    @Override
    void product() {
        System.out.println("具体产品类  橘子");
    }
}
