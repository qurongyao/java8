package com.qry.designmode.factorypattern.test2;

/**
 * @ClassName Apple
 * @Package com.qry.designmode.factorypattern.test2
 * @Description  具体产品类
 * @Author qurongyao
 * @Date 2020/6/12 10:00
 * @Version 1.0
 */
public class Apple extends Product {
    @Override
    void product() {
        System.out.println("具体产品类  苹果");
    }
}
