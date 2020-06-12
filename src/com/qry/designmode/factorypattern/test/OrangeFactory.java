package com.qry.designmode.factorypattern.test;

/**
 * @ClassName OrangeFactory
 * @Package com.qry.designmode.factorypattern.test
 * @Description
 * @Author qurongyao
 * @Date 2020/6/11 19:46
 * @Version 1.0
 */
public class OrangeFactory implements Consumer {
    @Override
    public Coster buyFruits() {
        return new OrangeCoster();
    }
}
