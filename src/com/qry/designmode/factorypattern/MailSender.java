package com.qry.designmode.factorypattern;

/**
 * @ClassName MailSender
 * @Package com.qry.designmode.factorypattern
 * @Description  具体产品类
 * @Author qurongyao
 * @Date 2020/6/11 17:05
 * @Version 1.0
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender");
    }
}
