package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author : zhuyuesong
 * create at:  2019-12-29  19:21
 * @description: 使用Junit实现的测试类
 */
public class CalculatorTest {

    //申请资源，最先执行
    @Before
    public void start(){
        System.out.println("start......");
    }

    //释放资源，最后执行
    @After
    public void close(){
        System.out.println("close.....");
    }

    @Test
    public void testAdd(){
        System.out.println("add.........");
        Calculator cal = new Calculator();
        int result = cal.add(1,2);
        //断言
        Assert.assertEquals(3,result);
    }

    @Test
    public void testSub(){
        System.out.println("sub.........");
        Calculator cal = new Calculator();
        int result = cal.sub(3,2);
        //断言
        Assert.assertEquals(1,result);
    }
}
