package com.qry.designmode.factorypattern;

/**
 * @ClassName Provider
 * @Package com.qry.designmode.factorypattern
 * @Description   抽象工厂类
 * @Author qurongyao
 * @Date 2020/6/11 19:01
 * @Version 1.0
 */

public interface Provider {
    Sender produce();
}
