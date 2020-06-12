package com.qry.designmode.factorypattern.test3;

/**
 * @ClassName Test
 * @Package com.qry.designmode.factorypattern.test3
 * @Description  工厂方法模式：
 *                          一个抽象工厂可以派生多个具体工厂
 *                          一个抽象商品可以派生多个具体产品
 *                          但是：
 *                              一个具体工厂只能对应一个具体产品
 *                       好处：
 *                          新增一种产品时，只需要增加相应的具体产品类和相应的工厂类
 * @Author qurongyao
 * @Date 2020/6/12 10:16
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product1();
        product.product();

        new Factory1().factory().product();



       // Factory factory = Product1::new;
        Factory factory = new Factory1();
        Product product1 = factory.factory();
        product1.product();
    }
}
