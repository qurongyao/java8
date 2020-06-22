package com.qry.designmode.singletonpattern.test;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName DoubleCheck
 * @Package com.qry.designmode.singletonpattern.test
 * @Description  双检索
 * @Author qurongyao
 * @Date 2020/6/22 10:15
 * @Version 1.0
 */
public class DoubleCheck {
    private volatile static DoubleCheck instance;

    private DoubleCheck() {
    }

    /*
    *   双检锁，又叫双重校验锁，综合了懒汉式和饿汉式两者的优缺点整合而成。看上面代码实现中，
    *   特点是在synchronized关键字内外都加了一层 if 条件判断，这样既保证了线程安全，
    *   又比直接上锁提高了执行效率，还节省了内存空间。
    **/
    public static DoubleCheck getInstance() {
        if(instance == null){
            synchronized (DoubleCheck.class){
                if(instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<DoubleCheck> declaredConstructor = DoubleCheck.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        DoubleCheck lHan1 = (DoubleCheck)declaredConstructor.newInstance();
        DoubleCheck lHan2 = (DoubleCheck)declaredConstructor.newInstance();
        System.out.println(lHan1.equals(lHan2));
        LHan instance = LHan.getInstance();
        LHan instance1 = LHan.getInstance();

        System.out.println(instance.equals(instance1));
    }
}
