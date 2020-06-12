package com.qry.designmode.factorypattern.test1;

/**
 * @ClassName AppleSell
 * @Package com.qry.designmode.factorypattern.test1
 * @Description  苹果贩卖商  抽象产品类
 * @Author qurongyao
 * @Date 2020/6/12 9:23
 * @Version 1.0
 */
public class AppleSell implements SellGoods{
    @Override
    public void sell() {
        System.out.println("苹果贩卖商----卖苹果");
    }
}
