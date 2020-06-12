package com.qry.designmode.factorypattern.test3;

/**
 * @ClassName Product
 * @Package com.qry.designmode.factorypattern.test3
 * @Description  抽象产品类
 * @Author qurongyao
 * @Date 2020/6/12 10:09
 * @Version 1.0
 */
public interface Product {
    void product();
}
/* 具体产品类 Product1 */
class Product1 implements Product {

    @Override
    public void product() {
        System.out.println("具体产品类  Product1");
    }
}

/* 具体产品类 Product2 */
class Product2 implements Product {

    @Override
    public void product() {
        System.out.println("具体产品类  Product2");
    }
}

/* 具体产品类 Product3 */
class Product3 implements Product {

    @Override
    public void product() {
        System.out.println("具体产品类  Product3");
    }
}