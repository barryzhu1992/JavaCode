package cn.itcast.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;


/**
 * @author : zhuyuesong
 * create at:  2019-12-30  09:18
 * @description:
 */
public class ReflectTest {
    /**
     * 可以创建任意类的对象，可以执行任意方法
      前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
     */
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1创建properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，生产一个集合，获取class下配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2.获取配置文件定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载该类进内存
        Class cla = Class.forName(className);
        //4.创建该类的对象
        Object object = cla.newInstance();
        //5.获取该类的方法对象
        Method method = cla.getMethod(methodName);
        //6.使用该类的方法
        method.invoke(object);

    }


}
