package com.qry.designmode.factorypattern.test;

/**
 * @ClassName AppleFactory
 * @Package com.qry.designmode.factorypattern.test
 * @Description
 * @Author qurongyao
 * @Date 2020/6/11 19:34
 * @Version 1.0
 */
public class AppleFactory implements Consumer{
    @Override
    public Coster buyFruits() {
        return new AppleCoster();
    }
}
