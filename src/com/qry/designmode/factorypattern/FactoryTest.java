package com.qry.designmode.factorypattern;

/**
 * @ClassName FactoryTest
 * @Package com.qry.designmode.factorypattern
 * @Description  简单工厂模式
 * @Author qurongyao
 * @Date 2020/6/11 17:09
 * @Version 1.0
 */
public class FactoryTest {
    public static void main(String[] args) {
       Provider  smsFactory = new SmsFactory();
       Sender produce = smsFactory.produce();
      // produce.send();

       Provider mailFactory = MailSender::new;
       Sender sender = mailFactory.produce();
       sender.send();
       Provider smsSender = SmsSender::new;
       smsSender.produce().send();

    }
}
