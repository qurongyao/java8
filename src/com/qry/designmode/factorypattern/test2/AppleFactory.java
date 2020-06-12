package com.qry.designmode.factorypattern.test2;

/**
 * @ClassName AppleFactory
 * @Package com.qry.designmode.factorypattern.test2
 * @Description   具体工厂类
 * @Author qurongyao
 * @Date 2020/6/12 10:02
 * @Version 1.0
 */
public class AppleFactory extends Factory {
    @Override
    Product factory() {
        return new Apple();
    }
}
