package com.qry.designmode.factorypattern.test3;

/**
 * @ClassName Factory
 * @Package com.qry.designmode.factorypattern.test3
 * @Description  抽象工厂类
 * @Author qurongyao
 * @Date 2020/6/12 10:09
 * @Version 1.0
 */
public interface Factory {
    Product factory();
}
/* 具体工厂类  Factory1*/
class Factory1 implements Factory{
    @Override
    public Product factory() {
        return new Product1();
    }
}

/* 具体工厂类  Factory2*/
class Factory2 implements Factory{
    @Override
    public Product factory() {
        return new Product2();
    }
}

/* 具体工厂类  Factory3*/
class Factory3 implements Factory{
    @Override
    public Product factory() {
        return new Product3();
    }
}
