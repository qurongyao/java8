package com.qry.designmode.factorypattern;

/**
 * @ClassName MailFactory
 * @Package com.qry.designmode.factorypattern
 * @Description  具体工厂类
 * @Author qurongyao
 * @Date 2020/6/11 19:02
 * @Version 1.0
 */
public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
