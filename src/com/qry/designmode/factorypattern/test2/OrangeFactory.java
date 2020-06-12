package com.qry.designmode.factorypattern.test2;

/**
 * @ClassName OrangeFactory
 * @Package com.qry.designmode.factorypattern.test2
 * @Description
 * @Author qurongyao
 * @Date 2020/6/12 10:05
 * @Version 1.0
 */
public class OrangeFactory extends Factory {
    @Override
    Product factory() {
        return new Orange();
    }
}
