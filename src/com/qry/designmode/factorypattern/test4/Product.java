package com.qry.designmode.factorypattern.test4;

/**
 * @ClassName Product
 * @Package com.qry.designmode.factorypattern.test4
 * @Description
 * @Author qurongyao
 * @Date 2020/6/12 10:30
 * @Version 1.0
 */
//  抽象产品类
public interface Product {
    void product();
}
/* 具体产品类 Product1 */
class Product1 implements Product{

    @Override
    public void product() {
        System.out.println("具体产品类 Product1");
    }
}

/* 具体产品类 Product2 */
class Product2 implements Product{

    @Override
    public void product() {
        System.out.println("具体产品类 Product2");
    }
}
/* 工厂 */
class Factory{
    public static Product factory1(){
        return new Product1();
    }
    public static Product factory2(){
        return new Product2();
    }
}
class Test{
    public static void main(String[] args) {
        Product product = Factory.factory1();
        product.product();
        Product product1 = Factory.factory2();
        product1.product();
    }
}