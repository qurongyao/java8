package com.qry.designmode.factorypattern;

/**
 * @ClassName SmsFactory
 * @Package com.qry.designmode.factorypattern
 * @Description  具体工厂类
 * @Author qurongyao
 * @Date 2020/6/11 19:03
 * @Version 1.0
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
