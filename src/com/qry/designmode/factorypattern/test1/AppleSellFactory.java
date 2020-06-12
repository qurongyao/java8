package com.qry.designmode.factorypattern.test1;

/**
 * @ClassName AppleSellFactory
 * @Package com.qry.designmode.factorypattern.test1
 * @Description
 * @Author qurongyao
 * @Date 2020/6/12 9:25
 * @Version 1.0
 */
public class AppleSellFactory implements Sell{
    @Override
    public SellGoods sell() {
        return new AppleSell();
    }
}
